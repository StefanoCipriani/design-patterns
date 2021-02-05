package com.design.pattern.command.impl.one;

import com.design.pattern.command.impl.one.interfaces.Command;
import com.design.pattern.command.impl.one.model.KirbyCharacterReceiver;

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
