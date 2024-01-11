package swingMouseEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CircleInfo {
	int x;
	int y;
	Color color;

	public CircleInfo(int x, int y, int r, int g, int b) {
		this.x = x;
		this.y = y;
		this.color = new Color(r, g, b);
	}
}

class MyFrame05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton button;
	ArrayList<CircleInfo> circleInfos = new ArrayList<>();;

	MyFrame05() {
		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		CirclePanel cp = new CirclePanel();
		cp.addMouseListener(new AddCircleMouseListener());
		add(cp);

		setVisible(true);
	}

	class AddCircleMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			circleInfos.add(new CircleInfo((int) (Math.random() * 500), (int) (Math.random() * 500),
					(int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
			revalidate();
			repaint();
		}
	}

	class CirclePanel extends JPanel {
		private static final long serialVersionUID = 1L;

		public CirclePanel() {
			this.setPreferredSize(new Dimension(50, 50));
			circleInfos = new ArrayList<CircleInfo>();
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			for (CircleInfo circleInfo : circleInfos) {
				g.setColor(circleInfo.color);
				g.drawOval(circleInfo.x, circleInfo.y, 50, 50);
				g.fillOval(circleInfo.x, circleInfo.y, 50, 50);
			}
		}
	}
}

public class Pr05 {
	public static void main(String[] args) {
		new MyFrame05();
	}
}
