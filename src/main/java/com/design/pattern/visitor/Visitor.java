package com.design.pattern.visitor;

public interface Visitor {

	public double visit(Shirt shirt);
	public double visit(TShirt tShirt);
	public double visit(Jacket jacket);
}
