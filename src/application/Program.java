package application;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.printf("Total area: %.2f", totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}