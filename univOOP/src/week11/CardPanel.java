package week11;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class CardPanel extends JFrame {
	private static final long serialVersionUID = 1L;

	private void createAndShowGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addCompoenetsToPane();
		setPreferredSize(new Dimension(300, 300));
		pack();
		setVisible(true);
	}

	private void addCompoenetsToPane() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 2));
		MyCard[] cards = new MyCard[4];
		for (int i = 0; i < 4; i++) {
			cards[i] = new MyCard();
			cards[i].init();
			con.add(cards[i]);
		}

	}

	public static void main(String[] args) {
		CardPanel frame = new CardPanel();
		frame.createAndShowGUI();
	}
}
