package swingMouseEvent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rectangle {
	int x, y, w, h;
}

class MyPanel extends JPanel {

	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	Rectangle[] array = new Rectangle[100];
	int carr[] = new int[100];
	int index = 0;
	Color colorArr[] = { Color.red, Color.blue, Color.green, Color.gray, Color.ORANGE };

	public MyPanel() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (index > 100)
					return;
				array[index] = new Rectangle();
				array[index].x = e.getX();
				array[index].y = e.getY();
				array[index].w = 20;
				array[index].h = 20;
				carr[index] = (int) (Math.random() * colorArr.length);
				index++;
				repaint();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int cnt = 0;
		for (Rectangle r : array)
			if (r != null) {
				g.drawRect(r.x, r.y, r.w, r.h);
				g.setColor(colorArr[carr[cnt++]]);
			}
	}
}

class drawRect extends JFrame {
	public drawRect() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
}

public class Ex09 {
	public static void main(String[] args) {
		drawRect s = new drawRect();
	}
}