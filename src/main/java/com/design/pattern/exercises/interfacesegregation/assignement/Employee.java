package com.design.pattern.exercises.interfacesegregation.assignement;

/*
 * 
 * we have a fat interface like this and of course we have 3 classes - Worker, Manager and CEO. 
 * Let's split the fat interface into several interfaces and make sure the SOLID principle are not violated
 * */
public interface Employee {
	// CEO + managers + workers
	public void salary();
	// managers
	public void hire();
	public void train();
	// CEO + managers
	public void addBonus();
	// CEO
	public void makeDecisions();	
	public void addStocks();
}