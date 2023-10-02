package swingEventHandling;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame01 {
	public MyFrame01() {
		JFrame frame = new JFrame("JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		
		JButton closeButton= new JButton("Close");
		contentPane.add(closeButton);
		
		closeButton.addActionListener(e->System.exit(0));
		
		frame.pack();
		frame.setVisible(true);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		MyFrame01 f=new MyFrame01();
	}
}
