package org.designPattern.journaldev.example.cars.decorator;

import org.designPattern.journaldev.example.cars.component.Car;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
