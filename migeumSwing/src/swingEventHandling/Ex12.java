package swingEventHandling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame12 extends JFrame {
	Color color[] = { Color.green, Color.red, Color.BLUE, Color.pink, Color.cyan };

	MyFrame12() {
		add(new MyPanel());
		setSize(500, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel implements ActionListener {
		public MyPanel() {
			setLayout(new BorderLayout());
			JButton b = new JButton("press then draw circle");
			b.addActionListener(this);
			add(b, BorderLayout.NORTH);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int rndColor = (int) (Math.random() * color.length);
			int rndx = (int) (Math.random() * 500);
			int rndy = (int) (Math.random() * 500);
			g.setColor(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
			g.drawOval(rndx, rndy, 50, 50);
			g.fillOval(rndx, rndy, 50, 50);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}

	}
}

public class Ex12 {

	public static void main(String[] args) {
		new MyFrame12();
	}

}
