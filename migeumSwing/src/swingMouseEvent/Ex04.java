package swingMouseEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame04 extends JFrame {
	JPanel ctPane = new JPanel(); // 컨텐트팬으로 사용할 패널
	JLabel la;

	MyFrame04() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(ctPane); // 컨텐트팬 변경
		ctPane.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		ctPane.addMouseListener(new MyMouseListener()); // 컨텐트팬에 Mouse 리스너달기la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);// 레이블의 위치 (30,30)으로 설정
		ctPane.add(la);
		setSize(200, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스 클릭 좌표 x
			int y = e.getY(); // 마우스 클릭 좌표 y
			la.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}
}

public class Ex04 {
	public static void main(String[] args) {
		MyFrame04 m = new MyFrame04();
	}
}