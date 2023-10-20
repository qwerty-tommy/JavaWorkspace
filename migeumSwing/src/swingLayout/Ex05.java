package swingLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05 extends JFrame {
	public Ex05() {
		super("Ten Buttons Frame");

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(Integer.toString(i));
			c.add(btn[i]);
		}
		
		btn[0].setBackground(Color.RED);
		btn[1].setBackground(Color.orange);
		btn[2].setBackground(Color.yellow);
		btn[3].setBackground(Color.green);
		btn[4].setBackground(Color.cyan);
		btn[5].setBackground(Color.blue);
		btn[6].setBackground(Color.black);
		btn[7].setBackground(Color.magenta);
		btn[8].setBackground(Color.pink);
		btn[9].setBackground(Color.lightGray);
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
