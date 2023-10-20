package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener03 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다~");
	}
	
}

class MyFrame03 extends JFrame{
	private JButton button;
	
	public MyFrame03() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		this.setLayout(new FlowLayout());
		button=new JButton("버튼을 누르세요!");
		button.addActionListener(new MyListener03());
		this.add(button);
		this.setVisible(true);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		new MyFrame03();
	}
}
