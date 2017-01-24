package de.tubs.cs.isf.reqeditor.administration.parser.antlr.internal;

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
import de.tubs.cs.isf.reqeditor.administration.services.ReqAdminGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqAdminParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RequirementsModel'", "'author'", "'version'", "'elements'", "'{'", "','", "'}'", "'attributes'", "'Create'", "'Attribute'", "'Constraint'", "'with'", "'expression'", "'RequirementsGroup'", "'id'", "'description:'", "'constraints'", "'Requirement'", "'description'", "'type'", "'priority'", "'create'", "'Expression with'", "'AttributeValue'", "'value of'", "'with value'", "'FUNCTIONAL'", "'NON_FUNCTIONAL'", "'NONE'", "'OTHER'", "'ESSENTIAL'", "'CONDITIONAL'", "'OPTIONAL'"
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalReqAdminParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqAdminParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqAdminParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqAdmin.g"; }



     	private ReqAdminGrammarAccess grammarAccess;

        public InternalReqAdminParser(TokenStream input, ReqAdminGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RequirementsModel";
       	}

       	@Override
       	protected ReqAdminGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequirementsModel"
    // InternalReqAdmin.g:65:1: entryRuleRequirementsModel returns [EObject current=null] : iv_ruleRequirementsModel= ruleRequirementsModel EOF ;
    public final EObject entryRuleRequirementsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsModel = null;


        try {
            // InternalReqAdmin.g:65:58: (iv_ruleRequirementsModel= ruleRequirementsModel EOF )
            // InternalReqAdmin.g:66:2: iv_ruleRequirementsModel= ruleRequirementsModel EOF
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
    // InternalReqAdmin.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( () otherlv_1= 'RequirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )? (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_creator_4_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        EObject lv_elements_9_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_attributes_15_0 = null;

        EObject lv_attributes_17_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:78:2: ( ( () otherlv_1= 'RequirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )? (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? ) )
            // InternalReqAdmin.g:79:2: ( () otherlv_1= 'RequirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )? (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? )
            {
            // InternalReqAdmin.g:79:2: ( () otherlv_1= 'RequirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )? (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )? )
            // InternalReqAdmin.g:80:3: () otherlv_1= 'RequirementsModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )? (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )? (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )?
            {
            // InternalReqAdmin.g:80:3: ()
            // InternalReqAdmin.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsModelAccess().getRequirementsModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsModelAccess().getRequirementsModelKeyword_1());
            		
            // InternalReqAdmin.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqAdmin.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqAdmin.g:92:4: (lv_name_2_0= ruleEString )
            // InternalReqAdmin.g:93:5: lv_name_2_0= ruleEString
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
            						"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqAdmin.g:110:3: (otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalReqAdmin.g:111:4: otherlv_3= 'author' ( (lv_creator_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementsModelAccess().getAuthorKeyword_3_0());
                    			
                    // InternalReqAdmin.g:115:4: ( (lv_creator_4_0= ruleEString ) )
                    // InternalReqAdmin.g:116:5: (lv_creator_4_0= ruleEString )
                    {
                    // InternalReqAdmin.g:116:5: (lv_creator_4_0= ruleEString )
                    // InternalReqAdmin.g:117:6: lv_creator_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getCreatorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_creator_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"creator",
                    							lv_creator_4_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:135:3: (otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqAdmin.g:136:4: otherlv_5= 'version' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementsModelAccess().getVersionKeyword_4_0());
                    			
                    // InternalReqAdmin.g:140:4: ( (lv_version_6_0= ruleEString ) )
                    // InternalReqAdmin.g:141:5: (lv_version_6_0= ruleEString )
                    {
                    // InternalReqAdmin.g:141:5: (lv_version_6_0= ruleEString )
                    // InternalReqAdmin.g:142:6: lv_version_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getVersionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_version_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_6_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:160:3: (otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqAdmin.g:161:4: otherlv_7= 'elements' otherlv_8= '{' ( (lv_elements_9_0= ruleRequirementModelElement ) ) (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementsModelAccess().getElementsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementsModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalReqAdmin.g:169:4: ( (lv_elements_9_0= ruleRequirementModelElement ) )
                    // InternalReqAdmin.g:170:5: (lv_elements_9_0= ruleRequirementModelElement )
                    {
                    // InternalReqAdmin.g:170:5: (lv_elements_9_0= ruleRequirementModelElement )
                    // InternalReqAdmin.g:171:6: lv_elements_9_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_elements_9_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_9_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:188:4: (otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReqAdmin.g:189:5: otherlv_10= ',' ( (lv_elements_11_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRequirementsModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalReqAdmin.g:193:5: ( (lv_elements_11_0= ruleRequirementModelElement ) )
                    	    // InternalReqAdmin.g:194:6: (lv_elements_11_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqAdmin.g:194:6: (lv_elements_11_0= ruleRequirementModelElement )
                    	    // InternalReqAdmin.g:195:7: lv_elements_11_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_elements_11_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_11_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementModelElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementsModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalReqAdmin.g:218:3: (otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqAdmin.g:219:4: otherlv_13= 'attributes' otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementsModelAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalReqAdmin.g:227:4: ( (lv_attributes_15_0= ruleAttribute ) )
                    // InternalReqAdmin.g:228:5: (lv_attributes_15_0= ruleAttribute )
                    {
                    // InternalReqAdmin.g:228:5: (lv_attributes_15_0= ruleAttribute )
                    // InternalReqAdmin.g:229:6: lv_attributes_15_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_attributes_15_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_15_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:246:4: (otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqAdmin.g:247:5: otherlv_16= ',' ( (lv_attributes_17_0= ruleAttribute ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRequirementsModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalReqAdmin.g:251:5: ( (lv_attributes_17_0= ruleAttribute ) )
                    	    // InternalReqAdmin.g:252:6: (lv_attributes_17_0= ruleAttribute )
                    	    {
                    	    // InternalReqAdmin.g:252:6: (lv_attributes_17_0= ruleAttribute )
                    	    // InternalReqAdmin.g:253:7: lv_attributes_17_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_attributes_17_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_17_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementsModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

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
    // InternalReqAdmin.g:280:1: entryRuleRequirementModelElement returns [EObject current=null] : iv_ruleRequirementModelElement= ruleRequirementModelElement EOF ;
    public final EObject entryRuleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementModelElement = null;


        try {
            // InternalReqAdmin.g:280:64: (iv_ruleRequirementModelElement= ruleRequirementModelElement EOF )
            // InternalReqAdmin.g:281:2: iv_ruleRequirementModelElement= ruleRequirementModelElement EOF
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
    // InternalReqAdmin.g:287:1: ruleRequirementModelElement returns [EObject current=null] : ( (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup ) | (otherlv_2= 'Create' this_Requirement_3= ruleRequirement ) ) ;
    public final EObject ruleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_RequirementsGroup_1 = null;

        EObject this_Requirement_3 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:293:2: ( ( (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup ) | (otherlv_2= 'Create' this_Requirement_3= ruleRequirement ) ) )
            // InternalReqAdmin.g:294:2: ( (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup ) | (otherlv_2= 'Create' this_Requirement_3= ruleRequirement ) )
            {
            // InternalReqAdmin.g:294:2: ( (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup ) | (otherlv_2= 'Create' this_Requirement_3= ruleRequirement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==28) ) {
                    alt7=2;
                }
                else if ( (LA7_1==24) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqAdmin.g:295:3: (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup )
                    {
                    // InternalReqAdmin.g:295:3: (otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup )
                    // InternalReqAdmin.g:296:4: otherlv_0= 'Create' this_RequirementsGroup_1= ruleRequirementsGroup
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getRequirementModelElementAccess().getCreateKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementsGroupParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_RequirementsGroup_1=ruleRequirementsGroup();

                    state._fsp--;


                    				current = this_RequirementsGroup_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqAdmin.g:310:3: (otherlv_2= 'Create' this_Requirement_3= ruleRequirement )
                    {
                    // InternalReqAdmin.g:310:3: (otherlv_2= 'Create' this_Requirement_3= ruleRequirement )
                    // InternalReqAdmin.g:311:4: otherlv_2= 'Create' this_Requirement_3= ruleRequirement
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementModelElementAccess().getCreateKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getRequirementModelElementAccess().getRequirementParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Requirement_3=ruleRequirement();

                    state._fsp--;


                    				current = this_Requirement_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleRequirementModelElement"


    // $ANTLR start "entryRuleEString"
    // InternalReqAdmin.g:328:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReqAdmin.g:328:47: (iv_ruleEString= ruleEString EOF )
            // InternalReqAdmin.g:329:2: iv_ruleEString= ruleEString EOF
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
    // InternalReqAdmin.g:335:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalReqAdmin.g:341:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalReqAdmin.g:342:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalReqAdmin.g:342:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReqAdmin.g:343:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqAdmin.g:351:3: this_ID_1= RULE_ID
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
    // InternalReqAdmin.g:362:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalReqAdmin.g:362:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalReqAdmin.g:363:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalReqAdmin.g:369:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_id_2_0= ruleEString ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:375:2: ( ( () otherlv_1= 'Attribute' ( (lv_id_2_0= ruleEString ) )? ) )
            // InternalReqAdmin.g:376:2: ( () otherlv_1= 'Attribute' ( (lv_id_2_0= ruleEString ) )? )
            {
            // InternalReqAdmin.g:376:2: ( () otherlv_1= 'Attribute' ( (lv_id_2_0= ruleEString ) )? )
            // InternalReqAdmin.g:377:3: () otherlv_1= 'Attribute' ( (lv_id_2_0= ruleEString ) )?
            {
            // InternalReqAdmin.g:377:3: ()
            // InternalReqAdmin.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalReqAdmin.g:388:3: ( (lv_id_2_0= ruleEString ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqAdmin.g:389:4: (lv_id_2_0= ruleEString )
                    {
                    // InternalReqAdmin.g:389:4: (lv_id_2_0= ruleEString )
                    // InternalReqAdmin.g:390:5: lv_id_2_0= ruleEString
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
                    						"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleConstraint"
    // InternalReqAdmin.g:411:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalReqAdmin.g:411:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalReqAdmin.g:412:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalReqAdmin.g:418:1: ruleConstraint returns [EObject current=null] : ( () otherlv_1= 'Constraint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:424:2: ( ( () otherlv_1= 'Constraint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )? ) )
            // InternalReqAdmin.g:425:2: ( () otherlv_1= 'Constraint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )? )
            {
            // InternalReqAdmin.g:425:2: ( () otherlv_1= 'Constraint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )? )
            // InternalReqAdmin.g:426:3: () otherlv_1= 'Constraint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )?
            {
            // InternalReqAdmin.g:426:3: ()
            // InternalReqAdmin.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalReqAdmin.g:437:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqAdmin.g:438:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqAdmin.g:438:4: (lv_name_2_0= ruleEString )
            // InternalReqAdmin.g:439:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getWithKeyword_3());
            		
            // InternalReqAdmin.g:460:3: (otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqAdmin.g:461:4: otherlv_4= 'expression' otherlv_5= '{' ( (lv_expression_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getExpressionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalReqAdmin.g:469:4: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalReqAdmin.g:470:5: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalReqAdmin.g:470:5: (lv_expression_6_0= ruleExpression )
                    // InternalReqAdmin.g:471:6: lv_expression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:488:4: (otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReqAdmin.g:489:5: otherlv_7= ',' ( (lv_expression_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalReqAdmin.g:493:5: ( (lv_expression_8_0= ruleExpression ) )
                    	    // InternalReqAdmin.g:494:6: (lv_expression_8_0= ruleExpression )
                    	    {
                    	    // InternalReqAdmin.g:494:6: (lv_expression_8_0= ruleExpression )
                    	    // InternalReqAdmin.g:495:7: lv_expression_8_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_expression_8_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_8_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4_4());
                    			

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
    // InternalReqAdmin.g:522:1: entryRuleRequirementsGroup returns [EObject current=null] : iv_ruleRequirementsGroup= ruleRequirementsGroup EOF ;
    public final EObject entryRuleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsGroup = null;


        try {
            // InternalReqAdmin.g:522:58: (iv_ruleRequirementsGroup= ruleRequirementsGroup EOF )
            // InternalReqAdmin.g:523:2: iv_ruleRequirementsGroup= ruleRequirementsGroup EOF
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
    // InternalReqAdmin.g:529:1: ruleRequirementsGroup returns [EObject current=null] : ( () otherlv_1= 'RequirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? ) ;
    public final EObject ruleRequirementsGroup() throws RecognitionException {
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
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_18_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:535:2: ( ( () otherlv_1= 'RequirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? ) )
            // InternalReqAdmin.g:536:2: ( () otherlv_1= 'RequirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? )
            {
            // InternalReqAdmin.g:536:2: ( () otherlv_1= 'RequirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? )
            // InternalReqAdmin.g:537:3: () otherlv_1= 'RequirementsGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )?
            {
            // InternalReqAdmin.g:537:3: ()
            // InternalReqAdmin.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsGroupAccess().getRequirementsGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsGroupAccess().getRequirementsGroupKeyword_1());
            		
            // InternalReqAdmin.g:548:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqAdmin.g:549:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqAdmin.g:549:4: (lv_name_2_0= ruleEString )
            // InternalReqAdmin.g:550:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementsGroupAccess().getWithKeyword_3());
            		
            // InternalReqAdmin.g:571:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqAdmin.g:572:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementsGroupAccess().getIdKeyword_4_0());
                    			
                    // InternalReqAdmin.g:576:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalReqAdmin.g:577:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalReqAdmin.g:577:5: (lv_id_5_0= ruleEString )
                    // InternalReqAdmin.g:578:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:596:3: (otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqAdmin.g:597:4: otherlv_6= 'description:' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementsGroupAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalReqAdmin.g:601:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalReqAdmin.g:602:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalReqAdmin.g:602:5: (lv_description_7_0= ruleEString )
                    // InternalReqAdmin.g:603:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:621:3: (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReqAdmin.g:622:4: otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementsGroupAccess().getConstraintsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalReqAdmin.g:630:4: ( (lv_constraints_10_0= ruleConstraint ) )
                    // InternalReqAdmin.g:631:5: (lv_constraints_10_0= ruleConstraint )
                    {
                    // InternalReqAdmin.g:631:5: (lv_constraints_10_0= ruleConstraint )
                    // InternalReqAdmin.g:632:6: lv_constraints_10_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_constraints_10_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_10_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:649:4: (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalReqAdmin.g:650:5: otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalReqAdmin.g:654:5: ( (lv_constraints_12_0= ruleConstraint ) )
                    	    // InternalReqAdmin.g:655:6: (lv_constraints_12_0= ruleConstraint )
                    	    {
                    	    // InternalReqAdmin.g:655:6: (lv_constraints_12_0= ruleConstraint )
                    	    // InternalReqAdmin.g:656:7: lv_constraints_12_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_constraints_12_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_12_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementsGroupAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalReqAdmin.g:679:3: (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalReqAdmin.g:680:4: otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsGroupAccess().getElementsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalReqAdmin.g:688:4: ( (lv_elements_16_0= ruleRequirementModelElement ) )
                    // InternalReqAdmin.g:689:5: (lv_elements_16_0= ruleRequirementModelElement )
                    {
                    // InternalReqAdmin.g:689:5: (lv_elements_16_0= ruleRequirementModelElement )
                    // InternalReqAdmin.g:690:6: lv_elements_16_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_elements_16_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_16_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:707:4: (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalReqAdmin.g:708:5: otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalReqAdmin.g:712:5: ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    // InternalReqAdmin.g:713:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqAdmin.g:713:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    // InternalReqAdmin.g:714:7: lv_elements_18_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_elements_18_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_18_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementModelElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementsGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

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
    // InternalReqAdmin.g:741:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqAdmin.g:741:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqAdmin.g:742:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalReqAdmin.g:748:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )? (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )? (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        Enumerator lv_type_10_0 = null;

        Enumerator lv_priority_12_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_constraints_17_0 = null;

        EObject lv_attributes_21_0 = null;

        EObject lv_attributes_23_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:754:2: ( ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )? (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )? (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalReqAdmin.g:755:2: ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )? (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )? (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalReqAdmin.g:755:2: ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )? (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )? (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalReqAdmin.g:756:3: () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'with' otherlv_4= '{' (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )? (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )? (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )? (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalReqAdmin.g:756:3: ()
            // InternalReqAdmin.g:757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            // InternalReqAdmin.g:767:3: ( (lv_name_2_0= ruleEString ) )
            // InternalReqAdmin.g:768:4: (lv_name_2_0= ruleEString )
            {
            // InternalReqAdmin.g:768:4: (lv_name_2_0= ruleEString )
            // InternalReqAdmin.g:769:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getWithKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalReqAdmin.g:794:3: (otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReqAdmin.g:795:4: otherlv_5= 'id' ( (lv_id_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getIdKeyword_5_0());
                    			
                    // InternalReqAdmin.g:799:4: ( (lv_id_6_0= ruleEString ) )
                    // InternalReqAdmin.g:800:5: (lv_id_6_0= ruleEString )
                    {
                    // InternalReqAdmin.g:800:5: (lv_id_6_0= ruleEString )
                    // InternalReqAdmin.g:801:6: lv_id_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_id_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_6_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:819:3: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqAdmin.g:820:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalReqAdmin.g:824:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalReqAdmin.g:825:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalReqAdmin.g:825:5: (lv_description_8_0= ruleEString )
                    // InternalReqAdmin.g:826:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:844:3: (otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReqAdmin.g:845:4: otherlv_9= 'type' ( (lv_type_10_0= ruleRequirementType ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getTypeKeyword_7_0());
                    			
                    // InternalReqAdmin.g:849:4: ( (lv_type_10_0= ruleRequirementType ) )
                    // InternalReqAdmin.g:850:5: (lv_type_10_0= ruleRequirementType )
                    {
                    // InternalReqAdmin.g:850:5: (lv_type_10_0= ruleRequirementType )
                    // InternalReqAdmin.g:851:6: lv_type_10_0= ruleRequirementType
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTypeRequirementTypeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_10_0=ruleRequirementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:869:3: (otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReqAdmin.g:870:4: otherlv_11= 'priority' ( (lv_priority_12_0= ruleRequirementPriority ) )
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getPriorityKeyword_8_0());
                    			
                    // InternalReqAdmin.g:874:4: ( (lv_priority_12_0= ruleRequirementPriority ) )
                    // InternalReqAdmin.g:875:5: (lv_priority_12_0= ruleRequirementPriority )
                    {
                    // InternalReqAdmin.g:875:5: (lv_priority_12_0= ruleRequirementPriority )
                    // InternalReqAdmin.g:876:6: lv_priority_12_0= ruleRequirementPriority
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getPriorityRequirementPriorityEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_priority_12_0=ruleRequirementPriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_12_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.RequirementPriority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:894:3: (otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalReqAdmin.g:895:4: otherlv_13= 'constraints' otherlv_14= '{' ( (lv_constraints_15_0= ruleConstraint ) ) (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getConstraintsKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalReqAdmin.g:903:4: ( (lv_constraints_15_0= ruleConstraint ) )
                    // InternalReqAdmin.g:904:5: (lv_constraints_15_0= ruleConstraint )
                    {
                    // InternalReqAdmin.g:904:5: (lv_constraints_15_0= ruleConstraint )
                    // InternalReqAdmin.g:905:6: lv_constraints_15_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_constraints_15_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_15_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:922:4: (otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalReqAdmin.g:923:5: otherlv_16= ',' ( (lv_constraints_17_0= ruleConstraint ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalReqAdmin.g:927:5: ( (lv_constraints_17_0= ruleConstraint ) )
                    	    // InternalReqAdmin.g:928:6: (lv_constraints_17_0= ruleConstraint )
                    	    {
                    	    // InternalReqAdmin.g:928:6: (lv_constraints_17_0= ruleConstraint )
                    	    // InternalReqAdmin.g:929:7: lv_constraints_17_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_constraints_17_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_17_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalReqAdmin.g:952:3: (otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalReqAdmin.g:953:4: otherlv_19= 'attributes' otherlv_20= '{' ( (lv_attributes_21_0= ruleAttributeValue ) ) (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getAttributesKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalReqAdmin.g:961:4: ( (lv_attributes_21_0= ruleAttributeValue ) )
                    // InternalReqAdmin.g:962:5: (lv_attributes_21_0= ruleAttributeValue )
                    {
                    // InternalReqAdmin.g:962:5: (lv_attributes_21_0= ruleAttributeValue )
                    // InternalReqAdmin.g:963:6: lv_attributes_21_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_attributes_21_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_21_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqAdmin.g:980:4: (otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalReqAdmin.g:981:5: otherlv_22= ',' ( (lv_attributes_23_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_22=(Token)match(input,16,FOLLOW_31); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalReqAdmin.g:985:5: ( (lv_attributes_23_0= ruleAttributeValue ) )
                    	    // InternalReqAdmin.g:986:6: (lv_attributes_23_0= ruleAttributeValue )
                    	    {
                    	    // InternalReqAdmin.g:986:6: (lv_attributes_23_0= ruleAttributeValue )
                    	    // InternalReqAdmin.g:987:7: lv_attributes_23_0= ruleAttributeValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_attributes_23_0=ruleAttributeValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_23_0,
                    	    								"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.AttributeValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,17,FOLLOW_32); 

                    				newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleExpression"
    // InternalReqAdmin.g:1018:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalReqAdmin.g:1018:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalReqAdmin.g:1019:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalReqAdmin.g:1025:1: ruleExpression returns [EObject current=null] : ( () otherlv_1= 'create' otherlv_2= 'Expression with' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalReqAdmin.g:1031:2: ( ( () otherlv_1= 'create' otherlv_2= 'Expression with' ) )
            // InternalReqAdmin.g:1032:2: ( () otherlv_1= 'create' otherlv_2= 'Expression with' )
            {
            // InternalReqAdmin.g:1032:2: ( () otherlv_1= 'create' otherlv_2= 'Expression with' )
            // InternalReqAdmin.g:1033:3: () otherlv_1= 'create' otherlv_2= 'Expression with'
            {
            // InternalReqAdmin.g:1033:3: ()
            // InternalReqAdmin.g:1034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getCreateKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getExpressionWithKeyword_2());
            		

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


    // $ANTLR start "entryRuleAttributeValue"
    // InternalReqAdmin.g:1052:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalReqAdmin.g:1052:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalReqAdmin.g:1053:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalReqAdmin.g:1059:1: ruleAttributeValue returns [EObject current=null] : ( () otherlv_1= 'AttributeValue' (otherlv_2= 'value of' ( ( ruleEString ) ) )? (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalReqAdmin.g:1065:2: ( ( () otherlv_1= 'AttributeValue' (otherlv_2= 'value of' ( ( ruleEString ) ) )? (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )? ) )
            // InternalReqAdmin.g:1066:2: ( () otherlv_1= 'AttributeValue' (otherlv_2= 'value of' ( ( ruleEString ) ) )? (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )? )
            {
            // InternalReqAdmin.g:1066:2: ( () otherlv_1= 'AttributeValue' (otherlv_2= 'value of' ( ( ruleEString ) ) )? (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )? )
            // InternalReqAdmin.g:1067:3: () otherlv_1= 'AttributeValue' (otherlv_2= 'value of' ( ( ruleEString ) ) )? (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )?
            {
            // InternalReqAdmin.g:1067:3: ()
            // InternalReqAdmin.g:1068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getAttributeValueKeyword_1());
            		
            // InternalReqAdmin.g:1078:3: (otherlv_2= 'value of' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReqAdmin.g:1079:4: otherlv_2= 'value of' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeValueAccess().getValueOfKeyword_2_0());
                    			
                    // InternalReqAdmin.g:1083:4: ( ( ruleEString ) )
                    // InternalReqAdmin.g:1084:5: ( ruleEString )
                    {
                    // InternalReqAdmin.g:1084:5: ( ruleEString )
                    // InternalReqAdmin.g:1085:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeValueAccess().getValueOfAttributeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqAdmin.g:1100:3: (otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReqAdmin.g:1101:4: otherlv_4= 'with value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeValueAccess().getWithValueKeyword_3_0());
                    			
                    // InternalReqAdmin.g:1105:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalReqAdmin.g:1106:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalReqAdmin.g:1106:5: (lv_value_5_0= ruleEString )
                    // InternalReqAdmin.g:1107:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.tubs.cs.isf.reqeditor.administration.ReqAdmin.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "ruleRequirementType"
    // InternalReqAdmin.g:1129:1: ruleRequirementType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleRequirementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReqAdmin.g:1135:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalReqAdmin.g:1136:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalReqAdmin.g:1136:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt28=1;
                }
                break;
            case 38:
                {
                alt28=2;
                }
                break;
            case 39:
                {
                alt28=3;
                }
                break;
            case 40:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalReqAdmin.g:1137:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalReqAdmin.g:1137:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalReqAdmin.g:1138:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqAdmin.g:1145:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    {
                    // InternalReqAdmin.g:1145:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    // InternalReqAdmin.g:1146:4: enumLiteral_1= 'NON_FUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqAdmin.g:1153:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalReqAdmin.g:1153:3: (enumLiteral_2= 'NONE' )
                    // InternalReqAdmin.g:1154:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReqAdmin.g:1161:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalReqAdmin.g:1161:3: (enumLiteral_3= 'OTHER' )
                    // InternalReqAdmin.g:1162:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalReqAdmin.g:1172:1: ruleRequirementPriority returns [Enumerator current=null] : ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) ;
    public final Enumerator ruleRequirementPriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqAdmin.g:1178:2: ( ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) )
            // InternalReqAdmin.g:1179:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            {
            // InternalReqAdmin.g:1179:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt29=1;
                }
                break;
            case 42:
                {
                alt29=2;
                }
                break;
            case 43:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalReqAdmin.g:1180:3: (enumLiteral_0= 'ESSENTIAL' )
                    {
                    // InternalReqAdmin.g:1180:3: (enumLiteral_0= 'ESSENTIAL' )
                    // InternalReqAdmin.g:1181:4: enumLiteral_0= 'ESSENTIAL'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqAdmin.g:1188:3: (enumLiteral_1= 'CONDITIONAL' )
                    {
                    // InternalReqAdmin.g:1188:3: (enumLiteral_1= 'CONDITIONAL' )
                    // InternalReqAdmin.g:1189:4: enumLiteral_1= 'CONDITIONAL'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqAdmin.g:1196:3: (enumLiteral_2= 'OPTIONAL' )
                    {
                    // InternalReqAdmin.g:1196:3: (enumLiteral_2= 'OPTIONAL' )
                    // InternalReqAdmin.g:1197:4: enumLiteral_2= 'OPTIONAL'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000047002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000046002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E004002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C004002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000EA060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E8060000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C8060000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000088060000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008060000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000002L});

}