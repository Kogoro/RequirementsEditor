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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'new'", "'RequirementsModel'", "'created'", "'by'", "'version'", "'elements'", "'{'", "','", "'}'", "'attributes'", "'Attribute'", "'id'", "'Constraint'", "'RequirementsGroup'", "'description'", "'constraints'", "'Requirement'", "'type'", "'priority'", "'('", "'OR'", "')'", "'['", "'AND'", "']'", "'NOT'", "'operand1'", "'AttributeValue'", "'value'", "'valueOf'", "'FUNCTIONAL'", "'NON_FUNCTIONAL'", "'NONE'", "'OTHER'", "'ESSENTIAL'", "'CONDITIONAL'", "'OPTIONAL'"
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
    // InternalReqLanguage.g:72:1: ruleRequirementsModel returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'RequirementsModel' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )? (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )? ) ;
    public final EObject ruleRequirementsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_creator_6_0 = null;

        AntlrDatatypeRuleToken lv_version_8_0 = null;

        EObject lv_elements_11_0 = null;

        EObject lv_elements_13_0 = null;

        EObject lv_attributes_17_0 = null;

        EObject lv_attributes_19_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:78:2: ( ( () otherlv_1= 'new' otherlv_2= 'RequirementsModel' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )? (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )? ) )
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'new' otherlv_2= 'RequirementsModel' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )? (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )? )
            {
            // InternalReqLanguage.g:79:2: ( () otherlv_1= 'new' otherlv_2= 'RequirementsModel' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )? (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )? )
            // InternalReqLanguage.g:80:3: () otherlv_1= 'new' otherlv_2= 'RequirementsModel' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )? (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )? (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )?
            {
            // InternalReqLanguage.g:80:3: ()
            // InternalReqLanguage.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsModelAccess().getRequirementsModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsModelAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementsModelAccess().getRequirementsModelKeyword_2());
            		
            // InternalReqLanguage.g:95:3: ( (lv_name_3_0= ruleEString ) )
            // InternalReqLanguage.g:96:4: (lv_name_3_0= ruleEString )
            {
            // InternalReqLanguage.g:96:4: (lv_name_3_0= ruleEString )
            // InternalReqLanguage.g:97:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsModelAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:114:3: (otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalReqLanguage.g:115:4: otherlv_4= 'created' otherlv_5= 'by' ( (lv_creator_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementsModelAccess().getCreatedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementsModelAccess().getByKeyword_4_1());
                    			
                    // InternalReqLanguage.g:123:4: ( (lv_creator_6_0= ruleEString ) )
                    // InternalReqLanguage.g:124:5: (lv_creator_6_0= ruleEString )
                    {
                    // InternalReqLanguage.g:124:5: (lv_creator_6_0= ruleEString )
                    // InternalReqLanguage.g:125:6: lv_creator_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getCreatorEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_creator_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"creator",
                    							lv_creator_6_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:143:3: (otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqLanguage.g:144:4: otherlv_7= 'version' ( (lv_version_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementsModelAccess().getVersionKeyword_5_0());
                    			
                    // InternalReqLanguage.g:148:4: ( (lv_version_8_0= ruleEString ) )
                    // InternalReqLanguage.g:149:5: (lv_version_8_0= ruleEString )
                    {
                    // InternalReqLanguage.g:149:5: (lv_version_8_0= ruleEString )
                    // InternalReqLanguage.g:150:6: lv_version_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getVersionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_version_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_8_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:168:3: (otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqLanguage.g:169:4: otherlv_9= 'elements' otherlv_10= '{' ( (lv_elements_11_0= ruleRequirementModelElement ) ) (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsModelAccess().getElementsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementsModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalReqLanguage.g:177:4: ( (lv_elements_11_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:178:5: (lv_elements_11_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:178:5: (lv_elements_11_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:179:6: lv_elements_11_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_elements_11_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_11_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:196:4: (otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReqLanguage.g:197:5: otherlv_12= ',' ( (lv_elements_13_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRequirementsModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalReqLanguage.g:201:5: ( (lv_elements_13_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:202:6: (lv_elements_13_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:202:6: (lv_elements_13_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:203:7: lv_elements_13_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getElementsRequirementModelElementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_elements_13_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_13_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
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

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:226:3: (otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqLanguage.g:227:4: otherlv_15= 'attributes' otherlv_16= '{' ( (lv_attributes_17_0= ruleAttribute ) ) (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsModelAccess().getAttributesKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementsModelAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalReqLanguage.g:235:4: ( (lv_attributes_17_0= ruleAttribute ) )
                    // InternalReqLanguage.g:236:5: (lv_attributes_17_0= ruleAttribute )
                    {
                    // InternalReqLanguage.g:236:5: (lv_attributes_17_0= ruleAttribute )
                    // InternalReqLanguage.g:237:6: lv_attributes_17_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_17_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_17_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:254:4: (otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLanguage.g:255:5: otherlv_18= ',' ( (lv_attributes_19_0= ruleAttribute ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRequirementsModelAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalReqLanguage.g:259:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    // InternalReqLanguage.g:260:6: (lv_attributes_19_0= ruleAttribute )
                    	    {
                    	    // InternalReqLanguage.g:260:6: (lv_attributes_19_0= ruleAttribute )
                    	    // InternalReqLanguage.g:261:7: lv_attributes_19_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsModelAccess().getAttributesAttributeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_19_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_19_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementsModelAccess().getRightCurlyBracketKeyword_7_4());
                    			

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
    // InternalReqLanguage.g:288:1: entryRuleRequirementModelElement returns [EObject current=null] : iv_ruleRequirementModelElement= ruleRequirementModelElement EOF ;
    public final EObject entryRuleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementModelElement = null;


        try {
            // InternalReqLanguage.g:288:64: (iv_ruleRequirementModelElement= ruleRequirementModelElement EOF )
            // InternalReqLanguage.g:289:2: iv_ruleRequirementModelElement= ruleRequirementModelElement EOF
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
    // InternalReqLanguage.g:295:1: ruleRequirementModelElement returns [EObject current=null] : (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) ;
    public final EObject ruleRequirementModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_RequirementsGroup_0 = null;

        EObject this_Requirement_1 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:301:2: ( (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement ) )
            // InternalReqLanguage.g:302:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            {
            // InternalReqLanguage.g:302:2: (this_RequirementsGroup_0= ruleRequirementsGroup | this_Requirement_1= ruleRequirement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==27) ) {
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
                    // InternalReqLanguage.g:303:3: this_RequirementsGroup_0= ruleRequirementsGroup
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
                    // InternalReqLanguage.g:312:3: this_Requirement_1= ruleRequirement
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
    // InternalReqLanguage.g:324:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalReqLanguage.g:324:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalReqLanguage.g:325:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalReqLanguage.g:331:1: ruleExpression returns [EObject current=null] : (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OR_0 = null;

        EObject this_AND_1 = null;

        EObject this_NOT_2 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:337:2: ( (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral ) )
            // InternalReqLanguage.g:338:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            {
            // InternalReqLanguage.g:338:2: (this_OR_0= ruleOR | this_AND_1= ruleAND | this_NOT_2= ruleNOT | this_Literal_3= ruleLiteral )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
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
                    // InternalReqLanguage.g:339:3: this_OR_0= ruleOR
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
                    // InternalReqLanguage.g:348:3: this_AND_1= ruleAND
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
                    // InternalReqLanguage.g:357:3: this_NOT_2= ruleNOT
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
                    // InternalReqLanguage.g:366:3: this_Literal_3= ruleLiteral
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
    // InternalReqLanguage.g:378:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReqLanguage.g:378:47: (iv_ruleEString= ruleEString EOF )
            // InternalReqLanguage.g:379:2: iv_ruleEString= ruleEString EOF
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
    // InternalReqLanguage.g:385:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:391:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalReqLanguage.g:392:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalReqLanguage.g:392:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalReqLanguage.g:393:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:401:3: this_ID_1= RULE_ID
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
    // InternalReqLanguage.g:412:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalReqLanguage.g:412:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalReqLanguage.g:413:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalReqLanguage.g:419:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'Attribute' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:425:2: ( ( () otherlv_1= 'new' otherlv_2= 'Attribute' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? ) )
            // InternalReqLanguage.g:426:2: ( () otherlv_1= 'new' otherlv_2= 'Attribute' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? )
            {
            // InternalReqLanguage.g:426:2: ( () otherlv_1= 'new' otherlv_2= 'Attribute' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? )
            // InternalReqLanguage.g:427:3: () otherlv_1= 'new' otherlv_2= 'Attribute' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            {
            // InternalReqLanguage.g:427:3: ()
            // InternalReqLanguage.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAttributeKeyword_2());
            		
            // InternalReqLanguage.g:442:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReqLanguage.g:443:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getIdKeyword_3_0());
                    			
                    // InternalReqLanguage.g:447:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalReqLanguage.g:448:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalReqLanguage.g:448:5: (lv_id_4_0= ruleEString )
                    // InternalReqLanguage.g:449:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleConstraint"
    // InternalReqLanguage.g:471:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalReqLanguage.g:471:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalReqLanguage.g:472:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalReqLanguage.g:478:1: ruleConstraint returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'Constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? ) ;
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
            // InternalReqLanguage.g:484:2: ( ( () otherlv_1= 'new' otherlv_2= 'Constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? ) )
            // InternalReqLanguage.g:485:2: ( () otherlv_1= 'new' otherlv_2= 'Constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? )
            {
            // InternalReqLanguage.g:485:2: ( () otherlv_1= 'new' otherlv_2= 'Constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )? )
            // InternalReqLanguage.g:486:3: () otherlv_1= 'new' otherlv_2= 'Constraint' ( (lv_name_3_0= ruleEString ) ) ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )?
            {
            // InternalReqLanguage.g:486:3: ()
            // InternalReqLanguage.g:487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstraintAccess().getConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getConstraintKeyword_2());
            		
            // InternalReqLanguage.g:501:3: ( (lv_name_3_0= ruleEString ) )
            // InternalReqLanguage.g:502:4: (lv_name_3_0= ruleEString )
            {
            // InternalReqLanguage.g:502:4: (lv_name_3_0= ruleEString )
            // InternalReqLanguage.g:503:5: lv_name_3_0= ruleEString
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

            // InternalReqLanguage.g:520:3: ( ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==30||LA12_0==33||LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqLanguage.g:521:4: ( (lv_expression_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )*
                    {
                    // InternalReqLanguage.g:521:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalReqLanguage.g:522:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalReqLanguage.g:522:5: (lv_expression_4_0= ruleExpression )
                    // InternalReqLanguage.g:523:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalReqLanguage.g:540:4: (otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            int LA11_2 = input.LA(2);

                            if ( ((LA11_2>=RULE_STRING && LA11_2<=RULE_ID)||LA11_2==30||LA11_2==33||LA11_2==36) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalReqLanguage.g:541:5: otherlv_5= ',' ( (lv_expression_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalReqLanguage.g:545:5: ( (lv_expression_6_0= ruleExpression ) )
                    	    // InternalReqLanguage.g:546:6: (lv_expression_6_0= ruleExpression )
                    	    {
                    	    // InternalReqLanguage.g:546:6: (lv_expression_6_0= ruleExpression )
                    	    // InternalReqLanguage.g:547:7: lv_expression_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getExpressionExpressionParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
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
                    	    break loop11;
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
    // InternalReqLanguage.g:570:1: entryRuleRequirementsGroup returns [EObject current=null] : iv_ruleRequirementsGroup= ruleRequirementsGroup EOF ;
    public final EObject entryRuleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementsGroup = null;


        try {
            // InternalReqLanguage.g:570:58: (iv_ruleRequirementsGroup= ruleRequirementsGroup EOF )
            // InternalReqLanguage.g:571:2: iv_ruleRequirementsGroup= ruleRequirementsGroup EOF
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
    // InternalReqLanguage.g:577:1: ruleRequirementsGroup returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'RequirementsGroup' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? ) ;
    public final EObject ruleRequirementsGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_elements_16_0 = null;

        EObject lv_elements_18_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:583:2: ( ( () otherlv_1= 'new' otherlv_2= 'RequirementsGroup' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? ) )
            // InternalReqLanguage.g:584:2: ( () otherlv_1= 'new' otherlv_2= 'RequirementsGroup' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? )
            {
            // InternalReqLanguage.g:584:2: ( () otherlv_1= 'new' otherlv_2= 'RequirementsGroup' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )? )
            // InternalReqLanguage.g:585:3: () otherlv_1= 'new' otherlv_2= 'RequirementsGroup' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )? (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )?
            {
            // InternalReqLanguage.g:585:3: ()
            // InternalReqLanguage.g:586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsGroupAccess().getRequirementsGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementsGroupAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementsGroupAccess().getRequirementsGroupKeyword_2());
            		
            // InternalReqLanguage.g:600:3: ( (lv_name_3_0= ruleEString ) )
            // InternalReqLanguage.g:601:4: (lv_name_3_0= ruleEString )
            {
            // InternalReqLanguage.g:601:4: (lv_name_3_0= ruleEString )
            // InternalReqLanguage.g:602:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementsGroupAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:619:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqLanguage.g:620:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementsGroupAccess().getIdKeyword_4_0());
                    			
                    // InternalReqLanguage.g:624:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalReqLanguage.g:625:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalReqLanguage.g:625:5: (lv_id_5_0= ruleEString )
                    // InternalReqLanguage.g:626:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
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


                    }
                    break;

            }

            // InternalReqLanguage.g:644:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqLanguage.g:645:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementsGroupAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalReqLanguage.g:649:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalReqLanguage.g:650:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalReqLanguage.g:650:5: (lv_description_7_0= ruleEString )
                    // InternalReqLanguage.g:651:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:669:3: (otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalReqLanguage.g:670:4: otherlv_8= 'constraints' otherlv_9= '{' ( (lv_constraints_10_0= ruleConstraint ) ) (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementsGroupAccess().getConstraintsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalReqLanguage.g:678:4: ( (lv_constraints_10_0= ruleConstraint ) )
                    // InternalReqLanguage.g:679:5: (lv_constraints_10_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:679:5: (lv_constraints_10_0= ruleConstraint )
                    // InternalReqLanguage.g:680:6: lv_constraints_10_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_constraints_10_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_10_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:697:4: (otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalReqLanguage.g:698:5: otherlv_11= ',' ( (lv_constraints_12_0= ruleConstraint ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalReqLanguage.g:702:5: ( (lv_constraints_12_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:703:6: (lv_constraints_12_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:703:6: (lv_constraints_12_0= ruleConstraint )
                    	    // InternalReqLanguage.g:704:7: lv_constraints_12_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getConstraintsConstraintParserRuleCall_6_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementsGroupAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:727:3: (otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReqLanguage.g:728:4: otherlv_14= 'elements' otherlv_15= '{' ( (lv_elements_16_0= ruleRequirementModelElement ) ) (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementsGroupAccess().getElementsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementsGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalReqLanguage.g:736:4: ( (lv_elements_16_0= ruleRequirementModelElement ) )
                    // InternalReqLanguage.g:737:5: (lv_elements_16_0= ruleRequirementModelElement )
                    {
                    // InternalReqLanguage.g:737:5: (lv_elements_16_0= ruleRequirementModelElement )
                    // InternalReqLanguage.g:738:6: lv_elements_16_0= ruleRequirementModelElement
                    {

                    						newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_elements_16_0=ruleRequirementModelElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_16_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementModelElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:755:4: (otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalReqLanguage.g:756:5: otherlv_17= ',' ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRequirementsGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalReqLanguage.g:760:5: ( (lv_elements_18_0= ruleRequirementModelElement ) )
                    	    // InternalReqLanguage.g:761:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    {
                    	    // InternalReqLanguage.g:761:6: (lv_elements_18_0= ruleRequirementModelElement )
                    	    // InternalReqLanguage.g:762:7: lv_elements_18_0= ruleRequirementModelElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementsGroupAccess().getElementsRequirementModelElementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_elements_18_0=ruleRequirementModelElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementsGroupRule());
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_2); 

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
    // InternalReqLanguage.g:789:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqLanguage.g:789:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqLanguage.g:790:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalReqLanguage.g:796:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'Requirement' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        Enumerator lv_type_9_0 = null;

        Enumerator lv_priority_11_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_attributes_20_0 = null;

        EObject lv_attributes_22_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:802:2: ( ( () otherlv_1= 'new' otherlv_2= 'Requirement' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )? ) )
            // InternalReqLanguage.g:803:2: ( () otherlv_1= 'new' otherlv_2= 'Requirement' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )? )
            {
            // InternalReqLanguage.g:803:2: ( () otherlv_1= 'new' otherlv_2= 'Requirement' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )? )
            // InternalReqLanguage.g:804:3: () otherlv_1= 'new' otherlv_2= 'Requirement' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )? (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )? (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )?
            {
            // InternalReqLanguage.g:804:3: ()
            // InternalReqLanguage.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getRequirementKeyword_2());
            		
            // InternalReqLanguage.g:819:3: ( (lv_name_3_0= ruleEString ) )
            // InternalReqLanguage.g:820:4: (lv_name_3_0= ruleEString )
            {
            // InternalReqLanguage.g:820:4: (lv_name_3_0= ruleEString )
            // InternalReqLanguage.g:821:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLanguage.g:838:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqLanguage.g:839:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getIdKeyword_4_0());
                    			
                    // InternalReqLanguage.g:843:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalReqLanguage.g:844:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalReqLanguage.g:844:5: (lv_id_5_0= ruleEString )
                    // InternalReqLanguage.g:845:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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


                    }
                    break;

            }

            // InternalReqLanguage.g:863:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReqLanguage.g:864:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalReqLanguage.g:868:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalReqLanguage.g:869:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalReqLanguage.g:869:5: (lv_description_7_0= ruleEString )
                    // InternalReqLanguage.g:870:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:888:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReqLanguage.g:889:4: otherlv_8= 'type' ( (lv_type_9_0= ruleRequirementType ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getTypeKeyword_6_0());
                    			
                    // InternalReqLanguage.g:893:4: ( (lv_type_9_0= ruleRequirementType ) )
                    // InternalReqLanguage.g:894:5: (lv_type_9_0= ruleRequirementType )
                    {
                    // InternalReqLanguage.g:894:5: (lv_type_9_0= ruleRequirementType )
                    // InternalReqLanguage.g:895:6: lv_type_9_0= ruleRequirementType
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTypeRequirementTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_type_9_0=ruleRequirementType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:913:3: (otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalReqLanguage.g:914:4: otherlv_10= 'priority' ( (lv_priority_11_0= ruleRequirementPriority ) )
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getPriorityKeyword_7_0());
                    			
                    // InternalReqLanguage.g:918:4: ( (lv_priority_11_0= ruleRequirementPriority ) )
                    // InternalReqLanguage.g:919:5: (lv_priority_11_0= ruleRequirementPriority )
                    {
                    // InternalReqLanguage.g:919:5: (lv_priority_11_0= ruleRequirementPriority )
                    // InternalReqLanguage.g:920:6: lv_priority_11_0= ruleRequirementPriority
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getPriorityRequirementPriorityEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_priority_11_0=ruleRequirementPriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_11_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.RequirementPriority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:938:3: (otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalReqLanguage.g:939:4: otherlv_12= 'constraints' otherlv_13= '{' ( (lv_constraints_14_0= ruleConstraint ) ) (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getConstraintsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalReqLanguage.g:947:4: ( (lv_constraints_14_0= ruleConstraint ) )
                    // InternalReqLanguage.g:948:5: (lv_constraints_14_0= ruleConstraint )
                    {
                    // InternalReqLanguage.g:948:5: (lv_constraints_14_0= ruleConstraint )
                    // InternalReqLanguage.g:949:6: lv_constraints_14_0= ruleConstraint
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_constraints_14_0=ruleConstraint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_14_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:966:4: (otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalReqLanguage.g:967:5: otherlv_15= ',' ( (lv_constraints_16_0= ruleConstraint ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalReqLanguage.g:971:5: ( (lv_constraints_16_0= ruleConstraint ) )
                    	    // InternalReqLanguage.g:972:6: (lv_constraints_16_0= ruleConstraint )
                    	    {
                    	    // InternalReqLanguage.g:972:6: (lv_constraints_16_0= ruleConstraint )
                    	    // InternalReqLanguage.g:973:7: lv_constraints_16_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getConstraintsConstraintParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_constraints_16_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_16_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalReqLanguage.g:996:3: (otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReqLanguage.g:997:4: otherlv_18= 'attributes' otherlv_19= '{' ( (lv_attributes_20_0= ruleAttributeValue ) ) (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getAttributesKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalReqLanguage.g:1005:4: ( (lv_attributes_20_0= ruleAttributeValue ) )
                    // InternalReqLanguage.g:1006:5: (lv_attributes_20_0= ruleAttributeValue )
                    {
                    // InternalReqLanguage.g:1006:5: (lv_attributes_20_0= ruleAttributeValue )
                    // InternalReqLanguage.g:1007:6: lv_attributes_20_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_attributes_20_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_20_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLanguage.g:1024:4: (otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalReqLanguage.g:1025:5: otherlv_21= ',' ( (lv_attributes_22_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalReqLanguage.g:1029:5: ( (lv_attributes_22_0= ruleAttributeValue ) )
                    	    // InternalReqLanguage.g:1030:6: (lv_attributes_22_0= ruleAttributeValue )
                    	    {
                    	    // InternalReqLanguage.g:1030:6: (lv_attributes_22_0= ruleAttributeValue )
                    	    // InternalReqLanguage.g:1031:7: lv_attributes_22_0= ruleAttributeValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getAttributesAttributeValueParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_attributes_22_0=ruleAttributeValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_22_0,
                    	    								"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.AttributeValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

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
    // InternalReqLanguage.g:1058:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // InternalReqLanguage.g:1058:43: (iv_ruleOR= ruleOR EOF )
            // InternalReqLanguage.g:1059:2: iv_ruleOR= ruleOR EOF
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
    // InternalReqLanguage.g:1065:1: ruleOR returns [EObject current=null] : (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1071:2: ( (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalReqLanguage.g:1072:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalReqLanguage.g:1072:2: (otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalReqLanguage.g:1073:3: otherlv_0= '(' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'OR' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getORAccess().getLeftParenthesisKeyword_0());
            		
            // InternalReqLanguage.g:1077:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1078:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1078:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1079:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_2=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getORAccess().getORKeyword_2());
            		
            // InternalReqLanguage.g:1100:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1101:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1101:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1102:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getORAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalReqLanguage.g:1127:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalReqLanguage.g:1127:44: (iv_ruleAND= ruleAND EOF )
            // InternalReqLanguage.g:1128:2: iv_ruleAND= ruleAND EOF
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
    // InternalReqLanguage.g:1134:1: ruleAND returns [EObject current=null] : (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_1_0 = null;

        EObject lv_operand2_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1140:2: ( (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            // InternalReqLanguage.g:1141:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            {
            // InternalReqLanguage.g:1141:2: (otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']' )
            // InternalReqLanguage.g:1142:3: otherlv_0= '[' ( (lv_operand1_1_0= ruleExpression ) ) otherlv_2= 'AND' ( (lv_operand2_3_0= ruleExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalReqLanguage.g:1146:3: ( (lv_operand1_1_0= ruleExpression ) )
            // InternalReqLanguage.g:1147:4: (lv_operand1_1_0= ruleExpression )
            {
            // InternalReqLanguage.g:1147:4: (lv_operand1_1_0= ruleExpression )
            // InternalReqLanguage.g:1148:5: lv_operand1_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand1ExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_2=(Token)match(input,34,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getANDAccess().getANDKeyword_2());
            		
            // InternalReqLanguage.g:1169:3: ( (lv_operand2_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1170:4: (lv_operand2_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1170:4: (lv_operand2_3_0= ruleExpression )
            // InternalReqLanguage.g:1171:5: lv_operand2_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getANDAccess().getOperand2ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

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
    // InternalReqLanguage.g:1196:1: entryRuleNOT returns [EObject current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final EObject entryRuleNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOT = null;


        try {
            // InternalReqLanguage.g:1196:44: (iv_ruleNOT= ruleNOT EOF )
            // InternalReqLanguage.g:1197:2: iv_ruleNOT= ruleNOT EOF
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
    // InternalReqLanguage.g:1203:1: ruleNOT returns [EObject current=null] : (otherlv_0= 'NOT' otherlv_1= '(' otherlv_2= 'operand1' ( (lv_operand1_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operand1_3_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1209:2: ( (otherlv_0= 'NOT' otherlv_1= '(' otherlv_2= 'operand1' ( (lv_operand1_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalReqLanguage.g:1210:2: (otherlv_0= 'NOT' otherlv_1= '(' otherlv_2= 'operand1' ( (lv_operand1_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalReqLanguage.g:1210:2: (otherlv_0= 'NOT' otherlv_1= '(' otherlv_2= 'operand1' ( (lv_operand1_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalReqLanguage.g:1211:3: otherlv_0= 'NOT' otherlv_1= '(' otherlv_2= 'operand1' ( (lv_operand1_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getNOTAccess().getNOTKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getNOTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNOTAccess().getOperand1Keyword_2());
            		
            // InternalReqLanguage.g:1223:3: ( (lv_operand1_3_0= ruleExpression ) )
            // InternalReqLanguage.g:1224:4: (lv_operand1_3_0= ruleExpression )
            {
            // InternalReqLanguage.g:1224:4: (lv_operand1_3_0= ruleExpression )
            // InternalReqLanguage.g:1225:5: lv_operand1_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNOTAccess().getOperand1ExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_33);
            lv_operand1_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNOTRule());
            					}
            					set(
            						current,
            						"operand1",
            						lv_operand1_3_0,
            						"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNOTAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalReqLanguage.g:1250:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalReqLanguage.g:1250:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalReqLanguage.g:1251:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalReqLanguage.g:1257:1: ruleLiteral returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1263:2: ( ( ( ruleEString ) ) )
            // InternalReqLanguage.g:1264:2: ( ( ruleEString ) )
            {
            // InternalReqLanguage.g:1264:2: ( ( ruleEString ) )
            // InternalReqLanguage.g:1265:3: ( ruleEString )
            {
            // InternalReqLanguage.g:1265:3: ( ruleEString )
            // InternalReqLanguage.g:1266:4: ruleEString
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
    // InternalReqLanguage.g:1283:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalReqLanguage.g:1283:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalReqLanguage.g:1284:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalReqLanguage.g:1290:1: ruleAttributeValue returns [EObject current=null] : ( () otherlv_1= 'new' otherlv_2= 'AttributeValue' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'valueOf' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReqLanguage.g:1296:2: ( ( () otherlv_1= 'new' otherlv_2= 'AttributeValue' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'valueOf' ( ( ruleEString ) ) )? ) )
            // InternalReqLanguage.g:1297:2: ( () otherlv_1= 'new' otherlv_2= 'AttributeValue' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'valueOf' ( ( ruleEString ) ) )? )
            {
            // InternalReqLanguage.g:1297:2: ( () otherlv_1= 'new' otherlv_2= 'AttributeValue' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'valueOf' ( ( ruleEString ) ) )? )
            // InternalReqLanguage.g:1298:3: () otherlv_1= 'new' otherlv_2= 'AttributeValue' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'valueOf' ( ( ruleEString ) ) )?
            {
            // InternalReqLanguage.g:1298:3: ()
            // InternalReqLanguage.g:1299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeValueAccess().getAttributeValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueAccess().getNewKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeValueAccess().getAttributeValueKeyword_2());
            		
            // InternalReqLanguage.g:1313:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReqLanguage.g:1314:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeValueAccess().getValueKeyword_3_0());
                    			
                    // InternalReqLanguage.g:1318:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalReqLanguage.g:1319:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalReqLanguage.g:1319:5: (lv_value_4_0= ruleEString )
                    // InternalReqLanguage.g:1320:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.tubs.cs.isf.reqeditor.dsl.ReqLanguage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqLanguage.g:1338:3: (otherlv_5= 'valueOf' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalReqLanguage.g:1339:4: otherlv_5= 'valueOf' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeValueAccess().getValueOfKeyword_4_0());
                    			
                    // InternalReqLanguage.g:1343:4: ( ( ruleEString ) )
                    // InternalReqLanguage.g:1344:5: ( ruleEString )
                    {
                    // InternalReqLanguage.g:1344:5: ( ruleEString )
                    // InternalReqLanguage.g:1345:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeValueAccess().getValueOfAttributeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // InternalReqLanguage.g:1364:1: ruleRequirementType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) ;
    public final Enumerator ruleRequirementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1370:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) ) )
            // InternalReqLanguage.g:1371:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            {
            // InternalReqLanguage.g:1371:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NON_FUNCTIONAL' ) | (enumLiteral_2= 'NONE' ) | (enumLiteral_3= 'OTHER' ) )
            int alt29=4;
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
            case 44:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalReqLanguage.g:1372:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1372:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalReqLanguage.g:1373:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1380:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    {
                    // InternalReqLanguage.g:1380:3: (enumLiteral_1= 'NON_FUNCTIONAL' )
                    // InternalReqLanguage.g:1381:4: enumLiteral_1= 'NON_FUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementTypeAccess().getNON_FUNCTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1388:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalReqLanguage.g:1388:3: (enumLiteral_2= 'NONE' )
                    // InternalReqLanguage.g:1389:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRequirementTypeAccess().getNONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReqLanguage.g:1396:3: (enumLiteral_3= 'OTHER' )
                    {
                    // InternalReqLanguage.g:1396:3: (enumLiteral_3= 'OTHER' )
                    // InternalReqLanguage.g:1397:4: enumLiteral_3= 'OTHER'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

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
    // InternalReqLanguage.g:1407:1: ruleRequirementPriority returns [Enumerator current=null] : ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) ;
    public final Enumerator ruleRequirementPriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqLanguage.g:1413:2: ( ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) ) )
            // InternalReqLanguage.g:1414:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            {
            // InternalReqLanguage.g:1414:2: ( (enumLiteral_0= 'ESSENTIAL' ) | (enumLiteral_1= 'CONDITIONAL' ) | (enumLiteral_2= 'OPTIONAL' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalReqLanguage.g:1415:3: (enumLiteral_0= 'ESSENTIAL' )
                    {
                    // InternalReqLanguage.g:1415:3: (enumLiteral_0= 'ESSENTIAL' )
                    // InternalReqLanguage.g:1416:4: enumLiteral_0= 'ESSENTIAL'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRequirementPriorityAccess().getESSENTIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLanguage.g:1423:3: (enumLiteral_1= 'CONDITIONAL' )
                    {
                    // InternalReqLanguage.g:1423:3: (enumLiteral_1= 'CONDITIONAL' )
                    // InternalReqLanguage.g:1424:4: enumLiteral_1= 'CONDITIONAL'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRequirementPriorityAccess().getCONDITIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLanguage.g:1431:3: (enumLiteral_2= 'OPTIONAL' )
                    {
                    // InternalReqLanguage.g:1431:3: (enumLiteral_2= 'OPTIONAL' )
                    // InternalReqLanguage.g:1432:4: enumLiteral_2= 'OPTIONAL'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000011A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000118002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001240000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001240000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006410002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006010002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000036500002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000036100002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000034100002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000024100002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004100002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000002L});

}