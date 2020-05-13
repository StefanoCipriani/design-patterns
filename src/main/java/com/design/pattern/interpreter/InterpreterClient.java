package com.design.pattern.interpreter;

public class InterpreterClient {

	public  InterpreterContext ctx;

	public InterpreterClient(InterpreterContext ctx) {
		super();
		this.ctx = ctx;
	}
	
	public  String interpret(String str) {
		Expression exp = null;
		
		if(str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length())));
		}else if( str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(str.indexOf(" ")+1, str.length())));
		}else {
			return str;
		}
		
		return exp.interpreter(ctx);
	}
	
}
