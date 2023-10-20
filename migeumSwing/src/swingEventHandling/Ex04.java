package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame04 extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame04() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());
		this.add(button);
		this.add(label);
		this.add(panel);
		this.setVisible(true);
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton)e.getSource();
			if (btn== button) {
				label.setText("마침내 버튼이 눌려졌습니다~");
				System.out.println(btn.getX());
				System.out.println(btn.getY());
			}

			
		}

	}
}

public class Ex04 {

	public static void main(String[] args) {
		new MyFrame04();
	}

}
