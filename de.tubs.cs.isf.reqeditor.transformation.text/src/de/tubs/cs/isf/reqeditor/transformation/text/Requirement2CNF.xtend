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
import de.tubs.cs.isf.requirementseditor.NestableExpression
import de.tubs.cs.isf.requirementseditor.TwoOperandsExpression
import java.util.Map
import java.util.Set

class Requirement2CNF {
	
	val static reFactory = RequirementsEditorFactory.eINSTANCE
	
	def static convertToCNF(RequirementsModel model) {
		val List<Expression> list = model.elements.map[collectExpressions].flatten.toList
		System.out.println(list)
		//val Expression expr = model.elements.map[constraints].flatten.map[expression].flatten.reduce[l,r| (reFactory.createAND =>
		val Expression expr = list.reduce[Expression l, Expression r| (reFactory.createAND => 
			[
				operand1 = l.detachedCopy
				operand2 = r.detachedCopy
			]) as Expression
		]
		
		val nnf = toNNF(expr)
		val Expression cnf = toCNF(nnf)
		val vars = newArrayList
		if (expr != null) {
			vars.addAll(cnf.literalElements)
		}
		
		var List<Expression> clauses = newArrayList(cnf)
		val numVars = vars.size
		if (cnf instanceof AND) {
			clauses = conjunctionTermList(cnf as AND)
		}
		
		//val Map<RequirementModelElement, Integer> idMapping = newHashMap()
		
		val date = java.text.DateFormat.dateTimeInstance.format(new java.util.Date)
		
		'''
		c DIMACS CNF Formatted Sat Problem
		c Generated with de.tu-bs.cs.isf.reqeditor
		c On «date»
		c For Model «model.name» Version «model.version»
		c Created by «model.creator»
		c
		«IF expr == null»
			c Model has no constraints
			p cnf 0 0
		«ELSE»
			p cnf «numVars» «clauses.size»
			«FOR clause : clauses»
				«print(clause, vars)» 0
			«ENDFOR»
		«ENDIF»
		'''		
	}
	
	def static private Set<RequirementModelElement> literalElements(Expression expression) {
		if (expression instanceof Literal) {
			return newHashSet(expression.element)
		} else if (expression instanceof NestableExpression) {
			val set = literalElements(expression.operand1)
			if (expression instanceof TwoOperandsExpression) {
				set.addAll(expression.operand2.literalElements)
			}
			return set
		}
	}
	
	//def static private String print(Expression expression, Map<RequirementModelElement, Integer> ids) {
	def static private String print(Expression expression, List<RequirementModelElement> ids) {
		if (expression instanceof NOT) {
			val modelElement = ((expression as NOT).operand1 as Literal).element
			return '''-«ids.indexOf(modelElement) + 1» '''
		} else if (expression instanceof Literal) {
			val modelElement = (expression as Literal).element
			return ''' «ids.indexOf(modelElement) + 1» '''
		} else if (expression instanceof OR) {
			val or = expression as OR
			return '''«print(or.operand1, ids)»«print(or.operand2, ids)»'''
		} else {
			throw new IllegalStateException
		}
	}
	
	def static private Expression toCNF(Expression expression) {
		if (expression == null) {
			return null
		}
		// recursively creates a CNF for the given Expression
		if (expression instanceof Literal) {
			return expression.detachedCopy
		}
		//val nnf = toNNF(expression)
		// already done before calling toCNF
		val nnf = expression
		if (nnf instanceof NOT) {
			// negated Literal is in NNF => atom
			return nnf.detachedCopy
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
						operand1 = l.detachedCopy
						operand2 = r.detachedCopy
					]
				}
			}
			if (conjugationOfDisjunctions.size == 1) {
				return conjugationOfDisjunctions.get(0);
			}
			return conjugationOfDisjunctions.reduce[l, r| (reFactory.createAND => [operand1=l.detachedCopy; operand2=r.detachedCopy]) as Expression]
		}
	}
	
	def static private Expression toNNF(Expression expression) {
		// recursively creates a NNF for the given Expression
		if (expression == null) {
			return null
		} else if (expression instanceof Literal) {
			return expression.detachedCopy
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
				return expression.detachedCopy
			} else if (negatedExpression instanceof NOT) {
				return toNNF(negatedExpression.operand1)
			} else if (negatedExpression instanceof AND) {
				val and = negatedExpression as AND
				val op1 = and.operand1.detachedCopy
				val op2 = and.operand2.detachedCopy
				return reFactory.createOR => [
					operand1 = toNNF(reFactory.createNOT => [
						operand1 = op1
					])
					operand2 = toNNF(reFactory.createNOT => [
						operand1 = op2
					])
				]
			} else if (negatedExpression instanceof OR) {
				val or = negatedExpression as OR
				return reFactory.createAND => [
					operand1 = toNNF(reFactory.createNOT => [
						operand1 = or.operand1.detachedCopy
					])
					operand2 = toNNF(reFactory.createNOT => [
						operand1 = or.operand2.detachedCopy
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
			val List<Expression> subExpressions = (element as RequirementsGroup).elements.map[collectExpressions].flatten.toList
			list.addAll(subExpressions)
		}
		list
	}
	
	def static private Expression detachedCopy(Expression expression){
		val newExpr = reFactory.create(expression.eClass) as Expression
		if (expression instanceof Literal) {
			(newExpr as Literal).element = expression.element
		} else if (expression instanceof NestableExpression) {
			(newExpr as NestableExpression).operand1 = expression.operand1
			if (expression instanceof TwoOperandsExpression) {
				(newExpr as TwoOperandsExpression).operand2 = expression.operand2
			}
		}
		newExpr
	}
}
