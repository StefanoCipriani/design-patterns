package com.design.pattern.visitor;

public class MainVisitorPattern {

	public static void main(String[] args) {
		Visitor taxVisitor = new TaxVisitor();
		
		Shirt shirt = new Shirt(5.00);
		TShirt tShirt = new TShirt(10.00);
		Jacket jacket = new Jacket(20.00);
		
		System.out.println(shirt.accept(taxVisitor));
		System.out.println(tShirt.accept(taxVisitor));
		System.out.println(jacket.accept(taxVisitor));
	}
}
