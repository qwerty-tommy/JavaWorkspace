package swingLayout;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame01 extends JFrame{
	public MyFrame01() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel;
		setSize(400,500);
		panel=new JPanel();
		panel.setLayout(new GridLayout(0, 5, 15, 15));

		panel.add(new JButton("Button 0"));
		panel.add(new JButton("Button 1"));
		panel.add(new JButton("Button 2"));
		panel.add(new JButton("Button 3"));
		panel.add(new JButton("Button 4"));
		panel.add(new JButton("Button 5"));
		panel.add(new JButton("Button 6"));
		panel.add(new JButton("Button 7"));
		panel.add(new JButton("Button 8"));
		panel.add(new JButton());
		panel.add(new JButton("Button 9"));
		panel.add(new JButton());
		
		add(panel);
		setVisible(true);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Frame12 f=new Frame12();
	}
}
