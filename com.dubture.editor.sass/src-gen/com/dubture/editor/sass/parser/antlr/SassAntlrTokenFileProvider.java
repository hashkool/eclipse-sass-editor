/*
* generated by Xtext
*/
package com.dubture.editor.sass.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SassAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/dubture/editor/sass/parser/antlr/internal/InternalSass.tokens");
	}
}
