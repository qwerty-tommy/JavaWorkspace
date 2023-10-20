package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex04 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Ex04");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton closeButton=new JButton("Ex04");
		Container contentPane=frame.getContentPane();
		contentPane.add(closeButton);
		
		frame.pack();
		
		frame.setVisible(true);
	}
}
