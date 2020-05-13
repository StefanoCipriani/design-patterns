package com.design.pattern.mediator;

public class AirCraftImpl extends AirCraft {

	public AirCraftImpl(AtcMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + " sending message = "+ msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+" receiving message "+msg);
	}

}
