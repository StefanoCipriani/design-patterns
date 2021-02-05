package com.design.pattern.command.impl.one;

import com.design.pattern.command.impl.one.interfaces.Command;
import com.design.pattern.command.impl.one.model.KirbyCharacterReceiver;

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
