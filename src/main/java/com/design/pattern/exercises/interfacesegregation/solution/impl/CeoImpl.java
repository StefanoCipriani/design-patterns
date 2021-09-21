package com.design.pattern.exercises.interfacesegregation.solution.impl;

public class CeoImpl implements com.design.pattern.exercises.interfacesegregation.solution.Ceo {

	@Override
	public void salary() {
		System.out.println("CEO salary");

	}

	@Override
	public void addBonus() {
		System.out.println("CEO addBonus");


	}

	@Override
	public void makeDecisions() {
		System.out.println("CEO makeDecisions");


	}

	@Override
	public void addStocks() {
		System.out.println("CEO addStocks");


	}

}
