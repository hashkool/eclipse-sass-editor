package com.dubture.editor.sass.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSassLexer extends Lexer {
    public static final int RULE_AMP=16;
    public static final int RULE_ID=21;
    public static final int RULE_BRACE_RIGHT=8;
    public static final int RULE_ANY_OTHER=25;
    public static final int RULE_COMMA=9;
    public static final int RULE_INCLUDE_ID=12;
    public static final int RULE_MIXIN_ID=13;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=23;
    public static final int RULE_ML_COMMENT=22;
    public static final int RULE_PAREN_LEFT=14;
    public static final int RULE_BRACE_LEFT=7;
    public static final int RULE_DOLLAR=19;
    public static final int RULE_COLON=4;
    public static final int RULE_STRING=11;
    public static final int RULE_DOT=18;
    public static final int RULE_CHARSET_ID=10;
    public static final int RULE_PAREN_RIGHT=15;
    public static final int RULE_SEMI_COLON=6;
    public static final int RULE_INT=20;
    public static final int RULE_WS=24;
    public static final int RULE_SHARP=17;
    public static final int RULE_WORD=5;

    // delegates
    // delegators

    public InternalSassLexer() {;} 
    public InternalSassLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSassLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g"; }

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:686:10: ( '.' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:686:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:688:12: ( ',' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:688:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SHARP"
    public final void mRULE_SHARP() throws RecognitionException {
        try {
            int _type = RULE_SHARP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:690:12: ( '#' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:690:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHARP"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:692:12: ( ':' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:692:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMI_COLON"
    public final void mRULE_SEMI_COLON() throws RecognitionException {
        try {
            int _type = RULE_SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:694:17: ( ';' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:694:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI_COLON"

    // $ANTLR start "RULE_PAREN_LEFT"
    public final void mRULE_PAREN_LEFT() throws RecognitionException {
        try {
            int _type = RULE_PAREN_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:696:17: ( '(' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:696:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAREN_LEFT"

    // $ANTLR start "RULE_PAREN_RIGHT"
    public final void mRULE_PAREN_RIGHT() throws RecognitionException {
        try {
            int _type = RULE_PAREN_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:698:18: ( ')' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:698:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PAREN_RIGHT"

    // $ANTLR start "RULE_BRACE_LEFT"
    public final void mRULE_BRACE_LEFT() throws RecognitionException {
        try {
            int _type = RULE_BRACE_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:700:17: ( '{' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:700:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_LEFT"

    // $ANTLR start "RULE_BRACE_RIGHT"
    public final void mRULE_BRACE_RIGHT() throws RecognitionException {
        try {
            int _type = RULE_BRACE_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:702:18: ( '}' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:702:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_RIGHT"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:704:13: ( '$' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:704:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_AMP"
    public final void mRULE_AMP() throws RecognitionException {
        try {
            int _type = RULE_AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:706:10: ( '&' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:706:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMP"

    // $ANTLR start "RULE_CHARSET_ID"
    public final void mRULE_CHARSET_ID() throws RecognitionException {
        try {
            int _type = RULE_CHARSET_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:708:17: ( '@charset ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:708:19: '@charset '
            {
            match("@charset "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARSET_ID"

    // $ANTLR start "RULE_INCLUDE_ID"
    public final void mRULE_INCLUDE_ID() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:710:17: ( '@include ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:710:19: '@include '
            {
            match("@include "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE_ID"

    // $ANTLR start "RULE_MIXIN_ID"
    public final void mRULE_MIXIN_ID() throws RecognitionException {
        try {
            int _type = RULE_MIXIN_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:712:15: ( '@mixin ' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:712:17: '@mixin '
            {
            match("@mixin "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIXIN_ID"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:714:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:714:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:714:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='%'||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( input.LA(1)=='%'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:716:10: ( 'INT has been deactivated' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:716:12: 'INT has been deactivated'
            {
            match("INT has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:718:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:718:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:718:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:718:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:718:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:720:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:722:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:722:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:722:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:722:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:41: ( '\\r' )? '\\n'
                    {
                    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:724:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:726:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:726:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:726:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:728:16: ( . )
            // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:728:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:8: ( RULE_DOT | RULE_COMMA | RULE_SHARP | RULE_COLON | RULE_SEMI_COLON | RULE_PAREN_LEFT | RULE_PAREN_RIGHT | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_MIXIN_ID | RULE_WORD | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=22;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:10: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 2 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:19: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 3 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:30: RULE_SHARP
                {
                mRULE_SHARP(); 

                }
                break;
            case 4 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:41: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 5 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:52: RULE_SEMI_COLON
                {
                mRULE_SEMI_COLON(); 

                }
                break;
            case 6 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:68: RULE_PAREN_LEFT
                {
                mRULE_PAREN_LEFT(); 

                }
                break;
            case 7 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:84: RULE_PAREN_RIGHT
                {
                mRULE_PAREN_RIGHT(); 

                }
                break;
            case 8 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:101: RULE_BRACE_LEFT
                {
                mRULE_BRACE_LEFT(); 

                }
                break;
            case 9 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:117: RULE_BRACE_RIGHT
                {
                mRULE_BRACE_RIGHT(); 

                }
                break;
            case 10 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:134: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 11 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:146: RULE_AMP
                {
                mRULE_AMP(); 

                }
                break;
            case 12 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:155: RULE_CHARSET_ID
                {
                mRULE_CHARSET_ID(); 

                }
                break;
            case 13 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:171: RULE_INCLUDE_ID
                {
                mRULE_INCLUDE_ID(); 

                }
                break;
            case 14 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:187: RULE_MIXIN_ID
                {
                mRULE_MIXIN_ID(); 

                }
                break;
            case 15 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:201: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 16 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:211: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:220: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:228: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../com.dubture.editor.sass/src-gen/com/dubture/editor/sass/parser/antlr/internal/InternalSass.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\14\uffff\1\26\2\47\1\26\2\uffff\3\26\20\uffff\2\47\6\uffff\1\47"+
        "\1\uffff";
    static final String DFA12_eofS =
        "\57\uffff";
    static final String DFA12_minS =
        "\1\0\13\uffff\1\143\2\60\1\101\2\uffff\2\0\1\52\20\uffff\2\60\6"+
        "\uffff\1\40\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\13\uffff\1\155\3\172\2\uffff\2\uffff\1\57\20\uffff\2\172"+
        "\6\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff"+
        "\1\17\1\21\3\uffff\1\25\1\26\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
        "\11\1\12\1\13\1\14\1\15\1\16\2\uffff\1\17\1\21\1\22\1\23\1\24\1"+
        "\25\1\uffff\1\20";
    static final String DFA12_specialS =
        "\1\2\21\uffff\1\0\1\1\33\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\1\3\1\12\1\20\1\13"+
            "\1\23\1\6\1\7\2\26\1\2\1\20\1\1\1\24\12\20\1\4\1\5\4\26\1\14"+
            "\10\16\1\15\21\16\3\26\1\17\1\21\1\26\32\16\1\10\1\26\1\11\uff82"+
            "\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\5\uffff\1\43\3\uffff\1\44",
            "\12\46\7\uffff\15\46\1\45\14\46\4\uffff\1\50\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\50\1\uffff\32\46",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\23\46\1\55\6\46\4\uffff\1\50\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\50\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\17\uffff\12\46\7\uffff\32\46\4\uffff\1\50\1\uffff\32"+
            "\46",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_DOT | RULE_COMMA | RULE_SHARP | RULE_COLON | RULE_SEMI_COLON | RULE_PAREN_LEFT | RULE_PAREN_RIGHT | RULE_BRACE_LEFT | RULE_BRACE_RIGHT | RULE_DOLLAR | RULE_AMP | RULE_CHARSET_ID | RULE_INCLUDE_ID | RULE_MIXIN_ID | RULE_WORD | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 41;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 41;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='.') ) {s = 1;}

                        else if ( (LA12_0==',') ) {s = 2;}

                        else if ( (LA12_0=='#') ) {s = 3;}

                        else if ( (LA12_0==':') ) {s = 4;}

                        else if ( (LA12_0==';') ) {s = 5;}

                        else if ( (LA12_0=='(') ) {s = 6;}

                        else if ( (LA12_0==')') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='$') ) {s = 10;}

                        else if ( (LA12_0=='&') ) {s = 11;}

                        else if ( (LA12_0=='@') ) {s = 12;}

                        else if ( (LA12_0=='I') ) {s = 13;}

                        else if ( ((LA12_0>='A' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( (LA12_0=='%'||LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')) ) {s = 16;}

                        else if ( (LA12_0=='_') ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 18;}

                        else if ( (LA12_0=='\'') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='<' && LA12_0<='?')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}