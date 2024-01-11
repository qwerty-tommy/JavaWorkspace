package thread;

import java.awt.Toolkit;

public class Ex17 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			delay(3000);
			System.out.println("다시시작....");
		}
	}

	public static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

}
