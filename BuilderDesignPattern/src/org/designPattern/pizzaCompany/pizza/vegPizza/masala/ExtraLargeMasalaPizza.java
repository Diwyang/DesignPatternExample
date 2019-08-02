package org.designPattern.pizzaCompany.pizza.vegPizza.masala;

import org.designPattern.pizzaCompany.pizza.vegPizza.VegPizza;

public class ExtraLargeMasalaPizza extends VegPizza {

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {

		return "Masala Pizza";

	}

	@Override
	public String size() {
		return "Extra-Large Size";
	}
}
