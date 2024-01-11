package basicComponentJLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame06 extends JFrame {
	private static final long serialVersionUID = 1L;

	public MyFrame06() {
		Container p = getContentPane();
		p.setLayout(new FlowLayout());
		setSize(400, 500);
		JLabel label1 = new JLabel("Label: size 100,50");
		Dimension size = new Dimension(100, 50);
		label1.setPreferredSize(size);
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		p.add(label1);
		JLabel label2 = new JLabel("가운데정렬");
		label2.setPreferredSize(new Dimension(200, 100));
		label2.setBackground(Color.blue);
		label2.setForeground(Color.white);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setOpaque(true);
		add(label2);
		JLabel label3 = new JLabel("아래맞춤정렬");
		label3.setPreferredSize(new Dimension(200, 200));
		label3.setBackground(Color.cyan);
		label3.setForeground(Color.red);
		label3.setOpaque(true);
		add(label3);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Ex06 {
	public static void main(String args[]) {
		new MyFrame06();
	}
}