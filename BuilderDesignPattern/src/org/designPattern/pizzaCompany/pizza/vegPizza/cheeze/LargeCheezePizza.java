package org.designPattern.pizzaCompany.pizza.vegPizza.cheeze;

import org.designPattern.pizzaCompany.pizza.vegPizza.VegPizza;

public class LargeCheezePizza extends VegPizza {

	@Override
	public float price() {
		return 260.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}

}