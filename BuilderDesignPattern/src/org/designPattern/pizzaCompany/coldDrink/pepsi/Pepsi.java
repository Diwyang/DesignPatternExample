package org.designPattern.pizzaCompany.coldDrink.pepsi;

import org.designPattern.pizzaCompany.coldDrink.ColdDrink;

public abstract class Pepsi extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
