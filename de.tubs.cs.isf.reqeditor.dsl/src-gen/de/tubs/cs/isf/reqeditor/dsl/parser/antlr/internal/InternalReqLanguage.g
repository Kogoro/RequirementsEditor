/*
 * generated by Xtext 2.11.0
 */
grammar InternalReqLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.tubs.cs.isf.reqeditor.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.tubs.cs.isf.reqeditor.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tubs.cs.isf.reqeditor.dsl.services.ReqLanguageGrammarAccess;

}

@parser::members {

 	private ReqLanguageGrammarAccess grammarAccess;

    public InternalReqLanguageParser(TokenStream input, ReqLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RequirementsModel";
   	}

   	@Override
   	protected ReqLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRequirementsModel
entryRuleRequirementsModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequirementsModelRule()); }
	iv_ruleRequirementsModel=ruleRequirementsModel
	{ $current=$iv_ruleRequirementsModel.current; }
	EOF;

// Rule RequirementsModel
ruleRequirementsModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequirementsModelAccess().getRequirementsModelAction_0(),
					$current);
			}
		)
		otherlv_1='requirementsModel'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequirementsModelAccess().getRequirementsModelKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementsModelAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='created'
			{
				newLeafNode(otherlv_3, grammarAccess.getRequirementsModelAccess().getCreatedKeyword_3_0());
			}
			otherlv_4='by'
			{
				newLeafNode(otherlv_4, grammarAccess.getRequirementsModelAccess().getByKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsModelAccess().getCreatorEStringParserRuleCall_3_2_0());
					}
					lv_creator_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
						}
						set(
							$current,
							"creator",
							lv_creator_5_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='version'
			{
				newLeafNode(otherlv_6, grammarAccess.getRequirementsModelAccess().getVersionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsModelAccess().getVersionEStringParserRuleCall_4_1_0());
					}
					lv_version_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
						}
						set(
							$current,
							"version",
							lv_version_7_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='attributes'
			{
				newLeafNode(otherlv_8, grammarAccess.getRequirementsModelAccess().getAttributesKeyword_5_0());
			}
			otherlv_9='are'
			{
				newLeafNode(otherlv_9, grammarAccess.getRequirementsModelAccess().getAreKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_2_0());
					}
					lv_attributes_10_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_10_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11='and'
				{
					newLeafNode(otherlv_11, grammarAccess.getRequirementsModelAccess().getAndKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
						}
						lv_attributes_12_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_12_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_13='.'
			{
				newLeafNode(otherlv_13, grammarAccess.getRequirementsModelAccess().getFullStopKeyword_5_4());
			}
		)?
		(
			otherlv_14='requirements'
			{
				newLeafNode(otherlv_14, grammarAccess.getRequirementsModelAccess().getRequirementsKeyword_6_0());
			}
			otherlv_15='are'
			{
				newLeafNode(otherlv_15, grammarAccess.getRequirementsModelAccess().getAreKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_2_0());
					}
					lv_elements_16_0=ruleRequirementModelElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
						}
						add(
							$current,
							"elements",
							lv_elements_16_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17='and'
				{
					newLeafNode(otherlv_17, grammarAccess.getRequirementsModelAccess().getAndKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_3_1_0());
						}
						lv_elements_18_0=ruleRequirementModelElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
							}
							add(
								$current,
								"elements",
								lv_elements_18_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleRequirementModelElement
entryRuleRequirementModelElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequirementModelElementRule()); }
	iv_ruleRequirementModelElement=ruleRequirementModelElement
	{ $current=$iv_ruleRequirementModelElement.current; }
	EOF;

// Rule RequirementModelElement
ruleRequirementModelElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementsGroupParserRuleCall_0());
		}
		this_RequirementsGroup_0=ruleRequirementsGroup
		{
			$current = $this_RequirementsGroup_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementParserRuleCall_1());
		}
		this_Requirement_1=ruleRequirement
		{
			$current = $this_Requirement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getORParserRuleCall_0());
		}
		this_OR_0=ruleOR
		{
			$current = $this_OR_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getANDParserRuleCall_1());
		}
		this_AND_1=ruleAND
		{
			$current = $this_AND_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getNOTParserRuleCall_2());
		}
		this_NOT_2=ruleNOT
		{
			$current = $this_NOT_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_3());
		}
		this_Literal_3=ruleLiteral
		{
			$current = $this_Literal_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAttributeAccess().getAttributeAction_0(),
					$current);
			}
		)
		otherlv_1='attribute'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	iv_ruleConstraint=ruleConstraint
	{ $current=$iv_ruleConstraint.current; }
	EOF;

// Rule Constraint
ruleConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConstraintAccess().getConstraintAction_0(),
					$current);
			}
		)
		otherlv_1='constraint'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_3_0_0());
					}
					lv_expression_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstraintRule());
						}
						add(
							$current,
							"expression",
							lv_expression_3_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4='and'
				{
					newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getAndKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_3_1_1_0());
						}
						lv_expression_5_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConstraintRule());
							}
							add(
								$current,
								"expression",
								lv_expression_5_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleRequirementsGroup
entryRuleRequirementsGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequirementsGroupRule()); }
	iv_ruleRequirementsGroup=ruleRequirementsGroup
	{ $current=$iv_ruleRequirementsGroup.current; }
	EOF;

// Rule RequirementsGroup
ruleRequirementsGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequirementsGroupAccess().getRequirementsGroupAction_0(),
					$current);
			}
		)
		otherlv_1='requirementsGroup'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequirementsGroupAccess().getRequirementsGroupKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='id'
		{
			newLeafNode(otherlv_3, grammarAccess.getRequirementsGroupAccess().getIdKeyword_3());
		}
		otherlv_4='is'
		{
			newLeafNode(otherlv_4, grammarAccess.getRequirementsGroupAccess().getIsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getIdEStringParserRuleCall_5_0());
				}
				lv_id_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
					}
					set(
						$current,
						"id",
						lv_id_5_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='description'
			{
				newLeafNode(otherlv_6, grammarAccess.getRequirementsGroupAccess().getDescriptionKeyword_6_0());
			}
			otherlv_7='is'
			{
				newLeafNode(otherlv_7, grammarAccess.getRequirementsGroupAccess().getIsKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getDescriptionEStringParserRuleCall_6_2_0());
					}
					lv_description_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
						}
						set(
							$current,
							"description",
							lv_description_8_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='constraints'
			{
				newLeafNode(otherlv_9, grammarAccess.getRequirementsGroupAccess().getConstraintsKeyword_7_0());
			}
			otherlv_10='are'
			{
				newLeafNode(otherlv_10, grammarAccess.getRequirementsGroupAccess().getAreKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_2_0());
					}
					lv_constraints_11_0=ruleConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
						}
						add(
							$current,
							"constraints",
							lv_constraints_11_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12='and'
				{
					newLeafNode(otherlv_12, grammarAccess.getRequirementsGroupAccess().getAndKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_3_1_0());
						}
						lv_constraints_13_0=ruleConstraint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
							}
							add(
								$current,
								"constraints",
								lv_constraints_13_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='.'
			{
				newLeafNode(otherlv_14, grammarAccess.getRequirementsGroupAccess().getFullStopKeyword_7_4());
			}
		)?
		(
			otherlv_15='elements'
			{
				newLeafNode(otherlv_15, grammarAccess.getRequirementsGroupAccess().getElementsKeyword_8_0());
			}
			otherlv_16='are'
			{
				newLeafNode(otherlv_16, grammarAccess.getRequirementsGroupAccess().getAreKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_2_0());
					}
					lv_elements_17_0=ruleRequirementModelElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
						}
						add(
							$current,
							"elements",
							lv_elements_17_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18='and'
				{
					newLeafNode(otherlv_18, grammarAccess.getRequirementsGroupAccess().getAndKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_3_1_0());
						}
						lv_elements_19_0=ruleRequirementModelElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
							}
							add(
								$current,
								"elements",
								lv_elements_19_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20='.'
			{
				newLeafNode(otherlv_20, grammarAccess.getRequirementsGroupAccess().getFullStopKeyword_8_4());
			}
		)?
	)
;

// Entry rule entryRuleRequirement
entryRuleRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequirementRule()); }
	iv_ruleRequirement=ruleRequirement
	{ $current=$iv_ruleRequirement.current; }
	EOF;

// Rule Requirement
ruleRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRequirementAccess().getRequirementAction_0(),
					$current);
			}
		)
		otherlv_1='requirement'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='id'
		{
			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getIdKeyword_3());
		}
		otherlv_4='is'
		{
			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getIsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_5_0());
				}
				lv_id_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementRule());
					}
					set(
						$current,
						"id",
						lv_id_5_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='.'
		{
			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getFullStopKeyword_6());
		}
		(
			otherlv_7='description'
			{
				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getDescriptionKeyword_7_0());
			}
			otherlv_8='is'
			{
				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getIsKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_7_2_0());
					}
					lv_description_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementRule());
						}
						set(
							$current,
							"description",
							lv_description_9_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10='.'
			{
				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFullStopKeyword_7_3());
			}
		)?
		otherlv_11='type'
		{
			newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getTypeKeyword_8());
		}
		otherlv_12='is'
		{
			newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getIsKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementAccess().getTypeRequirementTypeEnumRuleCall_10_0());
				}
				lv_type_13_0=ruleRequirementType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementRule());
					}
					set(
						$current,
						"type",
						lv_type_13_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='.'
		{
			newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getFullStopKeyword_11());
		}
		otherlv_15='priority'
		{
			newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getPriorityKeyword_12());
		}
		otherlv_16='is'
		{
			newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getIsKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRequirementAccess().getPriorityRequirementPriorityEnumRuleCall_14_0());
				}
				lv_priority_17_0=ruleRequirementPriority
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequirementRule());
					}
					set(
						$current,
						"priority",
						lv_priority_17_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementPriority");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18='.'
		{
			newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getFullStopKeyword_15());
		}
		(
			otherlv_19='constraints'
			{
				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getConstraintsKeyword_16_0());
			}
			otherlv_20='are'
			{
				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getAreKeyword_16_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_2_0());
					}
					lv_constraints_21_0=ruleConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementRule());
						}
						add(
							$current,
							"constraints",
							lv_constraints_21_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_22='and'
				{
					newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getAndKeyword_16_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_3_1_0());
						}
						lv_constraints_23_0=ruleConstraint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementRule());
							}
							add(
								$current,
								"constraints",
								lv_constraints_23_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_24='.'
			{
				newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getFullStopKeyword_16_4());
			}
		)?
		(
			otherlv_25='attributes'
			{
				newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getAttributesKeyword_17_0());
			}
			otherlv_26='are'
			{
				newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getAreKeyword_17_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_2_0());
					}
					lv_attributes_27_0=ruleAttributeValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRequirementRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_27_0,
							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28='and'
				{
					newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getAndKeyword_17_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_3_1_0());
						}
						lv_attributes_29_0=ruleAttributeValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRequirementRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_29_0,
								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_30='.'
			{
				newLeafNode(otherlv_30, grammarAccess.getRequirementAccess().getFullStopKeyword_17_4());
			}
		)?
	)
;

// Entry rule entryRuleOR
entryRuleOR returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getORRule()); }
	iv_ruleOR=ruleOR
	{ $current=$iv_ruleOR.current; }
	EOF;

// Rule OR
ruleOR returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getORAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getORAccess().getOperand1ExpressionParserRuleCall_1_0());
				}
				lv_operand1_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getORRule());
					}
					set(
						$current,
						"operand1",
						lv_operand1_1_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='OR'
		{
			newLeafNode(otherlv_2, grammarAccess.getORAccess().getORKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getORAccess().getOperand2ExpressionParserRuleCall_3_0());
				}
				lv_operand2_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getORRule());
					}
					set(
						$current,
						"operand2",
						lv_operand2_3_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getORAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleAND
entryRuleAND returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getANDRule()); }
	iv_ruleAND=ruleAND
	{ $current=$iv_ruleAND.current; }
	EOF;

// Rule AND
ruleAND returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getANDAccess().getOperand1ExpressionParserRuleCall_1_0());
				}
				lv_operand1_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getANDRule());
					}
					set(
						$current,
						"operand1",
						lv_operand1_1_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='AND'
		{
			newLeafNode(otherlv_2, grammarAccess.getANDAccess().getANDKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getANDAccess().getOperand2ExpressionParserRuleCall_3_0());
				}
				lv_operand2_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getANDRule());
					}
					set(
						$current,
						"operand2",
						lv_operand2_3_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getANDAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleNOT
entryRuleNOT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNOTRule()); }
	iv_ruleNOT=ruleNOT
	{ $current=$iv_ruleNOT.current; }
	EOF;

// Rule NOT
ruleNOT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='NOT'
		{
			newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getNOTKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNOTAccess().getOperand1ExpressionParserRuleCall_2_0());
				}
				lv_operand1_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNOTRule());
					}
					set(
						$current,
						"operand1",
						lv_operand1_2_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getNOTAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLiteralRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getLiteralAccess().getElementRequirementModelElementCrossReference_0());
			}
			ruleEString
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeValueRule()); }
	iv_ruleAttributeValue=ruleAttributeValue
	{ $current=$iv_ruleAttributeValue.current; }
	EOF;

// Rule AttributeValue
ruleAttributeValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeValueRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueOfAttributeCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeValueAccess().getWithKeyword_2());
		}
		otherlv_3='value'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeValueAccess().getValueKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueEStringParserRuleCall_4_0());
				}
				lv_value_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeValueRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Rule RequirementType
ruleRequirementType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='FUNCTIONAL'
			{
				$current = grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='NON_FUNCTIONAL'
			{
				$current = grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='NONE'
			{
				$current = grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='OTHER'
			{
				$current = grammarAccess.getRequirementTypeAccess().getOTHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRequirementTypeAccess().getOTHEREnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule RequirementPriority
ruleRequirementPriority returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ESSENTIAL'
			{
				$current = grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='CONDITIONAL'
			{
				$current = grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='OPTIONAL'
			{
				$current = grammarAccess.getRequirementPriorityAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRequirementPriorityAccess().getOPTIONALEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
