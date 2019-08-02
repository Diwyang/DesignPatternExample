package org.designPattern.journaldev.example.cars.decorator;

import org.designPattern.journaldev.example.cars.component.Car;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
