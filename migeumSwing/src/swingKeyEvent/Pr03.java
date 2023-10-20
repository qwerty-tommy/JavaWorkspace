package swingKeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class KeyListenerPr03 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("LOVE JAVA");
	int fontSize = 20;

	KeyListenerPr03() {
		setTitle("폰트조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		setLocation(500, 300);
		contentPane.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		contentPane.addKeyListener(new MyKeyListener()); // 컨텐트팬에 Key 리스너 달기
		la.setLocation(50, 50);
		la.setSize(300, 250);
		la.setFont(new Font("Arial", Font.BOLD, fontSize));
		contentPane.add(la);
		setSize(500, 300);
		setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			case 107: // + 키
				if (fontSize < 35)
				fontSize += 5;
				la.setFont(new Font("Arial", Font.BOLD, fontSize));
				break;
			case 109: // - 키
				if (fontSize > 5)
					fontSize -= 5;
				la.setFont(new Font("Arial", Font.BOLD, fontSize));
				break;
			}
		}
	}
}

public class Pr03 {
	public static void main(String[] args) {
		new KeyListenerPr03();
	}
}
