package com.design.pattern.mediator;

public class MainMediatorPattern {

	public static void main(String[] args) {
		
		AtcMediator mediator = new AtcMediatorImpl();
		
		AirCraft aircraft1 = new AirCraftImpl(mediator, "Aircraft 1");
		AirCraft aircraft2 = new AirCraftImpl(mediator, "Aircraft 2");
		AirCraft aircraft3 = new AirCraftImpl(mediator, "Aircraft 3");
		
		mediator.addAirCraft(aircraft1);
		mediator.addAirCraft(aircraft2);
		mediator.addAirCraft(aircraft3);
		
		aircraft1.send("Hello from 1");
		aircraft2.send("Hello from 2");
		aircraft3.send("Hello from 3");
		
	}

}
