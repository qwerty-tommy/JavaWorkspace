package basicComponentJLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class MyFrame02 {

	public MyFrame02() {
		JFrame frame = new JFrame("JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		ImageIcon dogIcon = new ImageIcon("c:\\tmp\\dog1.png");
		ImageIcon searchingIcon = new ImageIcon("c:\\tmp\\icon2.png");

		JLabel topLabel = new JLabel("이미지를 보려면 버튼을 누르세요", SwingConstants.CENTER);
		panel.add(topLabel, BorderLayout.NORTH);

		JButton counterButton = new JButton("눌러보세요~");
		counterButton.setIcon(searchingIcon);
		panel.add(counterButton, BorderLayout.CENTER);
		frame.add(panel);

		counterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counterButton.setIcon(dogIcon);
				//label.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			}
		});

		frame.setVisible(true);
	}
}

public class Pr02 {
	public static void main(String[] args) {
		new MyFrame02();
	}
}
