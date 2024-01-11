package thread;

class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) {
			Thread.State state = targetThread.getState(); // 스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);
			if (state == Thread.State.NEW) { // 객체생성상태일 경우 실행대기상태로 만듬targetThread.start();
			}
			if (state == Thread.State.TERMINATED) { // 종료상태일 경우
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class TargetThread extends Thread {
	public void run() {
		for (long i = 0; i < 10; i++) {
		}
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		for (long i = 0; i < 10; i++) {
		}
	}
}

public class Ex14 {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
