package com.design.pattern.exercises.interfacesegregation.solution.impl;

import com.design.pattern.exercises.interfacesegregation.solution.Manager;

public class MangerImpl implements Manager {

	@Override
	public void salary() {
		System.out.println("Manager salary");

	}

	@Override
	public void hire() {
		System.out.println("Manager hire");

	}

	@Override
	public void train() {
		System.out.println("Manager train");

	}

	@Override
	public void addBonus() {
		System.out.println("Manager addBonus");

	}

}
