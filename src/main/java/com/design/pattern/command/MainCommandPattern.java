package com.design.pattern.command;

import com.design.pattern.command.model.GameBoy;
import com.design.pattern.command.model.KirbyCharacterReceiver;
import com.design.pattern.command.model.MarioCharacterReceiver;

public class MainCommandPattern {

	public static void main(String[] args) {
		
		//Receivers
		MarioCharacterReceiver  mario = new MarioCharacterReceiver();
		mario.setName("Mario");

		KirbyCharacterReceiver  kirby = new KirbyCharacterReceiver();
		kirby.setName("Mario");
		
		//Commands
		MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
		MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
		MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
		MarioRightCommand marioRightCommand = new MarioRightCommand(mario);
		
		KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
		KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
		KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
		KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);
		
		GameBoy gameBoyMario = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
		GameBoy gameBoyKirby = new GameBoy(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);

		
	}

}
