package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame05 extends JFrame {
	public Frame05() {
		setTitle("����");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		add(panel1);
		
		JLabel label=new JLabel("�ڹٳ��� ���� ���� ȯ���մϴ�!! ���� ���� ���� �����Դϱ�?");
		
		panel2.add(label);
		
		JButton button1=new JButton();
		button1.setText("1��");
		JButton button2=new JButton();
		button2.setText("2��");
		JButton button3=new JButton();
		button3.setText("3��");
		JButton button4=new JButton();
		button4.setText("4��");
		JButton button5=new JButton();
		button5.setText("5��");
		
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
		panel3.add(button5);
		
		panel1.add(panel2);
		panel1.add(panel3);
		
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}


public class Pr05 {
	public static void main(String[] args) {
		new Frame05();
	}
}
