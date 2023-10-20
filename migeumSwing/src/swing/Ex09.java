package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame09 extends JFrame{
	public MyFrame09() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ex09");
		JPanel panel=new JPanel();
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		add(panel);
		setVisible(true);
	}
}

public class Ex09 {
	public static void main(String[] args) {
		MyFrame09 f=new MyFrame09();
	}
}
