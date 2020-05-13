package com.design.pattern.interpreter;

public class IntToHexExpression implements Expression {

	private int i;
	
	
	public IntToHexExpression(int i) {
		super();
		this.i = i;
	}


	@Override
	public String interpreter(InterpreterContext ctx) {
		return ctx.getHexformat(i);
	}

}
