package swingMouseEvent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class KeyPad extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;

	public KeyPad() {
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		add(panel, BorderLayout.CENTER);
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 100));
			panel.add(btn);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}
}

class Ex06 {
	public static void main(String[] args) {
		KeyPad03 k = new KeyPad03();
	}
}