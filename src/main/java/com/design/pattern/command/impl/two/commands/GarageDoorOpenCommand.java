package com.design.pattern.command.impl.two.commands;

import com.design.pattern.command.impl.two.devices.GarageDoor;
import com.design.pattern.command.impl.two.interfaces.Command;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor door;
	
	public GarageDoorOpenCommand(GarageDoor door){
		this.door = door;
	}
	
	
	@Override
	public void execute() {
		door.open();
	}

}
