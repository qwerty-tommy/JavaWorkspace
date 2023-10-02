package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Frame06 extends JFrame {
	public Frame06() {
		setTitle("^^7");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		add(panel1);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.orange);
		panel4.setBackground(Color.gray);
		
		JLabel label=new JLabel("미금러닝 센터에 오신 것을 환영합니다!! 과목을 선택해주세용~");
		
		panel2.add(label);
		
		JButton button1=new JButton();
		button1.setText("C언어");
		JButton button2=new JButton();
		button2.setText("C++");
		JButton button3=new JButton();
		button3.setText("JAVA");
		JButton button4=new JButton();
		button4.setText("Python");
		
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
		
		JLabel label2=new JLabel("과목을 선택하세요 =>");
		JTextField textField=new JTextField(20);
		
		panel4.add(label2);
		panel4.add(textField);
		
		panel1.add(panel2);
		panel1.add(panel3);
		panel1.add(panel4);
		
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}


public class Pro6 {

	public static void main(String[] args) {
		new Frame06();
	}

}
