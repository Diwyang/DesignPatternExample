package org.designPattern.journaldev.example.leaf;

import org.designPattern.journaldev.example.shape.Shape;

public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}

}
