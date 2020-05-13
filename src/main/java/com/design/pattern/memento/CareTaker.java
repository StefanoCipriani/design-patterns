package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Memento> stateList = new ArrayList<>();

	public void addMemento(Memento memento) {
		stateList.add(memento);
	}
	
	public Memento getMemento(int index) {
		return stateList.get(index);
	}
	
}
