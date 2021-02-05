package com.design.pattern.command.impl.two;

import com.design.pattern.command.impl.two.commands.GarageDoorOpenCommand;
import com.design.pattern.command.impl.two.commands.LightOnCommand;
import com.design.pattern.command.impl.two.interfaces.Command;
import com.design.pattern.command.impl.two.recivers.GarageDoor;
import com.design.pattern.command.impl.two.recivers.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Command cmd = new LightOnCommand(new Light());
		remote.setCommand(cmd);
		remote.buttonWasPressed();
		
		cmd = new GarageDoorOpenCommand(new GarageDoor());
		remote.setCommand(cmd);
		remote.buttonWasPressed();
	}
}
