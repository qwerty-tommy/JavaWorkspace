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

		JLabel label1 = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);

		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");

		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);

		JLabel label2 = new JLabel("개수");
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
