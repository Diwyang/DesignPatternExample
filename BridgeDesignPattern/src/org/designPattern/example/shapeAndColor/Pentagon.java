package org.designPattern.example.shapeAndColor;

import org.designPattern.example.shapeAndColor.color.Color;
import org.designPattern.example.shapeAndColor.shape.Shape;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	} 

}
