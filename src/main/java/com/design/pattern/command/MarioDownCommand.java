package com.design.pattern.command;

import com.design.pattern.command.interfaces.Command;
import com.design.pattern.command.model.MarioCharacterReceiver;

public class MarioDownCommand implements Command {

	private MarioCharacterReceiver marioCharacter;
	
	public MarioDownCommand(MarioCharacterReceiver marioCharacter) {
		super();
		this.marioCharacter = marioCharacter;
	}

	public void execute() {
		marioCharacter.moveDown();
	}

}
