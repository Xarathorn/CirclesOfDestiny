package circles.tests;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import circles.Circle;
import circles.Line;
import circles.Point;

public class drawTest extends Canvas {
	private static final long serialVersionUID = 1L;

	public drawTest() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		Circle c = new Circle(350, 350, Color.red, 50);
		c.draw(window);
		
		Point p = new Point(350, 350);
		p.draw(window);
		
		Point p1 = new Point(400, 200);
		p1.draw(window);
		
		Point p2 = new Point(200, 400);
		p2.draw(window);
		
		Line l = new Line(p1, p2, Color.blue);
		l.draw(window);
	}
}