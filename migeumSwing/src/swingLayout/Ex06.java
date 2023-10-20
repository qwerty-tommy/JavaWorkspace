package swingLayout;

import java.awt.Component;

import javax.swing.*;

class MyFrame06 extends JFrame{
	
	public MyFrame06() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		makeButton(panel,"Button1");
		makeButton(panel,"Button2");
		makeButton(panel,"Button3");
		makeButton(panel,"B4");
		makeButton(panel,"Long Button5");
		add(panel);
		pack();
		setVisible(true);
		
	}
	
	private void makeButton(JPanel panel,String text) {
		JButton button=new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class Ex06 {
	
	public static void main(String[] args) {
		new MyFrame06();
	}

}
