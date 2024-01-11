package basicComponentJLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class MyFrame05 {
	public MyFrame05() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 500));

		JPanel superPanel = new JPanel();
		superPanel.setLayout(new BoxLayout(superPanel, BoxLayout.Y_AXIS));
		
		frame.add(superPanel);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("다양한 보더"));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(300, 400));
		panel.setMaximumSize(new Dimension(300, 400)); // 크기조절 안됨

		JPanel p1 = createPanel("Label 정렬", BorderFactory.createLoweredBevelBorder());
		panel.add(p1);
		panel.add(Box.createVerticalStrut(10));

		JPanel p2 = createPanel("첫번째 Border", BorderFactory.createLineBorder(Color.black, 2));
		panel.add(p2);
		panel.add(Box.createVerticalStrut(10));

		JPanel p3 = createPanel("두번째 Border", BorderFactory.createLineBorder(Color.red, 2));
		panel.add(p3);
		panel.add(Box.createVerticalStrut(10));

		JPanel p4 = createPanel("세번째 Border", BorderFactory.createLineBorder(Color.green, 2));
		panel.add(p4);
		panel.add(Box.createVerticalStrut(10));

		superPanel.add(panel, BorderLayout.CENTER);

		frame.setVisible(true);
	}

	JPanel createPanel(String text, Border border) {
		JPanel panel = new JPanel();
		panel.setBorder(border);
		panel.add(new JLabel(text));
		panel.setPreferredSize(new Dimension(150, 80));
		panel.setMaximumSize(new Dimension(150, 80));
		return panel;
	}

}

public class Pr05 {
	public static void main(String[] args) {
		new MyFrame05();
	}
}
