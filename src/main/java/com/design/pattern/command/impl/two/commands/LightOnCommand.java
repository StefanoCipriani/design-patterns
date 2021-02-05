package com.design.pattern.command.impl.two.commands;

import com.design.pattern.command.impl.two.devices.Light;
import com.design.pattern.command.impl.two.interfaces.Command;

public class LightOnCommand implements Command{
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
