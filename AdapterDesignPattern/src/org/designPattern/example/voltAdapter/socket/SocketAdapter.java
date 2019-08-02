package org.designPattern.example.voltAdapter.socket;

import org.designPattern.example.voltAdapter.volt.Volt;

public interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}