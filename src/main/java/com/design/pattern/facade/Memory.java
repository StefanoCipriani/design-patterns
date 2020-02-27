package com.design.pattern.facade;

public class Memory {

	public void load(long position, byte[] data) {
		System.out.println("Added item to memory..." + position);
	}
}
