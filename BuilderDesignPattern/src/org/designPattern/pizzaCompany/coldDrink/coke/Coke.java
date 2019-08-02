package org.designPattern.pizzaCompany.coldDrink.coke;

import org.designPattern.pizzaCompany.coldDrink.ColdDrink;

public abstract class Coke extends ColdDrink {

	@Override
	public abstract String name();

	@Override
	public abstract String size();

	@Override
	public abstract float price();
}
