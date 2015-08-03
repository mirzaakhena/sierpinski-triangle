package com.mirzaakhena.sierpinskitriangle;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;

public class SierpinskiTriangle {

	

	@SuppressWarnings("serial")
	public static void main(String[] args) {

		JFrame frame = new JFrame("Sierpinski Triangle") {
			@Override
			public void paint(Graphics g) {
				chaosGame(g);
			}
		};
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	private static Point[] p = new Point[] { new Point(200, 30), new Point(30, 360), new Point(360, 360) };
	private static void chaosGame(Graphics g) {
		Point a = new Point(200, 50);
		Random r = new Random();
		int j;
		int n = 10000;
		
		g.drawString("Iterasi " + n + " kali", 20, 120);
		
		for (int i = 0; i < n; i++) {
			j = r.nextInt(3);
			a.x = (p[j].x + a.x) / 2;
			a.y = (p[j].y + a.y) / 2;
			g.drawLine(a.x, a.y, a.x, a.y);
		}
	}

}
