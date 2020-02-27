package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.MarioCharacterReceiver;

public class MarioLeftCommand implements Command {

	private MarioCharacterReceiver marioCharacter;
	
	public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
		super();
		this.marioCharacter = marioCharacter;
	}

	public void execute() {
		marioCharacter.moveLeft();
	}

}
