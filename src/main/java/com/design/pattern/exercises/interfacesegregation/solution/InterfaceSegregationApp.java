package com.design.pattern.exercises.interfacesegregation.solution;

import com.design.pattern.exercises.interfacesegregation.solution.impl.CeoImpl;
import com.design.pattern.exercises.interfacesegregation.solution.impl.EmployeeImpl;
import com.design.pattern.exercises.interfacesegregation.solution.impl.MangerImpl;

public class InterfaceSegregationApp {

	public static void main(String[] args) {
		Employee emp = new EmployeeImpl();
		Manager manager = new MangerImpl();
		Ceo ceo = new CeoImpl();
		
		emp.salary();
		
		manager.salary();
		manager.addBonus();
		manager.hire();
		manager.train();
		
		ceo.salary();
		ceo.addBonus();
		ceo.addStocks();
		ceo.makeDecisions();
	}
}
