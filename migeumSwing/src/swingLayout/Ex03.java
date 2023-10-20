package swingLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame03 extends JFrame{
	public MyFrame03() {
		setTitle("BoarderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout b =new BorderLayout();
		b.setVgap(5);
		b.setHgap(7);
		setLayout(b);
		add(new JButton("CENTER"), BorderLayout.CENTER);
		add(new JButton("NORTH"), BorderLayout.NORTH);
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		add(new JButton("EAST"), BorderLayout.EAST);
		add(new JButton("WEST"), BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		new MyFrame03();
	}
}
