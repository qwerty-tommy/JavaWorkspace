package swingMouseEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame03 extends JFrame {
	MyFrame03() {
		setTitle("버튼에 Mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 버튼 컴포넌트를 생성하고 MouseListener를 단다. 
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener(); // 마우스 리스너를 생성한다.
		btn.addMouseListener(listener); // 마우스 리스너를
										// 단다. // 버튼을 컨텐트팬에 단다
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}
}

class MyMouseListener implements MouseListener {
	public void mouseEntered(MouseEvent e) {// 마우스가 버튼에 올라올때 호출
		JButton btn = (JButton) e.getSource(); // 마우스가 올라간 버튼의 주소를 알아낸다.
		btn.setBackground(Color.RED); // 버튼의 배경색을 파란색으로
										// 변경
	}

	public void mouseExited(MouseEvent e) {// 마우스가 버튼에서 내려갈때 호출
		JButton btn = (JButton) e.getSource(); // 마우스가 올라간 버튼의 주소를 알아낸다.
		btn.setBackground(Color.YELLOW); // 버튼의 배경색을
											// 노란색으로 변경
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}
}

public class Ex03 {
	public static void main(String[] args) {
		MyFrame03 m = new MyFrame03();
	}
}