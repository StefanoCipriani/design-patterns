package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.KirbyCharacterReceiver;

public class KirbyRightCommand implements Command {

	private KirbyCharacterReceiver kirbyCharacter;
	
	public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacter) {
		super();
		this.kirbyCharacter = kirbyCharacter;
	}

	public void execute() {
		kirbyCharacter.moveRight();
	}

}
