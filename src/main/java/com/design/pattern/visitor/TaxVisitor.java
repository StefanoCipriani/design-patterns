package com.design.pattern.visitor;

public class TaxVisitor implements Visitor {

	
	public TaxVisitor() {
		
	}
	
	@Override
	public double visit(Shirt shirt) {
		System.out.println("Shirt final price with tax:");
		return((shirt.getPrice()*.50)+shirt.getPrice());
	}

	@Override
	public double visit(TShirt tShirt) {
		System.out.println("TShirt final price with tax:");
		return ((tShirt.getPrice()*.15)+tShirt.getPrice());
	}

	@Override
	public double visit(Jacket jacket) {
		System.out.println("Jacket final price with tax:");
		return ((jacket.getPrice()*.20)+jacket.getPrice());
	}

}
