package org.designPattern.journaldev.example;

import org.designPattern.journaldev.example.composite.Drawing;
import org.designPattern.journaldev.example.leaf.Circle;
import org.designPattern.journaldev.example.leaf.Triangle;
import org.designPattern.journaldev.example.shape.Shape;

public class TestCompositePattern {

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();

		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}

}
