package circles;

import java.awt.Color;
import java.awt.Graphics;

public class Line {
	private Point p1, p2;
	private Color c;

	// INSTANTIATE
	public Line(Point point1, Point point2, Color color) {
		p1 = point1;
		p2 = point2;
		c = color;
	}
	public Line(Point point1, Point point2) {
		p1 = point1;
		p2 = point2;
		c = Color.blue;
	}

	// SET METHODS
	public void setPoint1(Point point1) {
		p1 = point1;
	}
	public void setPoint2(Point point2) {
		p2 = point2;
	}
	public void setColor(Color color) {
		c = color;
	}

	// GET METHODS
	public Point getPoint1() {
		return p1;
	}
	public Point getPoint2() {
		return p2;
	}
	public int getX() {
		return Math.abs(p1.getX() - p2.getX());
	}
	public int getY() {
		return Math.abs(p1.getY() - p2.getY());
	}
	public Color getColor() {
		return c;
	}

	// DRAW
	public void draw(Graphics window) {
		window.setColor(c);
		window.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
	
	// OTHER
	public String toString() {
		return "{"+extraMethods.shapeToCords(p1)+"; "+extraMethods.shapeToCords(p2)+"; "+extraMethods.colorToString(c)+"; length="+length()+"}";
	}
	public int length() {
		return extraMethods.lengthBetweenPoints(p1, p2);
	}
}
