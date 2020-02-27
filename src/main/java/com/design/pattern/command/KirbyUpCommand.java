package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.KirbyCharacterReceiver;

public class KirbyUpCommand implements Command {

	private  KirbyCharacterReceiver kirbyCharacter;
	
	public KirbyUpCommand(KirbyCharacterReceiver kirbyCharacter) {
		super();
		this.kirbyCharacter = kirbyCharacter;
	}

	public void execute() {
		kirbyCharacter.moveUp();
	}

}
