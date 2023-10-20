package swingEventHandling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame11 extends JFrame {
	MyPanel panel;
	JPanel panel1;
	JButton b1, b2;

	public MyFrame11() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("박스움직이기");

		panel = new MyPanel();
		panel1 = new JPanel();
		b1 = new JButton("왼쪽으로 이동");
		b2 = new JButton("오른쪽으로 이동");
		panel1.add(b1);
		panel1.add(b2);

		add(panel, BorderLayout.CENTER);
		add(panel1, BorderLayout.SOUTH);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.move(-10);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.move(10);
			}
		});
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int x = 250, y = 30;

		public void move(int dx) {
			this.x += dx;
			repaint();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			this.setBackground(Color.yellow);
			g.setColor(Color.red);
			g.fillRect(x, y, 10, 2000);
		}
	}
}

public class Ex11 {

	public static void main(String[] args) {
		new MyFrame11();
	}

}
