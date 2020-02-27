package com.design.pattern.template;

import com.design.pattern.template.model.EndlessRunnerGame;
import com.design.pattern.template.model.FootballGame;

public class MainTemplatePattern {

	public static void main(String[] args) {
		Game game = new EndlessRunnerGame();
		game.play();
		
		
		System.out.println("==================");
		game = new FootballGame();
		game.play();
	}
	
	
	

}
