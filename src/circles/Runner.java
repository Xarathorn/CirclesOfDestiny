package circles;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class Runner extends Canvas {
	private static final long serialVersionUID = 1L;
	private Point[] pa;
	private Point cnt;
	private int r;
	private Color cc, lc, bcc;
	private Line bcr;

	// INSTANTIATE
	Runner(Point[] pointArray, int radius, Color circleColor, Color lineColor,
			Color bigCircleColor) {
		setBackground(Color.WHITE);
		pa = pointArray;
		r = radius;
		cc = circleColor;
		lc = lineColor;
		bcc = bigCircleColor;
		logic();
	}

	Runner(Point[] pointArray, int radius) {
		setBackground(Color.WHITE);
		pa = pointArray;
		r = radius;
		cc = Color.red;
		lc = Color.blue;
		bcc = Color.green;
		logic();
	}

	// DRAW
	public void paint(Graphics window) {
		Grid.draw(window, (Component)this);
		bcr.draw(window);
		for (int i = 0; i < pa.length; i++) {
			pa[i].draw(window); // draw point
			new Circle(pa[i].getX(), pa[i].getY(), cc, r).draw(window); // draw circle around point
		}
		cnt.draw(window);
		new Circle(cnt.getX(), cnt.getY(), bcc, bcr.length()+r).draw(window); //All-encompassing circle
	}
	
	// OTHER
	private void logic() {
		int totalX = 0, totalY = 0; // for finding center point
		for (Point p : pa) {
			totalX += p.getX();
			totalY += p.getY();
		}
		int avgX = (int) Math.round((double) totalX / pa.length);
		int avgY = (int) Math.round((double) totalY / pa.length);
		cnt = new Point(avgX, avgY, Color.black, Color.green);
		Point fp = pa[0]; // farthest point from center
		for (int i = 1; i < pa.length; i++)
			if (extraMethods.lengthBetweenPoints(cnt, pa[i]) > extraMethods.lengthBetweenPoints(cnt, fp))
				fp = pa[i];
		bcr = new Line(cnt, fp, lc); //Encompassing circle's radius
	}
}