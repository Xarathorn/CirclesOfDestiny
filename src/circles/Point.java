package circles;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {
	Color fc;
	// INSTANTIATE
	public Point(int xPos, int yPos, Color color, Color fillColor) {
		super(xPos, yPos, color);
		fc = fillColor;
	}
	public Point(int xPos, int yPos, Color color) {
		super(xPos, yPos, color);
		fc = Color.black;
	}
	public Point(int xPos, int yPos) {
		super(xPos, yPos, Color.black);
		fc = Color.black;
	}

	// DRAW
	public void draw(Graphics window) {
		window.setColor(fc);
		window.fillOval(x - 2, y - 2, 4, 4);
		window.setColor(c);
		window.drawOval(x - 2, y - 2, 4, 4);
	}
}
