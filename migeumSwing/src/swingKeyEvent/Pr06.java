package swingKeyEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class KeyListenerPr06 extends JFrame {
	JPanel contentPane = new JPanel();

	KeyListenerPr06() {
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}

	class Coordinate {
		int x;
		int y;

		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	class MyPanel extends JPanel implements KeyListener {
		ArrayList<Coordinate> circleList;
		int size;

		public MyPanel() {
			circleList=new ArrayList<>();
			setLayout(new BorderLayout());
			addKeyListener(this);
			this.requestFocus();
			setFocusable(true);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int rndx = (int) (Math.random() * 500);
			int rndy = (int) (Math.random() * 500);
			circleList.add(new Coordinate(rndx, rndy));

			for (Coordinate coordinate : circleList) {
				g.setColor(Color.blue);
				g.drawOval(coordinate.x, coordinate.y, 50, 50);
				g.fillOval(coordinate.x, coordinate.y, 50, 50);
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			repaint();
			System.out.println(circleList);
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
		
	}
}

class Pr06 {
	public static void main(String[] args) {
		new KeyListenerPr06();
	}
}
