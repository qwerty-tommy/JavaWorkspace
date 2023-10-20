package swingEventHandling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Frame03 extends JFrame {
	private JButton yellowBtn;
	private JButton pinkBtn;
	private JPanel panel;

	public Frame03() {

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		      
		yellowBtn = new JButton("노란색");
		pinkBtn = new JButton("핑크색");
		panel=new JPanel();
		panel.setSize(200, 100);
		panel.setLayout(new FlowLayout());
		
		System.out.println(panel.getSize());
		
		yellowBtn.addActionListener(new eventListener());
		pinkBtn.addActionListener(new eventListener());
		
		panel.add(yellowBtn);
		panel.add(pinkBtn);
		this.add(panel);
		this.setVisible(true);
	}

	class eventListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == yellowBtn) {
				System.out.println(e.getSource());
				panel.setBackground(Color.yellow);
			}
			else if (e.getSource() == pinkBtn) {
				System.out.println(e.getSource());
				panel.setBackground(Color.pink);
			}
		}

	}
}

public class Pr03 {
	public static void main(String[] args) {
		new Frame03();	
	}
}
