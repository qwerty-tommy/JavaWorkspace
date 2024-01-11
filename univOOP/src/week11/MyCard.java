package week11;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCard extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	int num = 0;
	JLabel label;

	void init() {
		label = new JLabel("<html><body><h1>" + num);
		add(label);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		setBackground(getRandomColor());
		num++;
		label.setText("<html><body><h1>" + num);
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

	Random rand = new Random();

	Color getRandomColor() {
		return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}
}
