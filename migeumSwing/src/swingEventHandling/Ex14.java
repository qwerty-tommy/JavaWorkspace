package swingEventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class newWindow14 extends JFrame {
	public newWindow14() {
		setTitle("새로 띄운 창");
		setLocation(300, 300);

		JPanel NewWindowContainter = new JPanel();
		setContentPane(NewWindowContainter);

		JLabel NewLabel = new JLabel("새로운 창 입니다!");

		NewWindowContainter.add(NewLabel);

		setSize(300, 300);
		setResizable(false);
		setVisible(true);
	}
}

class MyFrame14 extends JFrame {

	public MyFrame14() {
		setTitle("버튼으로 띄우는 새로운 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel MainContainer = new JPanel();
		setContentPane(MainContainer);

		JButton OpenWindow = new JButton("새 창 띄우기");

		OpenWindow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new newWindow14();
			}
		});

		MainContainer.add(OpenWindow);

		setSize(300, 100);
		setResizable(false);
		setVisible(true);
	}
}

public class Ex14 {

	public static void main(String[] args) {
		new MyFrame14();
	}

}
