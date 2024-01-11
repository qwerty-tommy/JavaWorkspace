package swingMouseEvent;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

class DoubleClickEx extends JFrame {
	JPanel contentPane = new JPanel();

	DoubleClickEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener());
		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) { // 더블클릭인가?
				// r,g,b 정수 값을 [0,255] 사이의 랜덤하게 생성
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				JPanel p = (JPanel) e.getSource(); // 마우스가 클릭된 패널(컨텐트팬)을 알아낸다. 
				p.setBackground(new Color(r,b,g)); //
													// 마우스가 클릭된 패널의 배경색으로 r,g,b 색으로 칠한다. }
			}
		}
	}

}

public class Ex10 {
	public static void main(String[] args) {
		DoubleClickEx d = new DoubleClickEx();
	}
}