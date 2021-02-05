package com.design.pattern.command.impl.one;

import com.design.pattern.command.impl.one.interfaces.Command;
import com.design.pattern.command.impl.one.model.MarioCharacterReceiver;

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
