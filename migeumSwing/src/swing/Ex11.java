package swing;

import java.awt.*;
import javax.swing.*;

class MyFrame11 extends JFrame {
	public MyFrame11() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ex11");

		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		panel.setBackground(Color.blue);
		panelA.setBackground(Color.yellow);
		panelB.setBackground(Color.green);

		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);

		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");

		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);

		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);

		panelB.add(label2);
		panelB.add(field1);
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);

	}
}

public class Ex11 {
	public static void main(String[] args) {
		new MyFrame11();
	}
}
