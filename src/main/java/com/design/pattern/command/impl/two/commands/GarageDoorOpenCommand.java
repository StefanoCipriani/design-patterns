package com.design.pattern.command.impl.two.commands;

import com.design.pattern.command.impl.two.interfaces.Command;
import com.design.pattern.command.impl.two.recivers.GarageDoor;

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
