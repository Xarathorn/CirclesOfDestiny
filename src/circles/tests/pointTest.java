package circles.tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

import circles.Point;

public class pointTest extends Canvas {
	private static final long serialVersionUID = 1L;

	public pointTest() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		Point p = new Point(350, 350, Color.black);
		p.draw(window);
	}
}