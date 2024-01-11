package thread;

class MessageSendingThread12 extends Thread {
	String message;

	public MessageSendingThread12(String str, int prio) {
		message = str;
		setPriority(prio);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(message + "(" + getPriority() + ")");
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex12 {
	public static void main(String[] args) {
		MessageSendingThread12 tr1 = new MessageSendingThread12("First", Thread.MAX_PRIORITY);
		MessageSendingThread12 tr2 = new MessageSendingThread12("Second", Thread.NORM_PRIORITY);
		MessageSendingThread12 tr3 = new MessageSendingThread12("Third", Thread.MIN_PRIORITY);
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
