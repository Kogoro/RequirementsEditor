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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'requirementsModel'", "'created'", "'by'", "'version'", "'attributes'", "'are'", "'and'", "'.'", "'requirements'", "'attribute'", "'constraint'", "'requirementsGroup'", "'id'", "'is'", "'description'", "'constraints'", "'elements'", "'requirement'", "'type'", "'priority'", "'('", "'OR'", "')'", "'['", "'AND'", "']'", "'NOT'", "'of'", "'FUNCTIONAL'", "'NON_FUNCTIONAL'", "'NONE'", "'OTHER'", "'ESSENTIAL'", "'CONDITIONAL'", "'OPTIONAL'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalReqLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqLanguage.g"; }



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




    // $ANTLR start "entryRuleRequirementsModel"
    // InternalReqLanguage.g:65:1: entryRuleRequirementsModel returns [EObject current=null] : iv_ruleRequirementsModel= ruleRequirementsModel EOF ;
    public final EObject entryRuleRequirementsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsModel = null;


        try {
            // InternalReqLanguage.g:65:58: (iv_ruleRequirementsModel= ruleRequirementsModel EOF )
            // InternalReqLanguage.g:66:2: iv_ruleRequirementsModel= ruleRequirementsModel EOF
            {
             newCompositeNode(grammarAccess.getRequirementsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementsModel=ruleRequirementsModel();

            state._fsp--;

             current =iv_ruleRequirementsModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementsModel"


    // $ANTLR start "ruleRequirementsModel"
    // InternalReqLanguage.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )? (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )? ) ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_creator_5_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_18_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:78:2: ( ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )? (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )? ) )
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )? (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )? )
            {
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )? (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )? )
            // InternalReqLanguage.g:80:3: () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )? (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )?
            {
            // InternalReqLanguage.g:80:3: ()
            // InternalReqLanguage.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsModelAccess().getRequirementsModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsModelAccess().getRequirementsModelKeyword_1());
            		
            // InternalReqLanguage.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:92:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:110:3: (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalReqLanguage.g:111:4: otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementsModelAccess().getCreatedKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementsModelAccess().getByKeyword_3_1());
                    			
                    // InternalReqLanguage.g:119:4: ( (lv_creator_5_0= ruleEString ) )
                    // InternalReqLanguage.g:120:5: (lv_creator_5_0= ruleEString )
                    {
                    // InternalReqLanguage.g:120:5: (lv_creator_5_0= ruleEString )
                    // InternalReqLanguage.g:121:6: lv_creator_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getCreatorEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_creator_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"creator",
                    							lv_creator_5_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:139:3: (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqLanguage.g:140:4: otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementsModelAccess().getVersionKeyword_4_0());
                    			
                    // InternalReqLanguage.g:144:4: ( (lv_version_7_0= ruleEString ) )
                    // InternalReqLanguage.g:145:5: (lv_version_7_0= ruleEString )
                    {
                    // InternalReqLanguage.g:145:5: (lv_version_7_0= ruleEString )
                    // InternalReqLanguage.g:146:6: lv_version_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getVersionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_version_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_7_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:164:3: (otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqLanguage.g:165:4: otherlv_8= 'attributes' otherlv_9= 'are' ( (lv_attributes_10_0= ruleAttribute ) ) (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )* otherlv_13= '.'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementsModelAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsModelAccess().getAreKeyword_5_1());
                    			
                    // InternalReqLanguage.g:173:4: ( (lv_attributes_10_0= ruleAttribute ) )
                    // InternalReqLanguage.g:174:5: (lv_attributes_10_0= ruleAttribute )
                    {
                    // InternalReqLanguage.g:174:5: (lv_attributes_10_0= ruleAttribute )
                    // InternalReqLanguage.g:175:6: lv_attributes_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attributes_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_10_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:192:4: (otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReqLanguage.g:193:5: otherlv_11= 'and' ( (lv_attributes_12_0= ruleAttribute ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRequirementsModelAccess().getAndKeyword_5_3_0());
                    	    				
                    	    // InternalReqLanguage.g:197:5: ( (lv_attributes_12_0= ruleAttribute ) )
                    	    // InternalReqLanguage.g:198:6: (lv_attributes_12_0= ruleAttribute )
                    	    {
                    	    // InternalReqLanguage.g:198:6: (lv_attributes_12_0= ruleAttribute )
                    	    // InternalReqLanguage.g:199:7: lv_attributes_12_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attributes_12_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_12_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementsModelAccess().getFullStopKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:222:3: (otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqLanguage.g:223:4: otherlv_14= 'requirements' otherlv_15= 'are' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )*
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsModelAccess().getRequirementsKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsModelAccess().getAreKeyword_6_1());
                    			
                    // InternalReqLanguage.g:231:4: ( (lv_elements_16_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:232:5: (lv_elements_16_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:232:5: (lv_elements_16_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:233:6: lv_elements_16_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_elements_16_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_16_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:250:4: (otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLanguage.g:251:5: otherlv_17= 'and' ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRequirementsModelAccess().getAndKeyword_6_3_0());
                    	    				
                    	    // InternalReqLanguage.g:255:5: ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:256:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:256:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:257:7: lv_elements_18_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_elements_18_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_18_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementsModel"


    // $ANTLR start "entryRuleRequirementModelElement"
    // InternalReqLanguage.g:280:1: entryRuleRequirementModelElement returns [EObject current=null] : iv_ruleRequirementModelElement= ruleRequirementModelElement EOF ;
    public final EObject entryRuleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementModelElement = null;


        try {
            // InternalReqLanguage.g:280:64: (iv_ruleRequirementModelElement= ruleRequirementModelElement EOF )
            // InternalReqLanguage.g:281:2: iv_ruleRequirementModelElement= ruleRequirementModelElement EOF
            {
             newCompositeNode(grammarAccess.getRequirementModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementModelElement=ruleRequirementModelElement();

            state._fsp--;

             current =iv_ruleRequirementModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementModelElement"


    // $ANTLR start "ruleRequirementModelElement"
    // InternalReqLanguage.g:287:1: ruleRequirementModelElement returns [EObject current=null] : (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) ;
    public final EObject ruleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_RequirementsGroup_0 = null;

        EObject this_Requirement_1 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:293:2: ( (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) )
            // InternalReqLanguage.g:294:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            {
            // InternalReqLanguage.g:294:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqLanguage.g:295:3: this_RequirementsGroup_0= ruleRequirementsGroup
                    {

                    			newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementsGroupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequirementsGroup_0=ruleRequirementsGroup();

                    state._fsp--;


                    			current = this_RequirementsGroup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:304:3: this_Requirement_1= ruleRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Requirement_1=ruleRequirement();

                    state._fsp--;


                    			current = this_Requirement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementModelElement"


    // $ANTLR start "entryRuleExpression"
    // InternalReqLanguage.g:316:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalReqLanguage.g:316:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalReqLanguage.g:317:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalReqLanguage.g:323:1: ruleExpression returns [EObject current=null] : (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OR_0 = null;

        EObject this_AND_1 = null;

        EObject this_NOT_2 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:329:2: ( (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) )
            // InternalReqLanguage.g:330:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            {
            // InternalReqLanguage.g:330:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)||LA8_1==31||LA8_1==34) ) {
                    alt8=1;
                }
                else if ( (LA8_1==37) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalReqLanguage.g:331:3: this_OR_0= ruleOR
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getORParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OR_0=ruleOR();

                    state._fsp--;


                    			current = this_OR_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:340:3: this_AND_1= ruleAND
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getANDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AND_1=ruleAND();

                    state._fsp--;


                    			current = this_AND_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:349:3: this_NOT_2= ruleNOT
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNOTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NOT_2=ruleNOT();

                    state._fsp--;


                    			current = this_NOT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalReqLanguage.g:358:3: this_Literal_3= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // InternalReqLanguage.g:370:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReqLanguage.g:370:47: (iv_ruleEString= ruleEString EOF )
            // InternalReqLanguage.g:371:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalReqLanguage.g:377:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:383:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalReqLanguage.g:384:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalReqLanguage.g:384:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqLanguage.g:385:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:393:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalReqLanguage.g:404:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalReqLanguage.g:404:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalReqLanguage.g:405:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalReqLanguage.g:411:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'attribute' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:417:2: ( ( () otherlv_1= 'attribute' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalReqLanguage.g:418:2: ( () otherlv_1= 'attribute' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalReqLanguage.g:418:2: ( () otherlv_1= 'attribute' ( (lv_name_2_0= ruleEString ) ) )
            // InternalReqLanguage.g:419:3: () otherlv_1= 'attribute' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalReqLanguage.g:419:3: ()
            // InternalReqLanguage.g:420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalReqLanguage.g:430:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:431:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:431:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:432:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleConstraint"
    // InternalReqLanguage.g:453:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalReqLanguage.g:453:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalReqLanguage.g:454:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalReqLanguage.g:460:1: ruleConstraint returns [EObject current=null] : ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:466:2: ( ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )? ) )
            // InternalReqLanguage.g:467:2: ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )? )
            {
            // InternalReqLanguage.g:467:2: ( () otherlv_1= 'constraint' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )? )
            // InternalReqLanguage.g:468:3: () otherlv_1= 'constraint' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )?
            {
            // InternalReqLanguage.g:468:3: ()
            // InternalReqLanguage.g:469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalReqLanguage.g:479:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:480:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:480:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:481:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:498:3: ( ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||LA11_0==31||LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqLanguage.g:499:4: ( (lv_expression_3_0= ruleExpression ) ) (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )*
                    {
                    // InternalReqLanguage.g:499:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalReqLanguage.g:500:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalReqLanguage.g:500:5: (lv_expression_3_0= ruleExpression )
                    // InternalReqLanguage.g:501:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:518:4: (otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            int LA10_2 = input.LA(2);

                            if ( ((LA10_2>=RULE_STRING && LA10_2<=RULE_ID)||LA10_2==31||LA10_2==34) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReqLanguage.g:519:5: otherlv_4= 'and' ( (lv_expression_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getAndKeyword_3_1_0());
                    	    				
                    	    // InternalReqLanguage.g:523:5: ( (lv_expression_5_0= ruleExpression ) )
                    	    // InternalReqLanguage.g:524:6: (lv_expression_5_0= ruleExpression )
                    	    {
                    	    // InternalReqLanguage.g:524:6: (lv_expression_5_0= ruleExpression )
                    	    // InternalReqLanguage.g:525:7: lv_expression_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_expression_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_5_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRequirementsGroup"
    // InternalReqLanguage.g:548:1: entryRuleRequirementsGroup returns [EObject current=null] : iv_ruleRequirementsGroup= ruleRequirementsGroup EOF ;
    public final EObject entryRuleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsGroup = null;


        try {
            // InternalReqLanguage.g:548:58: (iv_ruleRequirementsGroup= ruleRequirementsGroup EOF )
            // InternalReqLanguage.g:549:2: iv_ruleRequirementsGroup= ruleRequirementsGroup EOF
            {
             newCompositeNode(grammarAccess.getRequirementsGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementsGroup=ruleRequirementsGroup();

            state._fsp--;

             current =iv_ruleRequirementsGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementsGroup"


    // $ANTLR start "ruleRequirementsGroup"
    // InternalReqLanguage.g:555:1: ruleRequirementsGroup returns [EObject current=null] : ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )? (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )? ) ;
    public final EObject ruleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_constraints_11_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_elements_17_0 = null;

        EObject lv_elements_19_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:561:2: ( ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )? (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )? ) )
            // InternalReqLanguage.g:562:2: ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )? (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )? )
            {
            // InternalReqLanguage.g:562:2: ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )? (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )? )
            // InternalReqLanguage.g:563:3: () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )? (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )?
            {
            // InternalReqLanguage.g:563:3: ()
            // InternalReqLanguage.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsGroupAccess().getRequirementsGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsGroupAccess().getRequirementsGroupKeyword_1());
            		
            // InternalReqLanguage.g:574:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:575:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:575:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:576:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementsGroupAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementsGroupAccess().getIsKeyword_4());
            		
            // InternalReqLanguage.g:601:3: ( (lv_id_5_0= ruleEString ) )
            // InternalReqLanguage.g:602:4: (lv_id_5_0= ruleEString )
            {
            // InternalReqLanguage.g:602:4: (lv_id_5_0= ruleEString )
            // InternalReqLanguage.g:603:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_id_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:620:3: (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqLanguage.g:621:4: otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementsGroupAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementsGroupAccess().getIsKeyword_6_1());
                    			
                    // InternalReqLanguage.g:629:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalReqLanguage.g:630:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalReqLanguage.g:630:5: (lv_description_8_0= ruleEString )
                    // InternalReqLanguage.g:631:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:649:3: (otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqLanguage.g:650:4: otherlv_9= 'constraints' otherlv_10= 'are' ( (lv_constraints_11_0= ruleConstraint ) ) (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )* otherlv_14= '.'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsGroupAccess().getConstraintsKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementsGroupAccess().getAreKeyword_7_1());
                    			
                    // InternalReqLanguage.g:658:4: ( (lv_constraints_11_0= ruleConstraint ) )
                    // InternalReqLanguage.g:659:5: (lv_constraints_11_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:659:5: (lv_constraints_11_0= ruleConstraint )
                    // InternalReqLanguage.g:660:6: lv_constraints_11_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraints_11_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_11_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:677:4: (otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalReqLanguage.g:678:5: otherlv_12= 'and' ( (lv_constraints_13_0= ruleConstraint ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_20); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRequirementsGroupAccess().getAndKeyword_7_3_0());
                    	    				
                    	    // InternalReqLanguage.g:682:5: ( (lv_constraints_13_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:683:6: (lv_constraints_13_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:683:6: (lv_constraints_13_0= ruleConstraint )
                    	    // InternalReqLanguage.g:684:7: lv_constraints_13_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_constraints_13_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_13_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsGroupAccess().getFullStopKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:707:3: (otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReqLanguage.g:708:4: otherlv_15= 'elements' otherlv_16= 'are' ( (lv_elements_17_0= ruleRequirementModelElement ) ) (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )* otherlv_20= '.'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsGroupAccess().getElementsKeyword_8_0());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementsGroupAccess().getAreKeyword_8_1());
                    			
                    // InternalReqLanguage.g:716:4: ( (lv_elements_17_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:717:5: (lv_elements_17_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:717:5: (lv_elements_17_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:718:6: lv_elements_17_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_elements_17_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_17_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:735:4: (otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalReqLanguage.g:736:5: otherlv_18= 'and' ( (lv_elements_19_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRequirementsGroupAccess().getAndKeyword_8_3_0());
                    	    				
                    	    // InternalReqLanguage.g:740:5: ( (lv_elements_19_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:741:6: (lv_elements_19_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:741:6: (lv_elements_19_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:742:7: lv_elements_19_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_elements_19_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_19_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementsGroupAccess().getFullStopKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementsGroup"


    // $ANTLR start "entryRuleRequirement"
    // InternalReqLanguage.g:769:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqLanguage.g:769:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqLanguage.g:770:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalReqLanguage.g:776:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )? (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )? ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        Enumerator lv_type_13_0 = null;

        Enumerator lv_priority_17_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_constraints_23_0 = null;

        EObject lv_attributes_27_0 = null;

        EObject lv_attributes_29_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:782:2: ( ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )? (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )? ) )
            // InternalReqLanguage.g:783:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )? (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )? )
            {
            // InternalReqLanguage.g:783:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )? (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )? )
            // InternalReqLanguage.g:784:3: () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )? (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )?
            {
            // InternalReqLanguage.g:784:3: ()
            // InternalReqLanguage.g:785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            // InternalReqLanguage.g:795:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:796:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:796:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:797:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getIsKeyword_4());
            		
            // InternalReqLanguage.g:822:3: ( (lv_id_5_0= ruleEString ) )
            // InternalReqLanguage.g:823:4: (lv_id_5_0= ruleEString )
            {
            // InternalReqLanguage.g:823:4: (lv_id_5_0= ruleEString )
            // InternalReqLanguage.g:824:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_id_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getFullStopKeyword_6());
            		
            // InternalReqLanguage.g:845:3: (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReqLanguage.g:846:4: otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getDescriptionKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getIsKeyword_7_1());
                    			
                    // InternalReqLanguage.g:854:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalReqLanguage.g:855:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalReqLanguage.g:855:5: (lv_description_9_0= ruleEString )
                    // InternalReqLanguage.g:856:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFullStopKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getTypeKeyword_8());
            		
            otherlv_12=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getIsKeyword_9());
            		
            // InternalReqLanguage.g:886:3: ( (lv_type_13_0= ruleRequirementType ) )
            // InternalReqLanguage.g:887:4: (lv_type_13_0= ruleRequirementType )
            {
            // InternalReqLanguage.g:887:4: (lv_type_13_0= ruleRequirementType )
            // InternalReqLanguage.g:888:5: lv_type_13_0= ruleRequirementType
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getTypeRequirementTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_13_0=ruleRequirementType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_13_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getFullStopKeyword_11());
            		
            otherlv_15=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getPriorityKeyword_12());
            		
            otherlv_16=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getIsKeyword_13());
            		
            // InternalReqLanguage.g:917:3: ( (lv_priority_17_0= ruleRequirementPriority ) )
            // InternalReqLanguage.g:918:4: (lv_priority_17_0= ruleRequirementPriority )
            {
            // InternalReqLanguage.g:918:4: (lv_priority_17_0= ruleRequirementPriority )
            // InternalReqLanguage.g:919:5: lv_priority_17_0= ruleRequirementPriority
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getPriorityRequirementPriorityEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_22);
            lv_priority_17_0=ruleRequirementPriority();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_17_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementPriority");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getFullStopKeyword_15());
            		
            // InternalReqLanguage.g:940:3: (otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqLanguage.g:941:4: otherlv_19= 'constraints' otherlv_20= 'are' ( (lv_constraints_21_0= ruleConstraint ) ) (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )* otherlv_24= '.'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getConstraintsKeyword_16_0());
                    			
                    otherlv_20=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getAreKeyword_16_1());
                    			
                    // InternalReqLanguage.g:949:4: ( (lv_constraints_21_0= ruleConstraint ) )
                    // InternalReqLanguage.g:950:5: (lv_constraints_21_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:950:5: (lv_constraints_21_0= ruleConstraint )
                    // InternalReqLanguage.g:951:6: lv_constraints_21_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraints_21_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_21_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:968:4: (otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalReqLanguage.g:969:5: otherlv_22= 'and' ( (lv_constraints_23_0= ruleConstraint ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FOLLOW_20); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getAndKeyword_16_3_0());
                    	    				
                    	    // InternalReqLanguage.g:973:5: ( (lv_constraints_23_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:974:6: (lv_constraints_23_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:974:6: (lv_constraints_23_0= ruleConstraint )
                    	    // InternalReqLanguage.g:975:7: lv_constraints_23_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_constraints_23_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_23_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getFullStopKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:998:3: (otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReqLanguage.g:999:4: otherlv_25= 'attributes' otherlv_26= 'are' ( (lv_attributes_27_0= ruleAttributeValue ) ) (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )* otherlv_30= '.'
                    {
                    otherlv_25=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getAttributesKeyword_17_0());
                    			
                    otherlv_26=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getAreKeyword_17_1());
                    			
                    // InternalReqLanguage.g:1007:4: ( (lv_attributes_27_0= ruleAttributeValue ) )
                    // InternalReqLanguage.g:1008:5: (lv_attributes_27_0= ruleAttributeValue )
                    {
                    // InternalReqLanguage.g:1008:5: (lv_attributes_27_0= ruleAttributeValue )
                    // InternalReqLanguage.g:1009:6: lv_attributes_27_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_attributes_27_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_27_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:1026:4: (otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalReqLanguage.g:1027:5: otherlv_28= 'and' ( (lv_attributes_29_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_28=(Token)match(input,17,FOLLOW_30); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getAndKeyword_17_3_0());
                    	    				
                    	    // InternalReqLanguage.g:1031:5: ( (lv_attributes_29_0= ruleAttributeValue ) )
                    	    // InternalReqLanguage.g:1032:6: (lv_attributes_29_0= ruleAttributeValue )
                    	    {
                    	    // InternalReqLanguage.g:1032:6: (lv_attributes_29_0= ruleAttributeValue )
                    	    // InternalReqLanguage.g:1033:7: lv_attributes_29_0= ruleAttributeValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_attributes_29_0=ruleAttributeValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_29_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getRequirementAccess().getFullStopKeyword_17_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleOR"
    // InternalReqLanguage.g:1060:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // InternalReqLanguage.g:1060:43: (iv_ruleOR= ruleOR EOF )
            // InternalReqLanguage.g:1061:2: iv_ruleOR= ruleOR EOF
            {
             newCompositeNode(grammarAccess.getORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOR=ruleOR();

            state._fsp--;

             current =iv_ruleOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOR"


    // $ANTLR start "ruleOR"
    // InternalReqLanguage.g:1067:1: ruleOR returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1073:2: ( (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalReqLanguage.g:1074:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalReqLanguage.g:1074:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalReqLanguage.g:1075:3: otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getORAccess().getLeftParenthesisKeyword_0());
            		
            // InternalReqLanguage.g:1079:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1080:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1080:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1081:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_operand1_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getORRule());
            					}
            					set(
            						current,
            						"operand1",
            						lv_operand1_1_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getORAccess().getORKeyword_2());
            		
            // InternalReqLanguage.g:1102:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1103:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1103:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1104:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_operand2_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getORRule());
            					}
            					set(
            						current,
            						"operand2",
            						lv_operand2_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getORAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOR"


    // $ANTLR start "entryRuleAND"
    // InternalReqLanguage.g:1129:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalReqLanguage.g:1129:44: (iv_ruleAND= ruleAND EOF )
            // InternalReqLanguage.g:1130:2: iv_ruleAND= ruleAND EOF
            {
             newCompositeNode(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND=ruleAND();

            state._fsp--;

             current =iv_ruleAND; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalReqLanguage.g:1136:1: ruleAND returns [EObject current=null] : (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1142:2: ( (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            // InternalReqLanguage.g:1143:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            {
            // InternalReqLanguage.g:1143:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            // InternalReqLanguage.g:1144:3: otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalReqLanguage.g:1148:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1149:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1149:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1150:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_operand1_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDRule());
            					}
            					set(
            						current,
            						"operand1",
            						lv_operand1_1_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getANDAccess().getANDKeyword_2());
            		
            // InternalReqLanguage.g:1171:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1172:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1172:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1173:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_operand2_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDRule());
            					}
            					set(
            						current,
            						"operand2",
            						lv_operand2_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getANDAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleNOT"
    // InternalReqLanguage.g:1198:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalReqLanguage.g:1198:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalReqLanguage.g:1199:2: iv_ruleNOT= ruleNOT EOF
            {
             newCompositeNode(grammarAccess.getNOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNOT=ruleNOT();

            state._fsp--;

             current =iv_ruleNOT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOT"


    // $ANTLR start "ruleNOT"
    // InternalReqLanguage.g:1205:1: ruleNOT returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand1_2_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1211:2: ( (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalReqLanguage.g:1212:2: (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalReqLanguage.g:1212:2: (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalReqLanguage.g:1213:3: otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getNOTKeyword_1());
            		
            // InternalReqLanguage.g:1221:3: ( (lv_operand1_2_0= ruleExpression ) )
            // InternalReqLanguage.g:1222:4: (lv_operand1_2_0= ruleExpression )
            {
            // InternalReqLanguage.g:1222:4: (lv_operand1_2_0= ruleExpression )
            // InternalReqLanguage.g:1223:5: lv_operand1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNOTAccess().getOperand1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_operand1_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNOTRule());
            					}
            					set(
            						current,
            						"operand1",
            						lv_operand1_2_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNOTAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOT"


    // $ANTLR start "entryRuleLiteral"
    // InternalReqLanguage.g:1248:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalReqLanguage.g:1248:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalReqLanguage.g:1249:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalReqLanguage.g:1255:1: ruleLiteral returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1261:2: ( ( ( ruleEString ) ) )
            // InternalReqLanguage.g:1262:2: ( ( ruleEString ) )
            {
            // InternalReqLanguage.g:1262:2: ( ( ruleEString ) )
            // InternalReqLanguage.g:1263:3: ( ruleEString )
            {
            // InternalReqLanguage.g:1263:3: ( ruleEString )
            // InternalReqLanguage.g:1264:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralRule());
            				}
            			

            				newCompositeNode(grammarAccess.getLiteralAccess().getElementRequirementModelElementCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalReqLanguage.g:1281:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalReqLanguage.g:1281:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalReqLanguage.g:1282:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalReqLanguage.g:1288:1: ruleAttributeValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) )? otherlv_2= 'of' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1294:2: ( ( () ( (lv_value_1_0= ruleEString ) )? otherlv_2= 'of' ( ( ruleEString ) ) ) )
            // InternalReqLanguage.g:1295:2: ( () ( (lv_value_1_0= ruleEString ) )? otherlv_2= 'of' ( ( ruleEString ) ) )
            {
            // InternalReqLanguage.g:1295:2: ( () ( (lv_value_1_0= ruleEString ) )? otherlv_2= 'of' ( ( ruleEString ) ) )
            // InternalReqLanguage.g:1296:3: () ( (lv_value_1_0= ruleEString ) )? otherlv_2= 'of' ( ( ruleEString ) )
            {
            // InternalReqLanguage.g:1296:3: ()
            // InternalReqLanguage.g:1297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
            					current);
            			

            }

            // InternalReqLanguage.g:1303:3: ( (lv_value_1_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalReqLanguage.g:1304:4: (lv_value_1_0= ruleEString )
                    {
                    // InternalReqLanguage.g:1304:4: (lv_value_1_0= ruleEString )
                    // InternalReqLanguage.g:1305:5: lv_value_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_36);
                    lv_value_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeValueAccess().getOfKeyword_2());
            		
            // InternalReqLanguage.g:1326:3: ( ( ruleEString ) )
            // InternalReqLanguage.g:1327:4: ( ruleEString )
            {
            // InternalReqLanguage.g:1327:4: ( ruleEString )
            // InternalReqLanguage.g:1328:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueOfAttributeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "ruleRequirementType"
    // InternalReqLanguage.g:1346:1: ruleRequirementType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleRequirementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1352:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalReqLanguage.g:1353:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalReqLanguage.g:1353:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 42:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalReqLanguage.g:1354:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1354:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalReqLanguage.g:1355:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1362:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1362:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    // InternalReqLanguage.g:1363:4: enumLiteral_1= 'NON_FUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1370:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalReqLanguage.g:1370:3: (enumLiteral_2= 'NONE' )
                    // InternalReqLanguage.g:1371:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReqLanguage.g:1378:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalReqLanguage.g:1378:3: (enumLiteral_3= 'OTHER' )
                    // InternalReqLanguage.g:1379:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getOTHEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRequirementTypeAccess().getOTHEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementType"


    // $ANTLR start "ruleRequirementPriority"
    // InternalReqLanguage.g:1389:1: ruleRequirementPriority returns [Enumerator current=null] : ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) ;
    public final Enumerator ruleRequirementPriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1395:2: ( ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) )
            // InternalReqLanguage.g:1396:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            {
            // InternalReqLanguage.g:1396:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt24=1;
                }
                break;
            case 44:
                {
                alt24=2;
                }
                break;
            case 45:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalReqLanguage.g:1397:3: (enumLiteral_0= 'ESSENTIAL' )
                    {
                    // InternalReqLanguage.g:1397:3: (enumLiteral_0= 'ESSENTIAL' )
                    // InternalReqLanguage.g:1398:4: enumLiteral_0= 'ESSENTIAL'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1405:3: (enumLiteral_1= 'CONDITIONAL' )
                    {
                    // InternalReqLanguage.g:1405:3: (enumLiteral_1= 'CONDITIONAL' )
                    // InternalReqLanguage.g:1406:4: enumLiteral_1= 'CONDITIONAL'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1413:3: (enumLiteral_2= 'OPTIONAL' )
                    {
                    // InternalReqLanguage.g:1413:3: (enumLiteral_2= 'OPTIONAL' )
                    // InternalReqLanguage.g:1414:4: enumLiteral_2= 'OPTIONAL'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRequirementPriorityAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementPriority"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000008D002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000008C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000480000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000480000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004008002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});

}