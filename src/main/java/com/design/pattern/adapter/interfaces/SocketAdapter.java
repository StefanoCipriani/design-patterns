package com.design.pattern.adapter.interfaces;

import com.design.pattern.adapter.model.Volt;

public interface SocketAdapter {
	
	 Volt get120Volts();
	 Volt get12Volts();
	 Volt get3Volts();
	 Volt get1Volt();
	
}
