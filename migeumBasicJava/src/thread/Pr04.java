package thread;

class MyThread04 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " " + (int) (i * (i + 1) / 2));
		}
	}
}

public class Pr04 {
	public static void main(String[] args) {
		MyThread04 s1 = new MyThread04();

		s1.start();

		try {
			s1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Main Thread");
	}
}
