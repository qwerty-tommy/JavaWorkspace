package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame05 extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	public MyFrame05() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르세요!");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener03());
		this.add(button);
		this.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			label.setText("마침내 버튼이 눌려졌습니다~");
		}
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		new MyFrame05();
	}

}
