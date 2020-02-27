package com.design.pattern.facade;

public class ComputerFacade {

	private Cpu processor;
	private Memory ram;
	private HardDrive hd;
	

	public ComputerFacade(Cpu processor, Memory ram, HardDrive hd) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.hd = hd;
	}


	public void start() {
		processor.freeze();
		ram.load(132, hd.read(3456, 89));
		processor.jump(132);
		processor.execute();
	}
	
}
