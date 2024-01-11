package thread;

class MessageSendingThread11 extends Thread {
	String message;

	public MessageSendingThread11(String str) {
		message = str;
	}

	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(message + "(" + getPriority() + ")");
	}
}

public class Ex11 {
	public static void main(String[] args) {
		MessageSendingThread11 tr1 = new MessageSendingThread11("First");
		MessageSendingThread11 tr2 = new MessageSendingThread11("Second");
		MessageSendingThread11 tr3 = new MessageSendingThread11("Third");
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
