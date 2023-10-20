package swingKeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class KeyListenerEx01 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO"); // 키 입력에 따라 움직일 레이블 컴포넌트
	final int FLYING_UNIT = 10; // 레이블이 한 번 움직이는 단위는 10픽셀

	KeyListenerEx01() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		setLocation(500, 300);
		contentPane.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		contentPane.addKeyListener(new MyKeyListener()); // 컨텐트팬에 Key 리스너 달기
		la.setLocation(50, 50);
		la.setSize(100, 20);
		la.setForeground(Color.RED);
		contentPane.add(la);
		setSize(300, 300);
		setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			// 키 코드 값(keyCode)에 따라 상,하,좌,우 키를 판별하고 la의 위치를 이동시킨다.
			switch (keyCode) {
			case KeyEvent.VK_UP: // UP 키
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN: // DOWN 키
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT: // LEFT 키
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT: // RIGHT 키
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
			}
		}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		new KeyListenerPr03();
	}
}
