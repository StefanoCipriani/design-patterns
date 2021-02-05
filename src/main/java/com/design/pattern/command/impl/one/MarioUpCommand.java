package com.design.pattern.command.impl.one;

import com.design.pattern.command.impl.one.interfaces.Command;
import com.design.pattern.command.impl.one.model.MarioCharacterReceiver;

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
