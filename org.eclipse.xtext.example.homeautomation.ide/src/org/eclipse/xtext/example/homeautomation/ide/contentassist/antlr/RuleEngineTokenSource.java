/*
 * generated by Xtext 2.9.1-SNAPSHOT
 */
package org.eclipse.xtext.example.homeautomation.ide.contentassist.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.example.homeautomation.ide.contentassist.antlr.internal.InternalRuleEngineParser;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class RuleEngineTokenSource extends AbstractIndentationTokenSource {

	public RuleEngineTokenSource(TokenSource delegate) {
		super(delegate);
	}
	
	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		return token.getType() == InternalRuleEngineParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		return InternalRuleEngineParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		return InternalRuleEngineParser.RULE_END;
	}
	
	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
