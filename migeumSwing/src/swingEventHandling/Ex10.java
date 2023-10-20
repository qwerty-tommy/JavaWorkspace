package swingEventHandling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MouseAdapter10 extends JFrame {
	JPanel contentpane = new JPanel();
	JLabel la;

	public MouseAdapter10() {
		setTitle("mouse event example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentpane);
		contentpane.setLayout(null);

		contentpane.addMouseListener(new MyMouseAdapter());
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);

		contentpane.add(la);
		this.setSize(200, 200);
		this.setVisible(true);
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
}

public class Ex10 {
	public static void main(String[] args) {
		new MouseAdapter10();
	}
}
