package swingLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame02 extends JFrame{
	public MyFrame02() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임은 디폴트로 BorderLayout
		setLayout(new BorderLayout());
		setSize(300,300);
		add(new JButton("Center"),BorderLayout.CENTER);
		add(new JButton("Line Start"),BorderLayout.LINE_START);
		add(new JButton("Line End"),BorderLayout.LINE_END);
		add(new JButton("page Start"),BorderLayout.NORTH);
		add(new JButton("page End"),BorderLayout.PAGE_END);
		//pack();
		setVisible(true);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		new MyFrame02();
	}
}
