package collectionFramework3;

import java.util.HashMap;
import java.util.Scanner;

class Phone {
	String name;
	String address;
	String phoneNum;

	public Phone(String name, String address, String phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return name + address + phoneNum;
	}
}

public class Pr03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		String address;
		String phoneNum;
		HashMap<String, Phone> phoneMap = new HashMap<>();

		while (true) {
			System.out.print("삽입:0 삭제:1 찾기:2 전체보기:3 종료:4 =>");
			switch (scanner.nextInt()) {
			case 0:
				System.out.print("이름 : ");
				name = scanner.next();
				System.out.print("주소 : ");
				address = scanner.next();
				System.out.print("전화번호 : ");
				phoneNum = scanner.next();

				phoneMap.put(name, new Phone(name, address, phoneNum));
				break;

			case 1:
				System.out.print("이름 : ");
				phoneMap.remove(scanner.next());
				break;

			case 2:
				System.out.print("이름 : ");
				System.out.println(phoneMap.get(scanner.next()));
				break;

			case 3:
				System.out.println(phoneMap);
				break;

			case 4:
				scanner.close();
				return;

			default:
				break;
			}
		}
	}
}
