package circles;

import java.awt.Color;

public class extraMethods {
	public static String colorToString(Color color) { //cleans up default COLOR.toString()
		String cs = color.toString();
		return cs.substring(14, cs.length()-1)+",a="+color.getAlpha()+"]";
	}
	public static String shapeToCords(Shape shape) {
		return "("+shape.getX()+", "+shape.getY()+")";
	}
	public static int lengthBetweenPoints(Point p1, Point p2) {
		int xDiff = p1.getX() - p2.getX();
		int yDiff = p1.getY() - p2.getY();
		return (int)Math.round(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
	}
}