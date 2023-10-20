package swingKeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class KeyListenerEx02 extends JFrame {
	JPanel contentPane = new JPanel();// 컨텐트팬으로 사용할 패널
	JLabel[] keyMessage;

	KeyListenerEx02() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		keyMessage = new JLabel[3]; // 레이블 배열 생성
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		for (int i = 0; i < keyMessage.length; i++) {
			contentPane.add(keyMessage[i]);
			keyMessage[i].setOpaque(true); // 배경색이 보이록 불투명 속성 설정
			keyMessage[i].setBackground(Color.CYAN); // 배경색을 CYAN 색으로 변경}
		}
		setSize(300, 150);
		setVisible(true);
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 키문자 값 알아내기
			char keyChar = e.getKeyChar(); // 키 코드 알아내기
			keyMessage[0].setText(Integer.toString(keyCode)); // 키 코드 출력
			keyMessage[1].setText(Character.toString(keyChar)); // 키 문자 출력
			keyMessage[2].setText(e.getKeyText(keyCode)); // 키 이름 문자열 출력
			System.out.println("KeyPressed");
		}

		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased\n");
		}

		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		new KeyListenerEx02();
	}
}
