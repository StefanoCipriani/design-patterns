package com.design.pattern.template;

public abstract class Game {

	abstract public void initialize();
	abstract public void startPlay();
	abstract public void endPlay();
	public boolean isHooksActive=false;
	
	//Template method
	public final void play() {
		loadAssets();
		initialize();
		startPlay();
		//Hooked on the template method
		if(addNewGameCharacter()) {
			addNewCharacterToTheGame();
		}
		endPlay();
	}
	
	protected abstract void addNewCharacterToTheGame();
	
	void loadAssets() {
		System.out.println("Loading assets...");
	}
	
	boolean addNewGameCharacter() {
		return isHooksActive();
	}
	public boolean isHooksActive() {
		return isHooksActive;
	}
	public void setHooksActive(boolean isHooksActive) {
		this.isHooksActive = isHooksActive;
	}
	
	
	
}
