package swing;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame03 extends JFrame{
	public Frame03() {

		JPanel panel=new JPanel();
		
		add(panel);
		
		JLabel label1=new JLabel("인간에게 주어진..");
		JLabel label2=new JLabel("가능한 목표라고 해도..");
		JLabel label3=new JLabel("상상력은..");
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		setSize(300, 150);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

public class Pr03 {
	public static void main(String[] args) {
		new Frame03();
	}
}
