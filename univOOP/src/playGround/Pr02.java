package playGround;

import java.awt.Dimension;

import javax.swing.JFrame;

class MyFrame02 extends JFrame {
	private static final long serialVersionUID = 1L;

	void createAndShowGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addCompoenetsToPane();
		setPreferredSize(new Dimension(300, 300));
		pack();
		setVisible(true);
	}

	void addCompoenetsToPane() {

	}
}

public class Pr02 {
	public static void main(String[] args) {
		MyFrame02 frame = new MyFrame02();
		frame.createAndShowGUI();
	}
}
