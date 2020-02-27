package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.MarioCharacterReceiver;

public class MarioRightCommand implements Command {

	private MarioCharacterReceiver marioCharacter;
	
	public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
		super();
		this.marioCharacter = marioCharacter;
	}

	public void execute() {
		marioCharacter.moveRight();
	}

}
