package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.MarioCharacterReceiver;

public class MarioUpCommand implements Command {

	private MarioCharacterReceiver marioCharacter;
	
	public MarioUpCommand(MarioCharacterReceiver marioCharacter) {
		super();
		this.marioCharacter = marioCharacter;
	}

	public void execute() {
		marioCharacter.moveUp();
	}

}
