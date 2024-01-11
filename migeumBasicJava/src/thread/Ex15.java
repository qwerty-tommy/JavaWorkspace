package thread;

class ThreadEx12_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			if (i % 20 == 0)
				System.out.println();
		}
		System.out.print("<<th1 종료>>");
	}
}

class ThreadEx12_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			if (i % 20 == 0)
				System.out.println();
		}
		System.out.print("<<th2 종료>>");
	}
}

public class Ex15 {
	public static void main(String args[]) {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();
		th1.start();
		th2.start();
		try {
			// th1.sleep(2000); //sleep()의 영향은 현재 실행중인 main()스레드
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.print("<<main 종료>>");
	}

}
