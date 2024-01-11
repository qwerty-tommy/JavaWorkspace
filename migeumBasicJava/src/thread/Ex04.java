package thread;

class ThreadA extends Thread {
	String name;

	public ThreadA(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			System.out.print(name);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class ThreadB extends Thread {
	String name;

	public ThreadB(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			System.out.print(name);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Ex04 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		ThreadA threadA = new ThreadA("A스레드");
		ThreadB threadB = new ThreadB("B스레드");
		threadA.start();
		threadB.start();
		for (int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName());
	}
}
