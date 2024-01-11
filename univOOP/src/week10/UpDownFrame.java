package week10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpDownFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField resultTF = new JTextField("0", 20);
	JPanel top = new JPanel();
	JLabel bottomLabel = new JLabel("<html>카운트 업&다운 기록<br>");

	JPanel bottom = new JPanel();
	JPanel center = new JPanel();
	
	int count = 1;
	int last = 0;

	public void addComponentsToPane() {
		setTitle("Up Down Test");
		Container pane = getContentPane(); // 여기서만 쓰이는 것은 지역변수로

		JButton up = new JButton("UP");
		JButton down = new JButton("DOWN");
		JButton record = new JButton("RECORD");
		JButton reset = new JButton("RESET");
		top.setPreferredSize(new Dimension(300, 40));
		top.add(resultTF);
		pane.add(top, BorderLayout.PAGE_START);
		pane.add(up, BorderLayout.LINE_START);
		center.setLayout(new GridLayout(1, 2));
		center.add(down, BorderLayout.LINE_START);
		center.add(reset);
		pane.add(center,BorderLayout.CENTER);
		pane.add(record, BorderLayout.LINE_END);

		ActionListener listener = new ButtonListener();
		up.addActionListener(listener);
		down.addActionListener(listener);
		record.addActionListener(new ActionListener() {
			// RECORD 버튼의 리스너, this가 구현
			public void actionPerformed(ActionEvent e) {
				int current = Integer.parseInt(resultTF.getText());
				String recodLine = String.format("<br>[%d] %d (%+d)", count++, current, current - last);
				last = current;
				bottomLabel.setText(bottomLabel.getText() + recodLine);
			}
		});
		bottom.add(bottomLabel);
		bottom.setPreferredSize(new Dimension(100, 200));
		pane.add(bottom, BorderLayout.PAGE_END);

		reset.addActionListener(new ActionListener() {
			// RECORD 버튼의 리스너, this가 구현
			public void actionPerformed(ActionEvent e) {
				resultTF.setText("0");
				bottomLabel.setText("<html>카운트 업&다운 기록<br>");
				top.setBackground(Color.white);
				count = 1;
				last = 0;
			}
		});
		bottom.add(bottomLabel);
		bottom.setPreferredSize(new Dimension(100, 200));
		pane.add(bottom, BorderLayout.PAGE_END);
	}

	private void createAndShowGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300, 120));
		addComponentsToPane();
		// 컴포넌트 크기를 설정하는 방법
		setPreferredSize(new Dimension(300, 300));
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		UpDownFrame frame = new UpDownFrame();
		frame.createAndShowGUI();
	}

	void setPaneColor() { // 랜덤하게 배경색을 바꾼다
		top.setBackground(
				new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
	}

	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String buttonName = e.getActionCommand();
			int result = Integer.parseInt(resultTF.getText());
			if (buttonName.equals("UP"))
				result++;
			else if (buttonName.equals("DOWN"))
				result--;
			resultTF.setText("" + result);
			setPaneColor();
		}
	}
}
