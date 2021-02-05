package com.design.pattern.command.impl.one.model;

import com.design.pattern.command.impl.one.interfaces.Command;

/*Invoker*/
public class GameBoy {

	//Concrete commands
	private Command upCommand;
	private Command downCommand;
	private Command leftCommand;
	private Command rightCommand;
	
	public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
		super();
		this.upCommand = upCommand;
		this.downCommand = downCommand;
		this.leftCommand = leftCommand;
		this.rightCommand = rightCommand;
	}
	
	public void arrowUp(){
		upCommand.execute();
	}
	
	public void arrowDown(){
		downCommand.execute();
	}
	
	public void arrowLeft(){
		leftCommand.execute();
	}
	
	public void arrowRight(){
		rightCommand.execute();
	}
	
	
}
