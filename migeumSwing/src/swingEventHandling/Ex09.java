package swingEventHandling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseListenerEx09 extends JFrame {
	JPanel panel = new JPanel();
	JLabel la;

	public MouseListenerEx09() {
		setTitle("mouse event example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);

		panel.addMouseListener(new MyMouseListener());
		la = new JLabel("hello");
		la.setSize(90, 30);
		la.setLocation(30, 30);
		la.setFont(new Font("Arial", Font.BOLD, 20));

		this.add(la);
		this.setSize(400, 300);
		this.setVisible(true);
		add(panel);
	}

	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

	}
}

public class Ex09 {

	public static void main(String[] args) {
		new MouseListenerEx09();
	}

}
