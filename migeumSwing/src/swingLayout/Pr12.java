package swingLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame12 extends JFrame {
	public Frame12() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		
		JPanel outterPannel=new JPanel();
		
		JPanel innerPanel1 = new JPanel();
		innerPanel1.setSize(200, 150);
		innerPanel1.setLayout(new GridLayout(0, 3, 5, 5));

		innerPanel1.add(new JButton("Button 0"));
		innerPanel1.add(new JButton("Button 1"));
		innerPanel1.add(new JButton("Button 2"));
		innerPanel1.add(new JButton("Button 3"));
		innerPanel1.add(new JButton("Button 4"));
		innerPanel1.add(new JButton("Button 5"));
		innerPanel1.add(new JButton("Button 6"));
		innerPanel1.add(new JButton("Button 7"));
		innerPanel1.add(new JButton("Button 8"));
		
		
		JPanel innerPanel2 = new JPanel();
		innerPanel2.setSize(200, 100);
		innerPanel2.setLayout(new BorderLayout());
		innerPanel2.add(new JButton("Button 9"), BorderLayout.NORTH);
		
		
		
		outterPannel.add(innerPanel1);
		outterPannel.add(innerPanel2);
		
		add(outterPannel);
		
		setVisible(true);
	}
}

public class Pr12 {

}
