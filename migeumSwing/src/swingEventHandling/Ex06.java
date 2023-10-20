package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame06 extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame06() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener03() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("마침내 버튼이 눌려졌습니다~");
				}
			}
		});
		this.add(button);
		this.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		new MyFrame07();
	}
}
