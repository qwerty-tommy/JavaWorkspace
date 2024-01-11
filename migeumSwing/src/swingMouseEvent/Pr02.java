package swingMouseEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton button1;
	JButton button2;

	void createAndShowGUI() {
		setTitle("No Named");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addCompoenetsToPane();
		setPreferredSize(new Dimension(300, 300));
		pack();
		setVisible(true);
	}

	void addCompoenetsToPane() {
		setLayout(new FlowLayout());
		button1 = new JButton("노랑색");
		button2 = new JButton("분홍색");

		button1.addMouseListener(new ChangeColorMouseListener());
		button2.addMouseListener(new ChangeColorMouseListener());

		add(button1);
		add(button2);
	}

	class ChangeColorMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == button1)
				MyFrame02.this.getContentPane().setBackground(Color.yellow);
			else
				MyFrame02.this.getContentPane().setBackground(Color.pink);
		}

		@Override
		public void mousePressed(MouseEvent e) {
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

public class Pr02 {
	public static void main(String[] args) {
		MyFrame02 frame = new MyFrame02();
		frame.createAndShowGUI();
	}
}
