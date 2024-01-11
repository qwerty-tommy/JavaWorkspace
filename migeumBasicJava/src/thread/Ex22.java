package thread;

class ThreadA22 extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadA -------");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
}

class ThreadB22 extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB ...");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}

public class Ex22 {
	public static void main(String[] args) {
		ThreadA22 threadA = new ThreadA22();
		ThreadB22 threadB = new ThreadB22();
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.stop = true;
		threadB.stop = true;
	}
}
