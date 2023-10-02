package nestedInterface;

interface RemoteControl {
	public void turnOn();

	public void turnOff();
}

class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		}

		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù");
			}
		};
		localVar.turnOn();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}

public class Pr07 {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV¸¦ ÄÕ´Ï´Ù");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV¸¦ ²ü´Ï´Ù");
			}
		});
	}
}
