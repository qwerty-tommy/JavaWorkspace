package thread;

class MyThread03 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread3 : " + i);
		}
	}
}

public class Pr03 {
	public static void main(String[] args) {
		System.out.println("Thread가 종료될때까지 기다립니다.");
		MyThread03 s1 = new MyThread03();

		s1.start();

		try {
			s1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Thread가 종료되었습니다.");
	}
}
