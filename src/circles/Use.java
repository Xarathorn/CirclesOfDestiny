package circles;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

public class Use {
	public static void main(String[] args) throws Exception {
		/*Scanner sysIn = new Scanner(System.in);
		System.out.print("Enter filename:  ");
		String filename = sysIn.nextLine();
		sysIn.close();*/
		String filename = "input4.txt";
		Scanner fIn = new Scanner(new File(filename));
		int num = fIn.nextInt();
		int rad = fIn.nextInt();
		Point[] pa = new Point[num];
		Runner r;
		for (int i = 0; i < num; i++)
			pa[i] = new Point(fIn.nextInt(), fIn.nextInt());
		if (fIn.nextInt() == 1) { //has custom colors
			Color cc = new Color(fIn.nextInt(), fIn.nextInt(), fIn.nextInt());
			Color lc = new Color(fIn.nextInt(), fIn.nextInt(), fIn.nextInt());
			Color bcc = new Color(fIn.nextInt(), fIn.nextInt(), fIn.nextInt());
			r = new Runner(pa, rad, cc, lc, bcc);
		}
		else
			r = new Runner(pa, rad);
		Draw d = new Draw(r);
		d.draw();
		fIn.close();
	}
}