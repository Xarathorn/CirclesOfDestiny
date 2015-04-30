package circles;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	int r;
	
	// INSTANTIATE
	public Circle(int xPos, int yPos, Color color, int radius) {
		super(xPos-radius, yPos-radius, color);
		r = radius;
	}
	public Circle(int xPos, int yPos, int radius) {
		super(xPos-radius, yPos-radius, Color.red);
		r = radius;
	}
	
	// DRAW
	public void draw(Graphics window) {
		window.setColor(c);
		window.drawOval(x, y, r*2, r*2);
	}
	
	// OTHER
	public String toString() {
		String cs = super.toString();
		return cs.substring(0, cs.length()-1)+"; radius="+r+"}";
	}
}
