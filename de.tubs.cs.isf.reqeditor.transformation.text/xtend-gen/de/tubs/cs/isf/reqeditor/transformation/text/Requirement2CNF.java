package de.tubs.cs.isf.reqeditor.transformation.text;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.tubs.cs.isf.requirementseditor.AND;
import de.tubs.cs.isf.requirementseditor.Constraint;
import de.tubs.cs.isf.requirementseditor.Expression;
import de.tubs.cs.isf.requirementseditor.Literal;
import de.tubs.cs.isf.requirementseditor.NOT;
import de.tubs.cs.isf.requirementseditor.NestableExpression;
import de.tubs.cs.isf.requirementseditor.OR;
import de.tubs.cs.isf.requirementseditor.RequirementModelElement;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsGroup;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;
import de.tubs.cs.isf.requirementseditor.TwoOperandsExpression;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Requirement2CNF {
  private final static RequirementsEditorFactory reFactory = RequirementsEditorFactory.eINSTANCE;
  
  public static CharSequence convertToCNF(final RequirementsModel model) {
    CharSequence _xblockexpression = null;
    {
      EList<RequirementModelElement> _elements = model.getElements();
      final Function1<RequirementModelElement, List<Expression>> _function = (RequirementModelElement it) -> {
        return Requirement2CNF.collectExpressions(it);
      };
      List<List<Expression>> _map = ListExtensions.<RequirementModelElement, List<Expression>>map(_elements, _function);
      Iterable<Expression> _flatten = Iterables.<Expression>concat(_map);
      final List<Expression> list = IterableExtensions.<Expression>toList(_flatten);
      System.out.println(list);
      final Function2<Expression, Expression, Expression> _function_1 = (Expression l, Expression r) -> {
        AND _createAND = Requirement2CNF.reFactory.createAND();
        final Procedure1<AND> _function_2 = (AND it) -> {
          Expression _detachedCopy = Requirement2CNF.detachedCopy(l);
          it.setOperand1(_detachedCopy);
          Expression _detachedCopy_1 = Requirement2CNF.detachedCopy(r);
          it.setOperand2(_detachedCopy_1);
        };
        AND _doubleArrow = ObjectExtensions.<AND>operator_doubleArrow(_createAND, _function_2);
        return ((Expression) _doubleArrow);
      };
      final Expression expr = IterableExtensions.<Expression>reduce(list, _function_1);
      final Expression nnf = Requirement2CNF.toNNF(expr);
      final Expression cnf = Requirement2CNF.toCNF(nnf);
      List<Expression> clauses = CollectionLiterals.<Expression>newArrayList(cnf);
      Set<RequirementModelElement> _literalElements = Requirement2CNF.literalElements(cnf);
      final List<RequirementModelElement> vars = IterableExtensions.<RequirementModelElement>toList(_literalElements);
      final int numVars = vars.size();
      if ((cnf instanceof AND)) {
        List<Expression> _conjunctionTermList = Requirement2CNF.conjunctionTermList(((AND) cnf));
        clauses = _conjunctionTermList;
      }
      DateFormat _dateTimeInstance = DateFormat.getDateTimeInstance();
      Date _date = new Date();
      final String date = _dateTimeInstance.format(_date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("c DIMACS CNF Formatted Sat Problem");
      _builder.newLine();
      _builder.append("c Generated with de.tu-bs.cs.isf.reqeditor");
      _builder.newLine();
      _builder.append("c On ");
      _builder.append(date, "");
      _builder.newLineIfNotEmpty();
      _builder.append("c For Model ");
      String _name = model.getName();
      _builder.append(_name, "");
      _builder.append(" Version ");
      String _version = model.getVersion();
      _builder.append(_version, "");
      _builder.newLineIfNotEmpty();
      _builder.append("c Created by ");
      String _creator = model.getCreator();
      _builder.append(_creator, "");
      _builder.newLineIfNotEmpty();
      _builder.append("c");
      _builder.newLine();
      {
        boolean _equals = Objects.equal(cnf, null);
        if (_equals) {
          _builder.append("c Model has no constraints");
          _builder.newLine();
          _builder.append("p cnf 0 0");
          _builder.newLine();
        } else {
          _builder.append("p cnf ");
          _builder.append(numVars, "");
          _builder.append(" ");
          int _size = clauses.size();
          _builder.append(_size, "");
          _builder.newLineIfNotEmpty();
          {
            for(final Expression clause : clauses) {
              _builder.append("c ");
              String _print = Requirement2CNF.print(clause, vars);
              _builder.append(_print, "");
              _builder.append(" 0");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private static Set<RequirementModelElement> literalElements(final Expression expression) {
    if ((expression instanceof Literal)) {
      RequirementModelElement _element = ((Literal)expression).getElement();
      return CollectionLiterals.<RequirementModelElement>newHashSet(_element);
    } else {
      if ((expression instanceof NestableExpression)) {
        Expression _operand1 = ((NestableExpression)expression).getOperand1();
        final Set<RequirementModelElement> set = Requirement2CNF.literalElements(_operand1);
        if ((expression instanceof TwoOperandsExpression)) {
          Expression _operand2 = ((TwoOperandsExpression)expression).getOperand2();
          Set<RequirementModelElement> _literalElements = Requirement2CNF.literalElements(_operand2);
          set.addAll(_literalElements);
        }
        return set;
      }
    }
    return null;
  }
  
  private static String print(final Expression expression, final List<RequirementModelElement> ids) {
    if ((expression instanceof NOT)) {
      Expression _operand1 = ((NOT) expression).getOperand1();
      final RequirementModelElement modelElement = ((Literal) _operand1).getElement();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-");
      int _indexOf = ids.indexOf(modelElement);
      int _plus = (_indexOf + 1);
      _builder.append(_plus, "");
      _builder.append(" ");
      return _builder.toString();
    } else {
      if ((expression instanceof Literal)) {
        final RequirementModelElement modelElement_1 = ((Literal) expression).getElement();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(" ");
        int _indexOf_1 = ids.indexOf(modelElement_1);
        int _plus_1 = (_indexOf_1 + 1);
        _builder_1.append(_plus_1, " ");
        _builder_1.append(" ");
        return _builder_1.toString();
      } else {
        if ((expression instanceof OR)) {
          final OR or = ((OR) expression);
          StringConcatenation _builder_2 = new StringConcatenation();
          Expression _operand1_1 = or.getOperand1();
          String _print = Requirement2CNF.print(_operand1_1, ids);
          _builder_2.append(_print, "");
          Expression _operand2 = or.getOperand2();
          String _print_1 = Requirement2CNF.print(_operand2, ids);
          _builder_2.append(_print_1, "");
          return _builder_2.toString();
        } else {
          throw new IllegalStateException();
        }
      }
    }
  }
  
  private static Expression toCNF(final Expression expression) {
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      return null;
    }
    if ((expression instanceof Literal)) {
      return Requirement2CNF.detachedCopy(expression);
    }
    final Expression nnf = expression;
    if ((nnf instanceof NOT)) {
      return Requirement2CNF.detachedCopy(nnf);
    } else {
      if ((nnf instanceof AND)) {
        final AND and = ((AND) nnf);
        AND _createAND = Requirement2CNF.reFactory.createAND();
        final Procedure1<AND> _function = (AND it) -> {
          Expression _operand1 = and.getOperand1();
          Expression _cNF = Requirement2CNF.toCNF(_operand1);
          it.setOperand1(_cNF);
          Expression _operand2 = and.getOperand2();
          Expression _cNF_1 = Requirement2CNF.toCNF(_operand2);
          it.setOperand2(_cNF_1);
        };
        return ObjectExtensions.<AND>operator_doubleArrow(_createAND, _function);
      } else {
        if ((nnf instanceof OR)) {
          final OR or = ((OR) nnf);
          Expression _operand1 = or.getOperand1();
          final Expression left = Requirement2CNF.toCNF(_operand1);
          Expression _operand2 = or.getOperand2();
          final Expression right = Requirement2CNF.toCNF(_operand2);
          List<Expression> leftList = CollectionLiterals.<Expression>newArrayList(left);
          List<Expression> rightList = CollectionLiterals.<Expression>newArrayList(right);
          if ((left instanceof AND)) {
            List<Expression> _conjunctionTermList = Requirement2CNF.conjunctionTermList(((AND) left));
            leftList = _conjunctionTermList;
          }
          if ((right instanceof AND)) {
            List<Expression> _conjunctionTermList_1 = Requirement2CNF.conjunctionTermList(((AND) right));
            rightList = _conjunctionTermList_1;
          }
          List<Expression> conjugationOfDisjunctions = CollectionLiterals.<Expression>newArrayList();
          for (final Expression l : leftList) {
            for (final Expression r : rightList) {
              OR _createOR = Requirement2CNF.reFactory.createOR();
              final Procedure1<OR> _function_1 = (OR it) -> {
                Expression _detachedCopy = Requirement2CNF.detachedCopy(l);
                it.setOperand1(_detachedCopy);
                Expression _detachedCopy_1 = Requirement2CNF.detachedCopy(r);
                it.setOperand2(_detachedCopy_1);
              };
              OR _doubleArrow = ObjectExtensions.<OR>operator_doubleArrow(_createOR, _function_1);
              conjugationOfDisjunctions.add(_doubleArrow);
            }
          }
          int _size = conjugationOfDisjunctions.size();
          boolean _equals_1 = (_size == 1);
          if (_equals_1) {
            return conjugationOfDisjunctions.get(0);
          }
          final Function2<Expression, Expression, Expression> _function_2 = (Expression l_1, Expression r_1) -> {
            AND _createAND_1 = Requirement2CNF.reFactory.createAND();
            final Procedure1<AND> _function_3 = (AND it) -> {
              Expression _detachedCopy = Requirement2CNF.detachedCopy(l_1);
              it.setOperand1(_detachedCopy);
              Expression _detachedCopy_1 = Requirement2CNF.detachedCopy(r_1);
              it.setOperand2(_detachedCopy_1);
            };
            AND _doubleArrow_1 = ObjectExtensions.<AND>operator_doubleArrow(_createAND_1, _function_3);
            return ((Expression) _doubleArrow_1);
          };
          return IterableExtensions.<Expression>reduce(conjugationOfDisjunctions, _function_2);
        }
      }
    }
    return null;
  }
  
  private static Expression toNNF(final Expression expression) {
    if ((expression instanceof Literal)) {
      return Requirement2CNF.detachedCopy(expression);
    } else {
      if ((expression instanceof AND)) {
        final AND and = ((AND) expression);
        AND _createAND = Requirement2CNF.reFactory.createAND();
        final Procedure1<AND> _function = (AND it) -> {
          Expression _operand1 = and.getOperand1();
          Expression _nNF = Requirement2CNF.toNNF(_operand1);
          it.setOperand1(_nNF);
          Expression _operand2 = and.getOperand2();
          Expression _nNF_1 = Requirement2CNF.toNNF(_operand2);
          it.setOperand2(_nNF_1);
        };
        return ObjectExtensions.<AND>operator_doubleArrow(_createAND, _function);
      } else {
        if ((expression instanceof OR)) {
          final OR or = ((OR) expression);
          OR _createOR = Requirement2CNF.reFactory.createOR();
          final Procedure1<OR> _function_1 = (OR it) -> {
            Expression _operand1 = or.getOperand1();
            Expression _nNF = Requirement2CNF.toNNF(_operand1);
            it.setOperand1(_nNF);
            Expression _operand2 = or.getOperand2();
            Expression _nNF_1 = Requirement2CNF.toNNF(_operand2);
            it.setOperand2(_nNF_1);
          };
          return ObjectExtensions.<OR>operator_doubleArrow(_createOR, _function_1);
        } else {
          if ((expression instanceof NOT)) {
            Expression negatedExpression = ((NOT) expression).getOperand1();
            if ((negatedExpression instanceof Literal)) {
              return Requirement2CNF.detachedCopy(expression);
            } else {
              if ((negatedExpression instanceof NOT)) {
                Expression _operand1 = ((NOT)negatedExpression).getOperand1();
                return Requirement2CNF.toNNF(_operand1);
              } else {
                if ((negatedExpression instanceof AND)) {
                  final AND and_1 = ((AND) negatedExpression);
                  Expression _operand1_1 = and_1.getOperand1();
                  final Expression op1 = Requirement2CNF.detachedCopy(_operand1_1);
                  Expression _operand2 = and_1.getOperand2();
                  final Expression op2 = Requirement2CNF.detachedCopy(_operand2);
                  OR _createOR_1 = Requirement2CNF.reFactory.createOR();
                  final Procedure1<OR> _function_2 = (OR it) -> {
                    NOT _createNOT = Requirement2CNF.reFactory.createNOT();
                    final Procedure1<NOT> _function_3 = (NOT it_1) -> {
                      it_1.setOperand1(op1);
                    };
                    NOT _doubleArrow = ObjectExtensions.<NOT>operator_doubleArrow(_createNOT, _function_3);
                    Expression _nNF = Requirement2CNF.toNNF(_doubleArrow);
                    it.setOperand1(_nNF);
                    NOT _createNOT_1 = Requirement2CNF.reFactory.createNOT();
                    final Procedure1<NOT> _function_4 = (NOT it_1) -> {
                      it_1.setOperand1(op2);
                    };
                    NOT _doubleArrow_1 = ObjectExtensions.<NOT>operator_doubleArrow(_createNOT_1, _function_4);
                    Expression _nNF_1 = Requirement2CNF.toNNF(_doubleArrow_1);
                    it.setOperand2(_nNF_1);
                  };
                  return ObjectExtensions.<OR>operator_doubleArrow(_createOR_1, _function_2);
                } else {
                  if ((negatedExpression instanceof OR)) {
                    final OR or_1 = ((OR) negatedExpression);
                    AND _createAND_1 = Requirement2CNF.reFactory.createAND();
                    final Procedure1<AND> _function_3 = (AND it) -> {
                      NOT _createNOT = Requirement2CNF.reFactory.createNOT();
                      final Procedure1<NOT> _function_4 = (NOT it_1) -> {
                        Expression _operand1_2 = or_1.getOperand1();
                        Expression _detachedCopy = Requirement2CNF.detachedCopy(_operand1_2);
                        it_1.setOperand1(_detachedCopy);
                      };
                      NOT _doubleArrow = ObjectExtensions.<NOT>operator_doubleArrow(_createNOT, _function_4);
                      Expression _nNF = Requirement2CNF.toNNF(_doubleArrow);
                      it.setOperand1(_nNF);
                      NOT _createNOT_1 = Requirement2CNF.reFactory.createNOT();
                      final Procedure1<NOT> _function_5 = (NOT it_1) -> {
                        Expression _operand2_1 = or_1.getOperand2();
                        Expression _detachedCopy = Requirement2CNF.detachedCopy(_operand2_1);
                        it_1.setOperand1(_detachedCopy);
                      };
                      NOT _doubleArrow_1 = ObjectExtensions.<NOT>operator_doubleArrow(_createNOT_1, _function_5);
                      Expression _nNF_1 = Requirement2CNF.toNNF(_doubleArrow_1);
                      it.setOperand2(_nNF_1);
                    };
                    return ObjectExtensions.<AND>operator_doubleArrow(_createAND_1, _function_3);
                  }
                }
              }
            }
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Argument ");
    _builder.append(expression, "");
    _builder.append("  not one of [Literal, AND, NOT, OR]");
    throw new IllegalArgumentException(_builder.toString());
  }
  
  private static List<Expression> conjunctionTermList(final AND and) {
    ArrayList<Expression> _xblockexpression = null;
    {
      ArrayList<Expression> list = new ArrayList<Expression>();
      Expression _operand1 = and.getOperand1();
      if ((_operand1 instanceof AND)) {
        Expression _operand1_1 = and.getOperand1();
        List<Expression> _conjunctionTermList = Requirement2CNF.conjunctionTermList(((AND) _operand1_1));
        list.addAll(_conjunctionTermList);
      } else {
        Expression _operand1_2 = and.getOperand1();
        list.add(_operand1_2);
      }
      Expression _operand2 = and.getOperand2();
      if ((_operand2 instanceof AND)) {
        Expression _operand2_1 = and.getOperand2();
        List<Expression> _conjunctionTermList_1 = Requirement2CNF.conjunctionTermList(((AND) _operand2_1));
        list.addAll(_conjunctionTermList_1);
      } else {
        Expression _operand2_2 = and.getOperand2();
        list.add(_operand2_2);
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  private static List<Expression> collectExpressions(final RequirementModelElement element) {
    List<Expression> _xblockexpression = null;
    {
      EList<Constraint> _constraints = element.getConstraints();
      final Function1<Constraint, EList<Expression>> _function = (Constraint it) -> {
        return it.getExpression();
      };
      List<EList<Expression>> _map = ListExtensions.<Constraint, EList<Expression>>map(_constraints, _function);
      Iterable<Expression> _flatten = Iterables.<Expression>concat(_map);
      List<Expression> list = IterableExtensions.<Expression>toList(_flatten);
      if ((element instanceof RequirementsGroup)) {
        EList<RequirementModelElement> _elements = ((RequirementsGroup) element).getElements();
        final Function1<RequirementModelElement, List<Expression>> _function_1 = (RequirementModelElement it) -> {
          return Requirement2CNF.collectExpressions(it);
        };
        List<List<Expression>> _map_1 = ListExtensions.<RequirementModelElement, List<Expression>>map(_elements, _function_1);
        Iterable<Expression> _flatten_1 = Iterables.<Expression>concat(_map_1);
        final List<Expression> subExpressions = IterableExtensions.<Expression>toList(_flatten_1);
        list.addAll(subExpressions);
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  private static Expression detachedCopy(final Expression expression) {
    Expression _xblockexpression = null;
    {
      EClass _eClass = expression.eClass();
      EObject _create = Requirement2CNF.reFactory.create(_eClass);
      final Expression newExpr = ((Expression) _create);
      if ((expression instanceof Literal)) {
        RequirementModelElement _element = ((Literal)expression).getElement();
        ((Literal) newExpr).setElement(_element);
      } else {
        if ((expression instanceof NestableExpression)) {
          Expression _operand1 = ((NestableExpression)expression).getOperand1();
          ((NestableExpression) newExpr).setOperand1(_operand1);
          if ((expression instanceof TwoOperandsExpression)) {
            Expression _operand2 = ((TwoOperandsExpression)expression).getOperand2();
            ((TwoOperandsExpression) newExpr).setOperand2(_operand2);
          }
        }
      }
      _xblockexpression = newExpr;
    }
    return _xblockexpression;
  }
}
