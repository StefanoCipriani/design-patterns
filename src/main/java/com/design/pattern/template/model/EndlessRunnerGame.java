package com.design.pattern.template.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.design.pattern.template.Game;

public class EndlessRunnerGame extends Game {

	@Override
	public void initialize() {
		System.out.println("Endless Runner initializing...");
		
	}

	@Override
	public void startPlay() {
		System.out.println("Endless Runner running...");
		if(playerWantsNewCharacter()) {
			super.setHooksActive(true);
		}
			
		
	}

	@Override
	public void endPlay() {
		System.out.println("Endless Runner ending...");
	}

	@Override
	protected void addNewCharacterToTheGame() {
		System.out.println("Adding new character to the endless runner game...");
	}
	
	public boolean playerWantsNewCharacter() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		else return false;
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like to add a new character to the game (y/n)?");
		
		BufferedReader in  = new BufferedReader(new  InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		}catch(IOException e ) {
			
		}
		
		if(answer == null)
			return "no";
		
		return answer;
		
	}
}
