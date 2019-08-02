package org.designPattern.example.shapeAndColor;

import org.designPattern.example.shapeAndColor.color.GreenColor;
import org.designPattern.example.shapeAndColor.color.RedColor;
import org.designPattern.example.shapeAndColor.shape.Shape;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
