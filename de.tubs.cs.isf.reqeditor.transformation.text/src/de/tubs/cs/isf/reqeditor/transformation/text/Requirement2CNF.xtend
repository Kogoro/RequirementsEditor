package de.tubs.cs.isf.reqeditor.transformation.text

import de.tubs.cs.isf.requirementseditor.Expression
import de.tubs.cs.isf.requirementseditor.Literal
import de.tubs.cs.isf.requirementseditor.NOT
import de.tubs.cs.isf.requirementseditor.AND
import de.tubs.cs.isf.requirementseditor.OR
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory
import java.util.ArrayList
import java.util.List
import de.tubs.cs.isf.requirementseditor.RequirementsModel
import java.util.HashMap
import de.tubs.cs.isf.requirementseditor.RequirementModelElement
import de.tubs.cs.isf.requirementseditor.RequirementsGroup

class Requirement2CNF {
	
	val static reFactory = RequirementsEditorFactory.eINSTANCE
	
	def static convertToCNF(RequirementsModel model) {
		val List<Expression> list = model.elements.map[collectExpressions].flatten.toList
//		val Expression expr = model.elements.map[constraints].flatten.map[expression].flatten.reduce[l,r| (reFactory.createAND =>
		val Expression expr = list.reduce[l,r| (reFactory.createAND =>
			[
				operand1 = l
				operand2 = r
			]) as Expression
		]
		
		val Expression cnf = toCNF(expr)
		
		var List<Expression> clauses = newArrayList(cnf)
		val numVars = model.elements.size
		if (cnf instanceof AND) {
			clauses = conjunctionTermList(cnf as AND)
		}
		
		val HashMap<RequirementModelElement, Integer> idMapping = newHashMap()
		
		val date = java.text.DateFormat.dateTimeInstance.format(new java.util.Date)
		
		'''
		c DIMACS CNF Formatted Sat Problem
		c Generated with de.tu-bs.cs.isf.reqeditor
		c On «date»
		c For Model «model.name» Version «model.version»
		c Created by «model.creator»
		c
		«IF cnf == null»
			c Model has no constraints
			p cnf 0 0
		«ELSE»
			p cnf «numVars» «clauses.size»
			«FOR clause : clauses»
				c «print(clause, idMapping)» 0
			«ENDFOR»
		«ENDIF»
		'''		
	}
	
	def static private String print(Expression expression, HashMap<RequirementModelElement, Integer> ids) {
		if (expression instanceof NOT) {
			val modelElement = ((expression as NOT).operand1 as Literal).element
			ids.putIfAbsent(modelElement, ids.size +1)
			return '''-«ids.get(expression)» '''
		} else if (expression instanceof Literal) {
			val modelElement = (expression as Literal).element
			ids.putIfAbsent(modelElement, ids.size +1)
			return '''«ids.get(expression)» '''
		} else if (expression instanceof OR) {
			val or = expression as OR
			return '''«print(or.operand1, ids)» «print(or.operand2, ids)» '''
		} else {
			throw new IllegalStateException
		}
	}
	
	def static private Expression toCNF(Expression expression) {
		// recursively creates a CNF for the given Expression
		if (expression instanceof Literal) {
			return expression
		}
		val nnf = toNNF(expression)
		if (nnf instanceof NOT) {
			// negated Literal is in NNF => atom
			return nnf
		} else if (nnf instanceof AND) {
			val and = nnf as AND
			return reFactory.createAND => [
				operand1 = toCNF(and.operand1)
				operand2 = toCNF(and.operand2)
			]
		} else if (nnf instanceof OR) {
			val or = nnf as OR
			val left = toCNF(or.operand1)
			val right = toCNF(or.operand2)
			var List<Expression> leftList = newArrayList(left) 
			var List<Expression> rightList = newArrayList(right)
			if (left instanceof AND) {
				leftList = conjunctionTermList(left as AND)
			}
			if (right instanceof AND) {
				rightList = conjunctionTermList(right as AND)
			}
			var List<Expression> conjugationOfDisjunctions = newArrayList()
			for (l : leftList) {
				for (r : rightList) {
					conjugationOfDisjunctions += reFactory.createOR => [
						operand1 = l
						operand2 = r
					]
				}
			}
			conjugationOfDisjunctions.reduce[l, r| (reFactory.createAND => [operand1=l; operand2=r]) as Expression]
			or
		}
	}
	
	def static private Expression toNNF(Expression expression) {
		// recursively creates a NNF for the given Expression
		if (expression instanceof Literal) {
			return expression
		} else if (expression instanceof AND) {
			val and = expression as AND
			return reFactory.createAND =>[
				operand1 = toNNF(and.operand1)
				operand2 = toNNF(and.operand2)
			]
		} else if (expression instanceof OR) {
			val or = expression as OR
			return reFactory.createOR => [
				operand1 = toNNF(or.operand1)
				operand2 = toNNF(or.operand2)
			]
		} else if (expression instanceof NOT) {
			var negatedExpression = (expression as NOT).operand1
			if (negatedExpression instanceof Literal) {
				return expression
			} else if (negatedExpression instanceof NOT) {
				return toNNF(negatedExpression.operand1)
			} else if (negatedExpression instanceof AND) {
				val and = negatedExpression as AND
				return reFactory.createOR => [
					operand1 = toNNF(reFactory.createNOT => [
						and.operand1
					])
					operand2 = toNNF(reFactory.createNOT => [
						and.operand2
					])
				]
			} else if (negatedExpression instanceof OR) {
				val or = negatedExpression as OR
				return reFactory.createAND => [
					operand1 = toNNF(reFactory.createNOT => [
						or.operand1
					])
					operand2 = toNNF(reFactory.createNOT => [
						or.operand2
					])
				]
			}
		}
		throw new IllegalArgumentException('''Argument «expression»  not one of [Literal, AND, NOT, OR]''')
	}
	
	def static private List<Expression> conjunctionTermList(AND and) {
		var list = new ArrayList<Expression>
		if (and.operand1 instanceof AND) {
			list.addAll(conjunctionTermList(and.operand1 as AND))
		} else {
			list += and.operand1
		}
		if (and.operand2 instanceof AND) {
			list.addAll(conjunctionTermList(and.operand2 as AND))
		} else {
			list += and.operand2
		}
		list
	}
	
	def static private List<Expression> collectExpressions(RequirementModelElement element) {
		var list = element.constraints.map[expression].flatten.toList
		if (element instanceof RequirementsGroup) {
			list += (element as RequirementsGroup).elements.map[collectExpressions]
		}
		list
	}
}
