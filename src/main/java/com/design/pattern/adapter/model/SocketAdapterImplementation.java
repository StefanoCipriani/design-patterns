package com.design.pattern.adapter.model;

import com.design.pattern.adapter.interfaces.SocketAdapter;

/*-- Class Adapter, converte da 120 Volts a 12/3/1  --*/
public class SocketAdapterImplementation extends Socket implements SocketAdapter {

	public Volt get120Volts() {
		return getVolt();
	}

	public Volt get12Volts() {
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	public Volt get3Volts() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}

	public Volt get1Volt() {
		Volt v = getVolt();
		return convertVolt(v, getVolt().getVolts());
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
