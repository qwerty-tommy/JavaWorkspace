package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame01 extends JFrame{
	public Frame01() {
		JPanel panel=new JPanel();
		add(panel);
		
		JLabel label=new JLabel("�ڹٴ� ����־�����?");
		JButton button1=new JButton("�ƴϿ�");
		JButton button2=new JButton("�ƴϿ�");
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Pr02 {
	public static void main(String[] args) {
		new Frame01();
	}
}
