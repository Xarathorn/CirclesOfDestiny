package circles.tests;

import java.awt.Color;

import circles.Circle;
import circles.Line;
import circles.Point;

public class Test {

	public static void main(String[] args) {
		Point p = new Point(1, 3);
		System.out.println(p);
		Circle c = new Circle(50, 23, Color.red, 14);
		System.out.println(c);
		Line l = new Line (new Point(100, 200), new Point(200, 100));
		System.out.println(l);
	}
}