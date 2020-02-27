package com.design.pattern.facade;

public class MainFacadePattern {

	public static void main(String[] args) {
		
		Cpu cpu = new Cpu();
		Memory memory = new Memory();
		HardDrive hd = new HardDrive();
		
		ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hd);
		computerFacade.start();
	}

}
