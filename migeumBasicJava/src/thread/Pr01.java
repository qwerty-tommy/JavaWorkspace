package thread;

class ThreadEX extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(10-i);			
		}
	}
}

public class Pr01 {
	public static void main(String[] args) throws Exception {
		ThreadEX th1 = new ThreadEX();
		th1.start();
	}

}
