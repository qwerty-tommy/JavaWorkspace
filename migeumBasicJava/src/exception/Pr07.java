package exception;

import java.util.Scanner;

class DoorException extends Exception {
	String message;
	
	public DoorException(String message) {
		this.message=message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}

class Door {
	boolean isOpened;

	public Door() {
		isOpened = true;
	}

	void open() {
		try {
			if (isOpened)
				throw new DoorException("이미 일려있습니다ㅠㅠ");
			isOpened = true;
			System.out.println("문을 성공적으로 열었습니다!");
		} catch (DoorException e) {
			System.out.println(e);
		}
	}

	void close() {
		try {
			if (!isOpened)
				throw new DoorException("이미 닫혀있습니다ㅠㅠ");
			isOpened = false;
			System.out.println("문을 성공적으로 닫았습니다!");
		} catch (DoorException e) {
			System.out.println(e);
		}
	}
}

class Pr07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Door door = new Door();

		while (true) {
			System.out.println("1.문상태 2.문열기 3.문닫기 4.종료");
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println(door.isOpened ? "열려있습니다" : "닫혀있습니다");
				break;
			}
			case 2: {
				door.open();
				break;
			}
			case 3: {
				door.close();
				break;
			}
			case 4: {
				scanner.close();
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + scanner);
			}
		}
	}

}
