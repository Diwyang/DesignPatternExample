package org.designPattern.pizzaCompany;

import java.io.IOException;

public class BuilderPatternDemo {

	public static void main(String[] args) throws IOException {
		// TODO code application logic here

		OrdereBuilder builder = new OrdereBuilder();

		OrderedItems orderedItems = builder.preparePizza();

		orderedItems.showItems();

		System.out.println("\n");
		System.out.println("Total Cost : " + orderedItems.getCost());

	}
}
