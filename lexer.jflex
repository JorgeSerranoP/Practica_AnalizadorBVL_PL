package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
		return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    public String arrayPos(String symbol){
	    char [] cadenaChar = symbol.toCharArray();
	    String num = "";
	    for (int i = 0; i < cadenaChar.length; i++){
	    	if(Character.isDigit(cadenaChar[i])){
	    		num+=cadenaChar[i];
	    	}
    	}
    	return num;
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}
Number     = [0-9]+
RealNumber = [0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?
HexNumber  = "0X"[0-9A-F]+|"0x"[0-9A-F]+
ArrayMEM   = "MEM["[0-9][0-9]*"]"

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} { }
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "++"         { return symbolFactory.newSymbol("PLUSPLUS", PLUSPLUS); }  
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "--"         { return symbolFactory.newSymbol("MINUSMINUS", MINUSMINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "/"          { return symbolFactory.newSymbol("DIVISION", DIVISION); }
  "n"          { return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }
  "log"		   { return symbolFactory.newSymbol("LOG", LOG); }
  "Ln"		   { return symbolFactory.newSymbol("LN", LN); }
  "exp"		   { return symbolFactory.newSymbol("EXP", EXP); }
  "sin"        { return symbolFactory.newSymbol("SIN", SIN); }
  "cos"        { return symbolFactory.newSymbol("COS", COS); }
  "="          { return symbolFactory.newSymbol("EQUAL", EQUAL); }
  {Number}     { return symbolFactory.newSymbol("NUMBER", NUMBER, Double.parseDouble(yytext())); }
  {RealNumber} { return symbolFactory.newSymbol("NUMBER", NUMBER, Double.parseDouble(yytext()));}
  {HexNumber}  { return symbolFactory.newSymbol("NUMBER", NUMBER, Double.valueOf(Integer.decode(yytext())));}
  {ArrayMEM}   { return symbolFactory.newSymbol("ARRAYMEM", ARRAYMEM, Integer.parseInt(arrayPos(yytext()))); }
  {Comment}    { }
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored");
}
