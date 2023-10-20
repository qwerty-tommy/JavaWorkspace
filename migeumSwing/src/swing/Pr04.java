package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame04 extends JFrame {
	public Frame04() {

		JPanel panel = new JPanel();
		setTitle("ContentPane°ú JFrame");
		panel.setBackground(Color.orange);
		
		add(panel);
		
		JButton button1=new JButton();
		button1.setText("OK");
		JButton button2=new JButton();
		button2.setText("Cancel");
		JButton button3=new JButton();
		button3.setText("Ignore");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class Pr04 {

	public static void main(String[] args) {
		new Frame04();
	}

}
