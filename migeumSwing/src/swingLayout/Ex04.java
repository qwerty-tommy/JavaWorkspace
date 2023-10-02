package swingLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame04 extends JFrame{
	public MyFrame04() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0,2));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("B 4"));
		add(new JButton("Long Button 5"));
		pack();
		setVisible(true);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		new MyFrame04();
	}

}
