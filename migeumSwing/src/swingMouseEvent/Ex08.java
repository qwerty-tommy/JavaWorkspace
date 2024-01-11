package swingMouseEvent;

import java.awt.Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

class CarGame08 extends JFrame {
	public CarGame08() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel08());
		setVisible(true);
	}
}

class MyPanel08 extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;

	public MyPanel08() {
		try {
			img = ImageIO.read(new File("c:/tmp/car.jpg"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class Ex08 {
	public static void main(String[] args) {
		CarGame08 s = new CarGame08();
	}
}
