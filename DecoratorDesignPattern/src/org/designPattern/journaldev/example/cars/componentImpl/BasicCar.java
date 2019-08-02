package org.designPattern.journaldev.example.cars.componentImpl;

import org.designPattern.journaldev.example.cars.component.Car;

public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}

}

