package circles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

public class Grid {
	public static void draw(Graphics window, Component panel){
		window.setColor(new Color(130, 225, 255, 80));
		int w = panel.getWidth();
		int h = panel.getHeight();
		for (int y = 10; y < h; y += 10)
			window.drawLine(0, y, w, y);
		for (int x = 10; x < w; x += 10)
			window.drawLine(x, 0, x, h);
	}
}
