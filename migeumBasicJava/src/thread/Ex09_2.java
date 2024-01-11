package thread;

import javax.swing.JOptionPane;

class ThreadEx09 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class Ex09_2 {
	public static void main(String[] args) throws Exception {
		ThreadEx09 th1 = new ThreadEx09();
		th1.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}
