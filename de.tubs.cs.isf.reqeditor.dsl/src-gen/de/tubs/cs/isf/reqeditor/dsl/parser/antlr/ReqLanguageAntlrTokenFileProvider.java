/*
 * generated by Xtext 2.11.0
 */
package de.tubs.cs.isf.reqeditor.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ReqLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/tubs/cs/isf/reqeditor/dsl/parser/antlr/internal/InternalReqLanguage.tokens");
	}
}