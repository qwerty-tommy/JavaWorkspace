package swingEventHandling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ListenerMouseEx08 extends JFrame {
	public ListenerMouseEx08() {
		this.setTitle("버튼에 mouse 이벤트 리스너 작성");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("mouse event test button!");
		btn.setBackground(Color.red);
		MyMouseListener08 listner = new MyMouseListener08();
		btn.addMouseListener(listner);
		this.add(btn);
		this.setSize(300, 200);
		this.setVisible(true);

	}
}

class MyMouseListener08 implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.yellow);
	}

}

public class Ex08 {

	public static void main(String[] args) {
		new ListenerMouseEx08();
	}

}
