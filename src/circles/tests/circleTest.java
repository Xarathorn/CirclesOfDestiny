package circles.tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

import circles.Circle;

public class circleTest extends Canvas {
	private static final long serialVersionUID = 1L;

	public circleTest() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		Circle c = new Circle(350, 350, Color.red, 50);
		c.draw(window);
	}
}