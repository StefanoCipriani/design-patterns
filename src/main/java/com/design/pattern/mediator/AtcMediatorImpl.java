package com.design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class AtcMediatorImpl implements AtcMediator {

	private List<AirCraft> aircrafts =  new ArrayList<>();
	
	@Override
	public void sendMessage(String msg, AirCraft aircraft) {
		
		for(AirCraft a : aircrafts) {
			if(!a.equals(aircraft)) {
				a.receive(msg);
			}
		}


	}

	@Override
	public void addAirCraft(AirCraft airCraft) {
		aircrafts.add(airCraft);

	}

	public List<AirCraft> getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(List<AirCraft> aircrafts) {
		this.aircrafts = aircrafts;
	}
	
}
