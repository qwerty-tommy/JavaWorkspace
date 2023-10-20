package swingKeyEvent;

import javax.swing.*;
import java.awt.event.*;

class MyFrame01 extends JFrame implements KeyListener { // KeyListener 인터페이스 구현
	public MyFrame01() {
		setTitle("이벤트 예제");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this); // 현재의 객체를 이벤트 리스너로 추가
		add(tf);
		setVisible(true);
	}

	public void keyTyped(KeyEvent e) { // 키가입력되면 호출
		display(e, "KeyTyped ");
	}

	public void keyPressed(KeyEvent e) {// 키를 누르는 순간 호출
		display(e, "KeyPressed ");
	}

	public void keyReleased(KeyEvent e) { // 키에서 손을 떼는 순간 호출
		display(e, "Key Pressed ");
	}

	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar(); // 눌려진 키의 유니코드값을 얻음
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		new MyFrame01();
	}
}
