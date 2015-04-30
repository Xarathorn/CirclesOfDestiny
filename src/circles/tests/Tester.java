package circles.tests;

import javax.swing.JFrame;

import java.awt.Component;

public class Tester extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;

	public Tester() {
		super("CIRCLES OF DESTINY TESTER");
		setSize(WIDTH, HEIGHT);
		
		/*//PointTest
		pointTest pt = new pointTest();
		((Component) pt).setFocusable(true);
		getContentPane().add(pt);*/
		
		/*//CircleTest
		circleTest ct = new circleTest();
		((Component) ct).setFocusable(true);
		getContentPane().add(ct);*/
		
		//DrawTest
		drawTest dt = new drawTest();
		((Component) dt).setFocusable(true);
		getContentPane().add(dt);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Tester run = new Tester();
	}
}