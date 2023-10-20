package swingKeyEvent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class KeyListenerPr01 extends JFrame {
	JPanel contentPane = new JPanel();// 컨텐트팬으로 사용할 패널
	JLabel keyMessage;

	KeyListenerPr01() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		keyMessage = new JLabel();

		contentPane.add(keyMessage);
		keyMessage.setOpaque(true); // 배경색이 보이록 불투명 속성 설정
		contentPane.setBackground(Color.white); // 배경색을 CYAN 색으로 변경}

		setSize(300, 150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	// Key 리스너 구현
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			String keyText = e.getKeyText(e.getKeyCode()); // 키문자 값 알아내기
			keyMessage.setText(keyText + " 키가 입력되었음"); // 키 이름 문자열 출력
			switch (keyText) {
			case "G":
				contentPane.setBackground(Color.green);
				break;
			case "Y":
				contentPane.setBackground(Color.yellow);
				break;
			default:
				break;
			}
		}

		public void keyReleased(KeyEvent e) {
		}

		public void keyTyped(KeyEvent e) {
		}
	}
}

public class Pr01 {
	public static void main(String[] args) {
		new KeyListenerPr01();
	}
}
