package thread;

class MyThread05 implements Runnable {
	@Override
	public void run() {
		int i = 100;
		System.out.println("1~" + i + "까지의 합 : " + (int) (i * (i + 1) / 2));
	}
}

public class Pr05 {
	public static void main(String[] args) {
		new Thread(new MyThread05()).start();
	}
}
