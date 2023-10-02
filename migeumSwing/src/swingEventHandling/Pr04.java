package swingEventHandling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Frame04 extends JFrame {
	private JButton incButton;
	private JButton descButton;
	private JLabel label1;
	private JLabel label2;
	private int counter;

	Frame04() {
		counter = 0;

		this.setSize(300, 120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		this.setLayout(new FlowLayout());

		incButton = new JButton("inc");
		descButton = new JButton("desc");
		label1 = new JLabel("counter");
		label2 = new JLabel(counter + "");
		label2.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 50));

		incButton.addActionListener(new eventListener());
		descButton.addActionListener(new eventListener());

		this.add(label1);
		this.add(label2);
		this.add(incButton);
		this.add(descButton);
		this.setVisible(true);
	}

	class eventListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == incButton) {
				counter++;
				label2.setText(counter + "");
			} else if (e.getSource() == descButton) {
				counter--;
				label2.setText(counter + "");
			}
		}

	}
}

public class Pr04 {
	public static void main(String[] args) {
		new Frame04();
	}
}
