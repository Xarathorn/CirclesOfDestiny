package circles;

import javax.swing.JFrame;
import java.awt.Component;

public class Draw extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 800;
	Runner r;

	public Draw(Runner run) {
		super("CIRCLES OF DESTINY");
		r = run;
		setSize(WIDTH, HEIGHT);
	}
	
	public void draw() {
		((Component) r).setFocusable(true);
		getContentPane().add(r);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}