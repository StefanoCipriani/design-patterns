package com.design.pattern.interpreter;

public class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}
	
	public String getHexformat(int i) {
		return Integer.toHexString(i);
	}
}
