package de.tubs.cs.isf.reqeditor.administration

import org.eclipse.xtext.xtext.generator.XtextGenerator
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

class Requirement2CNF extends XtextGenerator {
	
	val static reFactory = RequirementsEditorFactory.eINSTANCE
	
	def convertToCNF(RequirementsModel model) {
		var Expression cnf = model.elements.map[constraints].flatten.map[expression].flatten.reduce[l,r| (reFactory.createAND =>
			[
				operand1 = l
				operand2 = r
			]) as Expression
		]
		
		var List<Expression> clauses = newArrayList(cnf)
		val numVars = model.elements.size
		if (cnf instanceof AND) {
			clauses = conjunctionTermList(cnf as AND)
		}
		
		val HashMap<Expression, Integer> idMapping = newHashMap()
		
		val date = java.text.DateFormat.dateTimeInstance.format(new java.util.Date)
		
		'''
		c DIMACS CNF Formatted Sat Problem
		c Generated with de.tu-bs.cs.isf.reqeditor
		c On «date»
		c For Model «model.name» Version «model.version»
		c Created by «model.creator»
		c
		p cnf «numVars» «clauses.size»
		«FOR clause : clauses»
			c «print(clause, idMapping)» 0
		«ENDFOR»
		'''		
	}
	
	def private String print(Expression expression, HashMap<Expression, Integer> ids) {
		if (expression instanceof NOT) {
			ids.putIfAbsent(expression, ids.size +1)
			return '''-«ids.get(expression)» '''
		} else if (expression instanceof Literal) {
			ids.putIfAbsent(expression, ids.size +1)
			return '''«ids.get(expression)» '''
		} else if (expression instanceof OR) {
			val or = expression as OR
			return '''«print(or.operand1, ids)» «print(or.operand2, ids)» '''
		} else {
			throw new IllegalStateException
		}
	}
	
	def private Expression toCNF(Expression expression) {
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
	
	def private Expression toNNF(Expression expression) {
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
		throw new IllegalArgumentException
	}
	
	def private List<Expression> conjunctionTermList(AND and) {
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
}