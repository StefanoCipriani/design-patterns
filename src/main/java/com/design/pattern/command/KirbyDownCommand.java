package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.KirbyCharacterReceiver;

public class KirbyDownCommand implements Command {

	private KirbyCharacterReceiver kirbyCharacter;
	
	public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacter) {
		super();
		this.kirbyCharacter = kirbyCharacter;
	}

	public void execute() {
		kirbyCharacter.moveDown();
	}

}
