package org.designPattern.example.voltAdapter.socket;

import org.designPattern.example.voltAdapter.volt.Volt;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
