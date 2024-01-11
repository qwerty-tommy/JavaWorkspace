package lambda;

public class Pr02 {
	static void turnOn(RemoteControl rc) {
		rc.turnOn();
	}

	static void turnOff(RemoteControl rc) {
		rc.turnOff();
	}

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

		//turnOn(() -> System.out.println("TV turnOn()"));
	}
}