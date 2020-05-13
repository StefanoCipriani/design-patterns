package com.design.pattern.interpreter;

public class MainInterpreterPattern {

	public static void main(String[] args) {
		
		InterpreterContext ctx = new InterpreterContext();
		InterpreterClient interpreterClient = new InterpreterClient(ctx);
		
		System.out.println(interpreterClient.interpret("Binary 10"));
		System.out.println(interpreterClient.interpret("Hexadecimal 10"));
		
	
	}
}
