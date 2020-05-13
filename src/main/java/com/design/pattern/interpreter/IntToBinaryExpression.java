package com.design.pattern.interpreter;

public class IntToBinaryExpression implements Expression {

	private int i;
	
	
	
	public IntToBinaryExpression(int i) {
		super();
		this.i = i;
	}



	@Override
	public String interpreter(InterpreterContext ctx) {
		return ctx.getBinaryFormat(i);
	}

}
