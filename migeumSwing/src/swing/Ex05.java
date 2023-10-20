package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame05 extends JFrame{
	public MyFrame05() {
		setTitle("Ex05");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton button=new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
}

public class Ex05 {
	public static void main(String[] args) {
		new MyFrame05();
	}
}
