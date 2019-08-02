package org.designPattern.pizzaCompany.pizza.vegPizza;

import org.designPattern.pizzaCompany.pizza.Pizza;

public abstract class VegPizza extends Pizza {

	@Override
	public abstract float price();

	@Override
	public abstract String name();

	@Override
	public abstract String size();

}
