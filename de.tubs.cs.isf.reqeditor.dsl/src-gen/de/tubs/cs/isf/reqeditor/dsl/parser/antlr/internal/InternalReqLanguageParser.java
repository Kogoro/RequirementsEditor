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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'requirementsModel'", "'created'", "'by'", "'version'", "'attributes'", "'are'", "'{'", "','", "'}'", "'attribute'", "'new'", "'constraint'", "'requirementsGroup'", "'id'", "'is'", "'description'", "'constraints'", "'elements'", "'requirement'", "'.'", "'type'", "'priority'", "'('", "'OR'", "')'", "'['", "'AND'", "']'", "'NOT'", "'attributeValue'", "'of'", "'FUNCTIONAL'", "'NON_FUNCTIONAL'", "'NONE'", "'OTHER'", "'ESSENTIAL'", "'CONDITIONAL'", "'OPTIONAL'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalReqLanguage.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )? ) ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_creator_5_0 = null;

        AntlrDatatypeRuleToken lv_version_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_elements_15_0 = null;

        EObject lv_elements_17_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:78:2: ( ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )? ) )
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )? )
            {
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )? )
            // InternalReqLanguage.g:80:3: () otherlv_1= 'requirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'created' otherlv_4= 'by' ( (lv_creator_5_0= ruleEString ) ) )? (otherlv_6= 'version' ( (lv_version_7_0= ruleEString ) ) )? (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )? ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )?
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

            // InternalReqLanguage.g:164:3: (otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqLanguage.g:165:4: otherlv_8= 'attributes' otherlv_9= 'are' otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementsModelAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsModelAccess().getAreKeyword_5_1());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementsModelAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalReqLanguage.g:177:4: ( (lv_attributes_11_0= ruleAttribute ) )
                    // InternalReqLanguage.g:178:5: (lv_attributes_11_0= ruleAttribute )
                    {
                    // InternalReqLanguage.g:178:5: (lv_attributes_11_0= ruleAttribute )
                    // InternalReqLanguage.g:179:6: lv_attributes_11_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_11_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_11_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:196:4: (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReqLanguage.g:197:5: otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRequirementsModelAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalReqLanguage.g:201:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // InternalReqLanguage.g:202:6: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // InternalReqLanguage.g:202:6: (lv_attributes_13_0= ruleAttribute )
                    	    // InternalReqLanguage.g:203:7: lv_attributes_13_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_13_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_13_0,
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

                    otherlv_14=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsModelAccess().getRightCurlyBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:226:3: ( ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23||LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqLanguage.g:227:4: ( (lv_elements_15_0= ruleRequirementModelElement ) ) (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )*
                    {
                    // InternalReqLanguage.g:227:4: ( (lv_elements_15_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:228:5: (lv_elements_15_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:228:5: (lv_elements_15_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:229:6: lv_elements_15_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_elements_15_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_15_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:246:4: (otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLanguage.g:247:5: otherlv_16= ',' ( (lv_elements_17_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRequirementsModelAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalReqLanguage.g:251:5: ( (lv_elements_17_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:252:6: (lv_elements_17_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:252:6: (lv_elements_17_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:253:7: lv_elements_17_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_elements_17_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_17_0,
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
    // InternalReqLanguage.g:276:1: entryRuleRequirementModelElement returns [EObject current=null] : iv_ruleRequirementModelElement= ruleRequirementModelElement EOF ;
    public final EObject entryRuleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementModelElement = null;


        try {
            // InternalReqLanguage.g:276:64: (iv_ruleRequirementModelElement= ruleRequirementModelElement EOF )
            // InternalReqLanguage.g:277:2: iv_ruleRequirementModelElement= ruleRequirementModelElement EOF
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
    // InternalReqLanguage.g:283:1: ruleRequirementModelElement returns [EObject current=null] : (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) ;
    public final EObject ruleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_RequirementsGroup_0 = null;

        EObject this_Requirement_1 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:289:2: ( (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) )
            // InternalReqLanguage.g:290:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            {
            // InternalReqLanguage.g:290:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqLanguage.g:291:3: this_RequirementsGroup_0= ruleRequirementsGroup
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
                    // InternalReqLanguage.g:300:3: this_Requirement_1= ruleRequirement
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
    // InternalReqLanguage.g:312:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalReqLanguage.g:312:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalReqLanguage.g:313:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalReqLanguage.g:319:1: ruleExpression returns [EObject current=null] : (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OR_0 = null;

        EObject this_AND_1 = null;

        EObject this_NOT_2 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:325:2: ( (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) )
            // InternalReqLanguage.g:326:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            {
            // InternalReqLanguage.g:326:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)||LA8_1==33||LA8_1==36) ) {
                    alt8=1;
                }
                else if ( (LA8_1==39) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 36:
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
                    // InternalReqLanguage.g:327:3: this_OR_0= ruleOR
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
                    // InternalReqLanguage.g:336:3: this_AND_1= ruleAND
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
                    // InternalReqLanguage.g:345:3: this_NOT_2= ruleNOT
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
                    // InternalReqLanguage.g:354:3: this_Literal_3= ruleLiteral
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
    // InternalReqLanguage.g:366:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReqLanguage.g:366:47: (iv_ruleEString= ruleEString EOF )
            // InternalReqLanguage.g:367:2: iv_ruleEString= ruleEString EOF
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
    // InternalReqLanguage.g:373:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:379:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalReqLanguage.g:380:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalReqLanguage.g:380:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalReqLanguage.g:381:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:389:3: this_ID_1= RULE_ID
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
    // InternalReqLanguage.g:400:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalReqLanguage.g:400:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalReqLanguage.g:401:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalReqLanguage.g:407:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'attribute' ( (lv_id_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:413:2: ( ( () otherlv_1= 'attribute' ( (lv_id_2_0= ruleEString ) ) ) )
            // InternalReqLanguage.g:414:2: ( () otherlv_1= 'attribute' ( (lv_id_2_0= ruleEString ) ) )
            {
            // InternalReqLanguage.g:414:2: ( () otherlv_1= 'attribute' ( (lv_id_2_0= ruleEString ) ) )
            // InternalReqLanguage.g:415:3: () otherlv_1= 'attribute' ( (lv_id_2_0= ruleEString ) )
            {
            // InternalReqLanguage.g:415:3: ()
            // InternalReqLanguage.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalReqLanguage.g:426:3: ( (lv_id_2_0= ruleEString ) )
            // InternalReqLanguage.g:427:4: (lv_id_2_0= ruleEString )
            {
            // InternalReqLanguage.g:427:4: (lv_id_2_0= ruleEString )
            // InternalReqLanguage.g:428:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
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
    // InternalReqLanguage.g:449:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalReqLanguage.g:449:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalReqLanguage.g:450:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalReqLanguage.g:456:1: ruleConstraint returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:462:2: ( ( () otherlv_1= 'new' otherlv_2= 'constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? ) )
            // InternalReqLanguage.g:463:2: ( () otherlv_1= 'new' otherlv_2= 'constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? )
            {
            // InternalReqLanguage.g:463:2: ( () otherlv_1= 'new' otherlv_2= 'constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? )
            // InternalReqLanguage.g:464:3: () otherlv_1= 'new' otherlv_2= 'constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )?
            {
            // InternalReqLanguage.g:464:3: ()
            // InternalReqLanguage.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getConstraintKeyword_2());
            		
            // InternalReqLanguage.g:479:3: ( (lv_name_3_0= ruleEString ) )
            // InternalReqLanguage.g:480:4: (lv_name_3_0= ruleEString )
            {
            // InternalReqLanguage.g:480:4: (lv_name_3_0= ruleEString )
            // InternalReqLanguage.g:481:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:498:3: ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||LA11_0==33||LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqLanguage.g:499:4: ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )*
                    {
                    // InternalReqLanguage.g:499:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalReqLanguage.g:500:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalReqLanguage.g:500:5: (lv_expression_4_0= ruleExpression )
                    // InternalReqLanguage.g:501:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:518:4: (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            int LA10_2 = input.LA(2);

                            if ( ((LA10_2>=RULE_STRING && LA10_2<=RULE_ID)||LA10_2==33||LA10_2==36) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReqLanguage.g:519:5: otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_17); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalReqLanguage.g:523:5: ( (lv_expression_6_0= ruleExpression ) )
                    	    // InternalReqLanguage.g:524:6: (lv_expression_6_0= ruleExpression )
                    	    {
                    	    // InternalReqLanguage.g:524:6: (lv_expression_6_0= ruleExpression )
                    	    // InternalReqLanguage.g:525:7: lv_expression_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_expression_6_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_6_0,
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
    // InternalReqLanguage.g:555:1: ruleRequirementsGroup returns [EObject current=null] : ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )? ) ;
    public final EObject ruleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_elements_19_0 = null;

        EObject lv_elements_21_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:561:2: ( ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )? ) )
            // InternalReqLanguage.g:562:2: ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )? )
            {
            // InternalReqLanguage.g:562:2: ( () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )? )
            // InternalReqLanguage.g:563:3: () otherlv_1= 'requirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) (otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )?
            {
            // InternalReqLanguage.g:563:3: ()
            // InternalReqLanguage.g:564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsGroupAccess().getRequirementsGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsGroupAccess().getRequirementsGroupKeyword_1());
            		
            // InternalReqLanguage.g:574:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:575:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:575:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:576:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementsGroupAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementsGroupAccess().getIsKeyword_4());
            		
            // InternalReqLanguage.g:601:3: ( (lv_id_5_0= ruleEString ) )
            // InternalReqLanguage.g:602:4: (lv_id_5_0= ruleEString )
            {
            // InternalReqLanguage.g:602:4: (lv_id_5_0= ruleEString )
            // InternalReqLanguage.g:603:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
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

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqLanguage.g:621:4: otherlv_6= 'description' otherlv_7= 'is' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementsGroupAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementsGroupAccess().getIsKeyword_6_1());
                    			
                    // InternalReqLanguage.g:629:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalReqLanguage.g:630:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalReqLanguage.g:630:5: (lv_description_8_0= ruleEString )
                    // InternalReqLanguage.g:631:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalReqLanguage.g:649:3: (otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqLanguage.g:650:4: otherlv_9= 'constraints' otherlv_10= 'are' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsGroupAccess().getConstraintsKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementsGroupAccess().getAreKeyword_7_1());
                    			
                    otherlv_11=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_7_2());
                    			
                    // InternalReqLanguage.g:662:4: ( (lv_constraints_12_0= ruleConstraint ) )
                    // InternalReqLanguage.g:663:5: (lv_constraints_12_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:663:5: (lv_constraints_12_0= ruleConstraint )
                    // InternalReqLanguage.g:664:6: lv_constraints_12_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_constraints_12_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_12_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:681:4: (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalReqLanguage.g:682:5: otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_22); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalReqLanguage.g:686:5: ( (lv_constraints_14_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:687:6: (lv_constraints_14_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:687:6: (lv_constraints_14_0= ruleConstraint )
                    	    // InternalReqLanguage.g:688:7: lv_constraints_14_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_constraints_14_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_14_0,
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

                    otherlv_15=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsGroupAccess().getRightCurlyBracketKeyword_7_5());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:711:3: (otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReqLanguage.g:712:4: otherlv_16= 'elements' otherlv_17= 'are' otherlv_18= '{' ( (lv_elements_19_0= ruleRequirementModelElement ) ) (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )* otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementsGroupAccess().getElementsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getRequirementsGroupAccess().getAreKeyword_8_1());
                    			
                    otherlv_18=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_8_2());
                    			
                    // InternalReqLanguage.g:724:4: ( (lv_elements_19_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:725:5: (lv_elements_19_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:725:5: (lv_elements_19_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:726:6: lv_elements_19_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalReqLanguage.g:743:4: (otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalReqLanguage.g:744:5: otherlv_20= ',' ( (lv_elements_21_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_8_4_0());
                    	    				
                    	    // InternalReqLanguage.g:748:5: ( (lv_elements_21_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:749:6: (lv_elements_21_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:749:6: (lv_elements_21_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:750:7: lv_elements_21_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_elements_21_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_21_0,
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

                    otherlv_22=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getRequirementsGroupAccess().getRightCurlyBracketKeyword_8_5());
                    			

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
    // InternalReqLanguage.g:777:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqLanguage.g:777:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqLanguage.g:778:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalReqLanguage.g:784:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )? (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )? ) ;
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
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        Enumerator lv_type_13_0 = null;

        Enumerator lv_priority_17_0 = null;

        EObject lv_constraints_22_0 = null;

        EObject lv_constraints_24_0 = null;

        EObject lv_attributes_29_0 = null;

        EObject lv_attributes_31_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:790:2: ( ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )? (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )? ) )
            // InternalReqLanguage.g:791:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )? (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )? )
            {
            // InternalReqLanguage.g:791:2: ( () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )? (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )? )
            // InternalReqLanguage.g:792:3: () otherlv_1= 'requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'id' otherlv_4= 'is' ( (lv_id_5_0= ruleEString ) ) otherlv_6= '.' (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )? otherlv_11= 'type' otherlv_12= 'is' ( (lv_type_13_0= ruleRequirementType ) ) otherlv_14= '.' otherlv_15= 'priority' otherlv_16= 'is' ( (lv_priority_17_0= ruleRequirementPriority ) ) otherlv_18= '.' (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )? (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )?
            {
            // InternalReqLanguage.g:792:3: ()
            // InternalReqLanguage.g:793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            // InternalReqLanguage.g:803:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqLanguage.g:804:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqLanguage.g:804:4: (lv_name_2_0= ruleEString )
            // InternalReqLanguage.g:805:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getIsKeyword_4());
            		
            // InternalReqLanguage.g:830:3: ( (lv_id_5_0= ruleEString ) )
            // InternalReqLanguage.g:831:4: (lv_id_5_0= ruleEString )
            {
            // InternalReqLanguage.g:831:4: (lv_id_5_0= ruleEString )
            // InternalReqLanguage.g:832:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getFullStopKeyword_6());
            		
            // InternalReqLanguage.g:853:3: (otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReqLanguage.g:854:4: otherlv_7= 'description' otherlv_8= 'is' ( (lv_description_9_0= ruleEString ) ) otherlv_10= '.'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getDescriptionKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getIsKeyword_7_1());
                    			
                    // InternalReqLanguage.g:862:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalReqLanguage.g:863:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalReqLanguage.g:863:5: (lv_description_9_0= ruleEString )
                    // InternalReqLanguage.g:864:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_10=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFullStopKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getTypeKeyword_8());
            		
            otherlv_12=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getIsKeyword_9());
            		
            // InternalReqLanguage.g:894:3: ( (lv_type_13_0= ruleRequirementType ) )
            // InternalReqLanguage.g:895:4: (lv_type_13_0= ruleRequirementType )
            {
            // InternalReqLanguage.g:895:4: (lv_type_13_0= ruleRequirementType )
            // InternalReqLanguage.g:896:5: lv_type_13_0= ruleRequirementType
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getTypeRequirementTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_14=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getFullStopKeyword_11());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getPriorityKeyword_12());
            		
            otherlv_16=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getIsKeyword_13());
            		
            // InternalReqLanguage.g:925:3: ( (lv_priority_17_0= ruleRequirementPriority ) )
            // InternalReqLanguage.g:926:4: (lv_priority_17_0= ruleRequirementPriority )
            {
            // InternalReqLanguage.g:926:4: (lv_priority_17_0= ruleRequirementPriority )
            // InternalReqLanguage.g:927:5: lv_priority_17_0= ruleRequirementPriority
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getPriorityRequirementPriorityEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_18=(Token)match(input,30,FOLLOW_30); 

            			newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getFullStopKeyword_15());
            		
            // InternalReqLanguage.g:948:3: (otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqLanguage.g:949:4: otherlv_19= 'constraints' otherlv_20= 'are' otherlv_21= '{' ( (lv_constraints_22_0= ruleConstraint ) ) (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )* otherlv_25= '}'
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getConstraintsKeyword_16_0());
                    			
                    otherlv_20=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getAreKeyword_16_1());
                    			
                    otherlv_21=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_16_2());
                    			
                    // InternalReqLanguage.g:961:4: ( (lv_constraints_22_0= ruleConstraint ) )
                    // InternalReqLanguage.g:962:5: (lv_constraints_22_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:962:5: (lv_constraints_22_0= ruleConstraint )
                    // InternalReqLanguage.g:963:6: lv_constraints_22_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_constraints_22_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_22_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:980:4: (otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalReqLanguage.g:981:5: otherlv_23= ',' ( (lv_constraints_24_0= ruleConstraint ) )
                    	    {
                    	    otherlv_23=(Token)match(input,18,FOLLOW_22); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getCommaKeyword_16_4_0());
                    	    				
                    	    // InternalReqLanguage.g:985:5: ( (lv_constraints_24_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:986:6: (lv_constraints_24_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:986:6: (lv_constraints_24_0= ruleConstraint )
                    	    // InternalReqLanguage.g:987:7: lv_constraints_24_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_16_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_constraints_24_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_24_0,
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

                    otherlv_25=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_16_5());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:1010:3: (otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReqLanguage.g:1011:4: otherlv_26= 'attributes' otherlv_27= 'are' otherlv_28= '{' ( (lv_attributes_29_0= ruleAttributeValue ) ) (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )* otherlv_32= '}'
                    {
                    otherlv_26=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getAttributesKeyword_17_0());
                    			
                    otherlv_27=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getAreKeyword_17_1());
                    			
                    otherlv_28=(Token)match(input,17,FOLLOW_32); 

                    				newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_17_2());
                    			
                    // InternalReqLanguage.g:1023:4: ( (lv_attributes_29_0= ruleAttributeValue ) )
                    // InternalReqLanguage.g:1024:5: (lv_attributes_29_0= ruleAttributeValue )
                    {
                    // InternalReqLanguage.g:1024:5: (lv_attributes_29_0= ruleAttributeValue )
                    // InternalReqLanguage.g:1025:6: lv_attributes_29_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_3_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalReqLanguage.g:1042:4: (otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalReqLanguage.g:1043:5: otherlv_30= ',' ( (lv_attributes_31_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_30=(Token)match(input,18,FOLLOW_32); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getRequirementAccess().getCommaKeyword_17_4_0());
                    	    				
                    	    // InternalReqLanguage.g:1047:5: ( (lv_attributes_31_0= ruleAttributeValue ) )
                    	    // InternalReqLanguage.g:1048:6: (lv_attributes_31_0= ruleAttributeValue )
                    	    {
                    	    // InternalReqLanguage.g:1048:6: (lv_attributes_31_0= ruleAttributeValue )
                    	    // InternalReqLanguage.g:1049:7: lv_attributes_31_0= ruleAttributeValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_17_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_31_0=ruleAttributeValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_31_0,
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

                    otherlv_32=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_32, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_17_5());
                    			

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
    // InternalReqLanguage.g:1076:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // InternalReqLanguage.g:1076:43: (iv_ruleOR= ruleOR EOF )
            // InternalReqLanguage.g:1077:2: iv_ruleOR= ruleOR EOF
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
    // InternalReqLanguage.g:1083:1: ruleOR returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1089:2: ( (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalReqLanguage.g:1090:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalReqLanguage.g:1090:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalReqLanguage.g:1091:3: otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getORAccess().getLeftParenthesisKeyword_0());
            		
            // InternalReqLanguage.g:1095:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1096:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1096:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1097:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getORAccess().getORKeyword_2());
            		
            // InternalReqLanguage.g:1118:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1119:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1119:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1120:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

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
    // InternalReqLanguage.g:1145:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalReqLanguage.g:1145:44: (iv_ruleAND= ruleAND EOF )
            // InternalReqLanguage.g:1146:2: iv_ruleAND= ruleAND EOF
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
    // InternalReqLanguage.g:1152:1: ruleAND returns [EObject current=null] : (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1158:2: ( (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            // InternalReqLanguage.g:1159:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            {
            // InternalReqLanguage.g:1159:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            // InternalReqLanguage.g:1160:3: otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalReqLanguage.g:1164:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1165:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1165:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1166:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getANDAccess().getANDKeyword_2());
            		
            // InternalReqLanguage.g:1187:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1188:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1188:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1189:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalReqLanguage.g:1214:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalReqLanguage.g:1214:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalReqLanguage.g:1215:2: iv_ruleNOT= ruleNOT EOF
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
    // InternalReqLanguage.g:1221:1: ruleNOT returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operand1_2_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1227:2: ( (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalReqLanguage.g:1228:2: (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalReqLanguage.g:1228:2: (otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalReqLanguage.g:1229:3: otherlv_0= '(' otherlv_1= 'NOT' ( (lv_operand1_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getNOTKeyword_1());
            		
            // InternalReqLanguage.g:1237:3: ( (lv_operand1_2_0= ruleExpression ) )
            // InternalReqLanguage.g:1238:4: (lv_operand1_2_0= ruleExpression )
            {
            // InternalReqLanguage.g:1238:4: (lv_operand1_2_0= ruleExpression )
            // InternalReqLanguage.g:1239:5: lv_operand1_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNOTAccess().getOperand1ExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

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
    // InternalReqLanguage.g:1264:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalReqLanguage.g:1264:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalReqLanguage.g:1265:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalReqLanguage.g:1271:1: ruleLiteral returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1277:2: ( ( ( ruleEString ) ) )
            // InternalReqLanguage.g:1278:2: ( ( ruleEString ) )
            {
            // InternalReqLanguage.g:1278:2: ( ( ruleEString ) )
            // InternalReqLanguage.g:1279:3: ( ruleEString )
            {
            // InternalReqLanguage.g:1279:3: ( ruleEString )
            // InternalReqLanguage.g:1280:4: ruleEString
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
    // InternalReqLanguage.g:1297:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalReqLanguage.g:1297:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalReqLanguage.g:1298:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalReqLanguage.g:1304:1: ruleAttributeValue returns [EObject current=null] : ( () otherlv_1= 'attributeValue' ( (lv_value_2_0= ruleEString ) )? otherlv_3= 'of' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1310:2: ( ( () otherlv_1= 'attributeValue' ( (lv_value_2_0= ruleEString ) )? otherlv_3= 'of' ( ( ruleEString ) ) ) )
            // InternalReqLanguage.g:1311:2: ( () otherlv_1= 'attributeValue' ( (lv_value_2_0= ruleEString ) )? otherlv_3= 'of' ( ( ruleEString ) ) )
            {
            // InternalReqLanguage.g:1311:2: ( () otherlv_1= 'attributeValue' ( (lv_value_2_0= ruleEString ) )? otherlv_3= 'of' ( ( ruleEString ) ) )
            // InternalReqLanguage.g:1312:3: () otherlv_1= 'attributeValue' ( (lv_value_2_0= ruleEString ) )? otherlv_3= 'of' ( ( ruleEString ) )
            {
            // InternalReqLanguage.g:1312:3: ()
            // InternalReqLanguage.g:1313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getAttributeValueKeyword_1());
            		
            // InternalReqLanguage.g:1323:3: ( (lv_value_2_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalReqLanguage.g:1324:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalReqLanguage.g:1324:4: (lv_value_2_0= ruleEString )
                    // InternalReqLanguage.g:1325:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeValueAccess().getOfKeyword_3());
            		
            // InternalReqLanguage.g:1346:3: ( ( ruleEString ) )
            // InternalReqLanguage.g:1347:4: ( ruleEString )
            {
            // InternalReqLanguage.g:1347:4: ( ruleEString )
            // InternalReqLanguage.g:1348:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeValueAccess().getValueOfAttributeCrossReference_4_0());
            				
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
    // InternalReqLanguage.g:1366:1: ruleRequirementType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleRequirementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1372:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalReqLanguage.g:1373:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalReqLanguage.g:1373:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 45:
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
                    // InternalReqLanguage.g:1374:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1374:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalReqLanguage.g:1375:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1382:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1382:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    // InternalReqLanguage.g:1383:4: enumLiteral_1= 'NON_FUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1390:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalReqLanguage.g:1390:3: (enumLiteral_2= 'NONE' )
                    // InternalReqLanguage.g:1391:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReqLanguage.g:1398:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalReqLanguage.g:1398:3: (enumLiteral_3= 'OTHER' )
                    // InternalReqLanguage.g:1399:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalReqLanguage.g:1409:1: ruleRequirementPriority returns [Enumerator current=null] : ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) ;
    public final Enumerator ruleRequirementPriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1415:2: ( ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) )
            // InternalReqLanguage.g:1416:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            {
            // InternalReqLanguage.g:1416:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt24=1;
                }
                break;
            case 47:
                {
                alt24=2;
                }
                break;
            case 48:
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
                    // InternalReqLanguage.g:1417:3: (enumLiteral_0= 'ESSENTIAL' )
                    {
                    // InternalReqLanguage.g:1417:3: (enumLiteral_0= 'ESSENTIAL' )
                    // InternalReqLanguage.g:1418:4: enumLiteral_0= 'ESSENTIAL'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1425:3: (enumLiteral_1= 'CONDITIONAL' )
                    {
                    // InternalReqLanguage.g:1425:3: (enumLiteral_1= 'CONDITIONAL' )
                    // InternalReqLanguage.g:1426:4: enumLiteral_1= 'CONDITIONAL'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1433:3: (enumLiteral_2= 'OPTIONAL' )
                    {
                    // InternalReqLanguage.g:1433:3: (enumLiteral_2= 'OPTIONAL' )
                    // InternalReqLanguage.g:1434:4: enumLiteral_2= 'OPTIONAL'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000002080D002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000002080C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020808002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001200000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001200000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008008002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});

}