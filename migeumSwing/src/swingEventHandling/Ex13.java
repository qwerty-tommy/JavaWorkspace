package swingEventHandling;

import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame13 extends JFrame {
	JTextField tf = new JTextField(10);

	MyFrame13() {
		super("Focus Practice Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		add(new JLabel("입력한 후 다른 창에 마우스 클릭하면 대문자로 변합니다."));
		add(tf);

		tf.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				JTextField t = (JTextField) e.getSource();
				t.setText(t.getText().toUpperCase());
			}
		});
		setSize(400, 100);
		setVisible(true);
	}
}

public class Ex13 {

	public static void main(String[] args) {
		new MyFrame13();
	}

}
