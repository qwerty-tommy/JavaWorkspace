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
				throw new DoorException("�̹� �Ϸ��ֽ��ϴ٤Ф�");
			isOpened = true;
			System.out.println("���� ���������� �������ϴ�!");
		} catch (DoorException e) {
			System.out.println(e);
		}
	}

	void close() {
		try {
			if (!isOpened)
				throw new DoorException("�̹� �����ֽ��ϴ٤Ф�");
			isOpened = false;
			System.out.println("���� ���������� �ݾҽ��ϴ�!");
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
			System.out.println("1.������ 2.������ 3.���ݱ� 4.����");
			switch (scanner.nextInt()) {
			case 1: {
				System.out.println(door.isOpened ? "�����ֽ��ϴ�" : "�����ֽ��ϴ�");
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
