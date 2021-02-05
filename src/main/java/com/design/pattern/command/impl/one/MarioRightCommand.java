package com.design.pattern.command.impl.one;

import com.design.pattern.command.impl.one.interfaces.Command;
import com.design.pattern.command.impl.one.model.MarioCharacterReceiver;

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
