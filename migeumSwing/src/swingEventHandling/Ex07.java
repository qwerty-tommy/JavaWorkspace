package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame07 extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame07() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout());
		button = new JButton("Action");
		
		button.addActionListener(new MyListener03() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (button.getText()== "Action") {
					button.setText("액션");
				}
				else if (button.getText()== "액션") {
					button.setText("Action");
				}
			}
		});
		
		this.add(button);
		this.add(panel);
		this.setVisible(true);
	}
}

public class Ex07 {

}
