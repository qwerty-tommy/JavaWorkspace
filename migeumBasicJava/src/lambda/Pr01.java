package lambda;

interface RemoteControl {
	void turnOn();

	void turnOff();
}

public class Pr01 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};

		rc.turnOn();
		rc.turnOff();
	}
}
