package org.designPattern.example.shapeAndColor;

import org.designPattern.example.shapeAndColor.color.Color;
import org.designPattern.example.shapeAndColor.shape.Shape;

public class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	} 

}
