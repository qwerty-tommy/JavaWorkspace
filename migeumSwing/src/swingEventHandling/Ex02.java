package swingEventHandling;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame02{
	static int counter;
	
	public MyFrame02() {
		JFrame frame=new JFrame("JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		
		JButton counterButton=new JButton("Clicked... 0");
		JButton closeButton=new JButton("Close");
		frame.setLayout(new FlowLayout());
		contentPane.add(closeButton);
		contentPane.add(counterButton);
		
		counterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counterButton.setText("Clicked...  "+counter++);
			}
		});
		
		closeButton.addActionListener(e->System.exit(0));
		
		frame.pack();
		frame.setVisible(true);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		new MyFrame03();
	}
}
