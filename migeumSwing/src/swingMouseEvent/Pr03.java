package swingMouseEvent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class KeyPad03 extends JFrame implements ActionListener {
	private JPanel panel;
	JLabel label1;
	private JLabel label2;
	private JButton sissor;
	private JButton rock;
	private JButton paper;

	public KeyPad03() {

		label1 = new JLabel("컴퓨터와 가위바위보 게임을 하여 봅시다");
		add(label1, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3));
		add(panel, BorderLayout.CENTER);

		sissor = new JButton("가위");
		sissor.addActionListener(this);
		sissor.setPreferredSize(new Dimension(100, 200));
		panel.add(sissor);
		rock = new JButton("바위");
		rock.addActionListener(this);
		rock.setPreferredSize(new Dimension(100, 200));
		panel.add(rock);
		paper = new JButton("보");
		paper.addActionListener(this);
		paper.setPreferredSize(new Dimension(100, 200));
		panel.add(paper);

		label2 = new JLabel("");
		add(label2, BorderLayout.SOUTH);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

//	public void actionPerformed(ActionEvent e) {
//		int rand = (int) (Math.random() * 3.0);
//
//		String[] rsp = new String[3];
//		rsp[0]="가위";
//		rsp[1]="바위";
//		rsp[2]="보";
//		
//		String msg=new String("컴퓨터 : "+rsp[rand]+" ==> 컴퓨터");
//		
//		JButton jb=(JButton)e.getSource();
//		
//		int result;
//		
//		if(jb==sissor) {
//			result=rand%3;
//		} else if(jb==rock) {
//			result=(rand+2)%3;
//		}else {
//			result=(rand+1)%3;
//		}
//		
//		switch (result) {
//		case 0:
//			msg+="무승부";
//			break;
//		case 1:
//			msg+="승리";
//			break;
//		case 2:
//			msg+="패배";
//			break;
//		default:
//			break;
//		}
//
//		label2.setText(msg);
//	}

	public void actionPerformed(ActionEvent e) {
		int rand = (int) (Math.random() * 3.0);

		Map<Integer, String> rsp = new HashMap<>();
		Map<String, Integer> revrsp = new HashMap<>();
		Map<Integer, String> res = new HashMap<>();

		rsp.put(0, "가위");
		rsp.put(1, "바위");
		rsp.put(2, "보");

		revrsp.put("가위", 0);
		revrsp.put("바위", 1);
		revrsp.put("보", 2);

		res.put(0, "무승부");
		res.put(1, "승리");
		res.put(2, "패배");

		String msg = new String("컴퓨터 : " + rsp.get(rand) + " ==> 컴퓨터");
		JButton jb = (JButton) e.getSource();
		int result = (rand + revrsp.get(jb.getText())) % 3;

		label2.setText(msg + res.get(result));
	}
}

public class Pr03 {
	public static void main(String[] args) {
		KeyPad03 k = new KeyPad03();
	}
}