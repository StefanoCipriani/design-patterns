package com.design.pattern.visitor;

public class TShirt implements Visitable{

private double price;
	
	public TShirt(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
