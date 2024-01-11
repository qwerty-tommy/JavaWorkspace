package basicComponentJButon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame07 {
	public MyFrame07() {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(500, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel superPanel = new JPanel();
		superPanel.setPreferredSize(new Dimension(500, 300));
		superPanel.setMaximumSize(new Dimension(500, 300));
		superPanel.setLayout(new BorderLayout());

		JTextArea printLabel = new JTextArea();
		JButton initButton = new JButton();

		JPanel keyPanel = new JPanel();
		keyPanel.setLayout(new GridLayout(4, 4));

		for (int i = 0; i < 16; i++) {
			keyPanel.add(new JButton());
		}

		frame.add(printLabel, BorderLayout.NORTH);
		frame.add(initButton, BorderLayout.CENTER);
		frame.add(keyPanel, BorderLayout.SOUTH);

		frame.setVisible(true);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		new MyFrame07();
	}
}
