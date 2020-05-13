package com.design.pattern.mediator;

public interface AtcMediator {

	public void sendMessage(String msg, AirCraft aircraft);
	public void addAirCraft(AirCraft airCraft);
}
