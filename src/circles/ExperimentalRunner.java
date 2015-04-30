package circles;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ExperimentalRunner extends Canvas {
	private static final long serialVersionUID = 1L;
	private Point[] pa;
	private Point cnt;
	private int r;
	private Color cc, lc, bcc;
	private Line bcr;

	// INSTANTIATE
	ExperimentalRunner(Point[] pointArray, int radius, Color circleColor, Color lineColor,
			Color bigCircleColor) {
		setBackground(Color.WHITE);
		pa = pointArray;
		r = radius;
		cc = circleColor;
		lc = lineColor;
		bcc = bigCircleColor;
		logic();
	}

	ExperimentalRunner(Point[] pointArray, int radius) {
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
		for (int i = 0; i < pa.length; i++) {
			for (int j = i+1; j < pa.length; j++) {
				Line l = new Line(pa[i], pa[j]);
				l.draw(window);
				double angle = Math.atan((double)l.getY()/l.getX());
				System.out.println(Math.toDegrees(angle));
				int ix = pa[i].getX();
				int iy = pa[i].getY();
				int jx = pa[j].getX();
				int jy = pa[j].getY();
				Point plz = Math.toDegrees(angle) > 20 ?
						new Point((int)(ix+r*Math.sin(angle)), (int)(iy+r*Math.cos(angle))):
							new Point((int)(ix-r*Math.sin(angle)), (int)(iy+r*Math.cos(angle)));
				plz.draw(window);
				/*System.out.println("Angle: "+Math.toDegrees(angle)); //TEST
				Point add1 = new Point((int)Math.round(pa[i].getX()-(r*Math.sin(angle))), (int)Math.round(pa[i].getY()+(r*Math.cos(angle))));
				Point add2 = new Point((int)Math.round(pa[j].getX()-(r*Math.sin(angle))), (int)Math.round(pa[j].getY()+(r*Math.cos(angle))));
				Line ar1 = new Line(pa[i], add1, Color.pink);
				ar1.draw(window);
				Line ar2 = new Line(pa[j], add2, Color.pink);
				ar2.draw(window);
				Line fuck = new Line(add1, add2);
				fuck.draw(window);*/
			}
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
		bcr = new Line(cnt, fp); //Encompassing circle's radius
	}
}