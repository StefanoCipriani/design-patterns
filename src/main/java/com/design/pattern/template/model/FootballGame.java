package com.design.pattern.template.model;

import com.design.pattern.template.Game;

public class FootballGame extends Game {

	@Override
	public void initialize() {
		System.out.println("Football Game initializing...");
		
	}

	@Override
	public void startPlay() {
		System.out.println("Football Game running...");
		
	}

	@Override
	public void endPlay() {
		System.out.println("Football Game ending...");
	}

	@Override
	protected void addNewCharacterToTheGame() {
		System.out.println("Adding new character to the football game...");
		
	}

}
