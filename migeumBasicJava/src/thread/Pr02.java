package thread;

class MyThread02_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread - 0");
		}
	}

}

class MyThread02_2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread - 1");
		}
	}

}

public class Pr02 {
	public static void main(String[] args) {
		MyThread02_1 s1 = new MyThread02_1();
		MyThread02_2 s2 = new MyThread02_2();

		s1.start();
		s2.start();
	}
}
