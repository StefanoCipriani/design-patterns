package com.design.pattern.adapter.model;

import com.design.pattern.adapter.interfaces.SocketAdapter;

public class SocketObjectAdapterImplementation implements SocketAdapter {

	//Composition
	private Socket socket = new Socket();
	
	public Volt get120Volts() {
		return socket.getVolt();
	}

	public Volt get12Volts() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	public Volt get3Volts() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	public Volt get1Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 120);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
