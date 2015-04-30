package circles;

import java.awt.Color;

public class Shape {
	int x, y;
	Color c;

	// INSTANTIATE
	public Shape(int xPos, int yPos, Color color) {
		x = xPos;
		y = yPos;
		c = color;
	}

	// SET METHODS
	public void setX(int xPos) {
		x = xPos;
	}
	public void setY(int yPos) {
		y = yPos;
	}
	public void setColor(Color color) {
		c = color;
	}

	// GET METHODS
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return c;
	}

	// OTHER
	public String toString() {
		return "{"+extraMethods.shapeToCords(this)+"; " + extraMethods.colorToString(c)
				+ "}";
	}
}
