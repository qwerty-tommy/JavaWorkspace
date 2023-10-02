package swingEventHandling;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame05 extends JFrame {
	private JPanel container1;
	private JLabel label1;
	private TextField textField1;
	private JPanel container2;
	private JLabel label2;
	private TextField textField2;
	private JButton button;
	private JLabel labelResult;

	public Frame05() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("hellme");
		this.setLayout(new BorderLayout());

		container1 = new JPanel();
		label1 = new JLabel("원금을 입력하시오");
		textField1 = new TextField();

		container2 = new JPanel();
		label2 = new JLabel("이율을 입력하시오");
		textField2 = new TextField();

		button = new JButton("변환");

		labelResult = new JLabel();

		button.addActionListener(new ButtonEventHandler());
		container1.add(label1);
		container1.add(textField1);
		container2.add(label2);
		container2.add(textField2);
		this.add(container1);
		this.add(container2);
		this.add(button);
		this.add(labelResult);
		this.setVisible(true);
	}

	class ButtonEventHandler implements ActionListener {
		int balance;
		double interestRate;

		@Override
		public void actionPerformed(ActionEvent e) {
			balance = Integer.parseInt(textField1.getText());
			interestRate = Double.parseDouble(textField2.getText());
			labelResult.setText(balance * interestRate + "");
		}

	}
}

public class Pr05 {
	public static void main(String[] args) {
		new Frame05();
	}
}
