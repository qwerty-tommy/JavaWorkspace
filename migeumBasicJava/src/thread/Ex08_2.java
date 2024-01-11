package thread;

class ThreadEx08 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			if (i % 50 == 0)
				System.out.println();
		}
		System.out.print("소요시간2:" + (System.currentTimeMillis() - Ex08_2.startTime));
	}
}

public class Ex08_2 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx08 myThread = new ThreadEx08();
		myThread.start();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			if (i % 50 == 0)
				System.out.println();
		}
		System.out.print("소요시간1:" + (System.currentTimeMillis() - Ex08_2.startTime));
	}

}
