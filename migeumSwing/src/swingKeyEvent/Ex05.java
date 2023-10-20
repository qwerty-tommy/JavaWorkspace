package swingKeyEvent;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Ex05 extends JFrame {
	int screen_w, screen_h; // 모니터 화면 해상도 크기

	public Ex05() throws HeadlessException {
		super("KeyEvent 연습");
		this.setSize(400, 400);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 화면 해상도 구하기
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		screen_w = d.width;
		screen_h = d.height;
		// 키보드초기화
		// 키보드 입력시 이벤트를 어떻게 발생시킬 것인지 작성
		init_key_event();
	}

	private void init_key_event() {
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 눌린 키 정보 얻어보기
				int key = e.getKeyCode();
				// 현재 윈도우의 위치
				// Point pt = MoveExceptMonitor.this.getLocation();
				Point pt = getLocation();
				// 현재 객체의 너비/높이
				int sizeWidth = getWidth(); // JDK가 알아서 외부클래스로 인식한다.
				int sizeHeight = getHeight();
				if (key == KeyEvent.VK_LEFT) {
					pt.x = pt.x - 10;
					if (pt.x < 0) {
						pt.x = 0;
					}
				} else if (key == KeyEvent.VK_RIGHT) {
					pt.x = pt.x + 10;
					if (pt.x + sizeWidth > screen_w) {
						pt.x = screen_w - sizeWidth;
					}
				} else if (key == KeyEvent.VK_UP) {
					pt.y = pt.y - 10;
					if (pt.y < 0) {
						pt.y = 0;
					}
				} else if (key == KeyEvent.VK_DOWN) {
					pt.y = pt.y + 10;
					if (pt.y + sizeHeight > screen_h) {
						pt.y = screen_h - sizeHeight;
					}
				}
				// 바뀐 포인트 값으로 윈도우 위치 이동
				setLocation(pt.x, pt.y);
			}
		};
		this.addKeyListener(adapter);
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
