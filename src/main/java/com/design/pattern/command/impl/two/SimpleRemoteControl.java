package com.design.pattern.command.impl.two;

import com.design.pattern.command.impl.two.interfaces.Command;

public class SimpleRemoteControl {

	private Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
