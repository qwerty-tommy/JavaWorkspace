package swing;

import java.awt.*;
import javax.swing.*;

class MyFrame07 extends JFrame{
	public MyFrame07(){
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ex07");
		JPanel panel=new JPanel();
		JLabel label=new JLabel("�ȳ��ϼ���?");
		JButton button=new JButton("��ư");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		new MyFrame07();
	}
}
