package com.design.pattern.exercises.interfacesegregation.solution;

public interface Manager extends Employee {

	// managers
	public void hire();
	public void train();
	// CEO + managers
	public void addBonus();
}
