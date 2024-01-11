package swingMouseEvent;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseListenerAllEx extends JFrame {
	JPanel contentPane = new JPanel();// 컨텐트팬으로 사용할 패널
	JLabel la; // 메시지를 출력하기 위한 레이블 컴포넌트

	MouseListenerAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
//MouseListener 리스너 등록
		contentPane.addMouseListener(new MyMouseListener());
//MouseMotionListener 리스너 등록
		contentPane.addMouseMotionListener(new MyMouseListener());
		la = new JLabel("No Mouse Event");
		contentPane.add(la);
		setSize(300, 200);
		setVisible(true);
	}

// Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 구현
	class MyMouseListener implements MouseListener, MouseMotionListener {
// MouseListener의 5개 메소드 구현
		public void mousePressed(MouseEvent e) {
			// 마우스가 눌러진 위치 (x,y) 점을 출력
			la.setText("MousePressed (" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseReleased(MouseEvent e) {
			// 마우스가 떼어진 위치 (x,y) 점을 출력
			la.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			// 마우스가 올라간 컨텐트팬의 주소를 알아낸다. 
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			// 마우스가 내려간 컨텐트팬의 주소를 알아낸다. 
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}

		// MouseMotionListener의 2개 메소드 구현
		public void mouseDragged(MouseEvent e) {
			// 마우스가 컨텐트팬 상에서 드래깅되는 동안 계속 호출
			la.setText("MouseDragged (" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseMoved(MouseEvent e) {
			// 마우스가 컨텐트팬 상에서 움직이는 동안 계속 호출
			la.setText("MouseMoved (" + e.getX() + "," + e.getY() + ")");
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}
