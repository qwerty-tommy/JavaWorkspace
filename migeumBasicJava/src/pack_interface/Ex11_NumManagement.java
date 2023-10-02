package pack_interface;

import java.util.Scanner;

interface Menu1 {
	int input = 1, search = 2, delete = 3, list = 4, end = 5;
}

interface Menu2 {
	int high = 1, univ = 2;
}

class Num {
	String name;
	String num;
	String address;

	public Num(String name, String num, String address) {
		this.name = name;
		this.num = num;
		this.address = address;
	}
}

class Highschool extends Num {
	String job;

	public Highschool(String name, String num, String address, String job) {
		super(name, num, address);
		this.job = job;
	}

	@Override
	public String toString() {
		String buffer = String.format("%10s%10s%10s%10s", name, num, address, job);
		return buffer;
	}
}

class College extends Num {
	String major;

	public College(String name, String num, String address, String major) {
		super(name, num, address);
		this.major = major;
	}

	@Override
	public String toString() {
		String buffer = String.format("%10s%10s%10s%10s", name, num, address, major);
		return buffer;
	}
}

public class Ex11_NumManagement implements Menu1, Menu2 {

	public static void main(String[] args) {
		final int MAXSIZE = 5;

		Scanner sc = new Scanner(System.in);
		Num info[] = new Num[MAXSIZE];
		int flag = 0;
		int loopCount = 0;
		String name;
		String num;
		String address;
		String additional;
		String buffer = String.format("%10s%10s%10s%10s", "name", "num", "address", "add");

		while (loopCount != MAXSIZE) {
			System.out.println("=>�����ϼ���..");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ����");
			System.out.println("4. ��ü����Ʈ");
			System.out.println("5. ���α׷� ����");
			System.out.print("���� : ");

			flag = sc.nextInt();

			switch (flag) {
			case 1:
				System.out.println("�������Է�");
				System.out.println("1.����б� 2.���б�");
				System.out.print("=>");
				flag = sc.nextInt();
				sc.nextLine();

				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				num = sc.nextLine();
				System.out.print("�ּ� : ");
				address = sc.nextLine();

				switch (flag) {
				case 1:
					System.out.print("���� : ");
					additional = sc.nextLine();
					info[loopCount] = new Highschool(name, num, address, additional);
					break;
				case 2:
					System.out.print("���� : ");
					additional = sc.nextLine();
					info[loopCount] = new College(name, num, address, additional);
					break;

				default:
					break;
				}
				loopCount++;
				break;

			case 2:
				sc.nextLine();
				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.println(buffer);
				
				for (int i = 0; i < MAXSIZE; i++) {
					if (info[i].name.equals(name)) {
						System.out.println(info[i]);
						flag = 0;
						break;
					}
				}
				if (flag != 0) {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;

			case 3:
				sc.nextLine();
				System.out.print("�̸� : ");
				name = sc.nextLine();

				for (int i = 0; i < loopCount; i++) {
					if (info[i].name.equals(name)) {
						info[i] = null;
						flag = 0;
						System.out.println("�����߽��ϴ�");
						break;
					}
				}
				if (flag != 0) {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;

			case 4:
				System.out.println(buffer);
				for (int i = 0; i < loopCount; i++) {
					System.out.println(info[i]);
				}
				break;

			default:
				break;
			}

			if (flag == 5)
				break;
		}
		sc.close();
	}
}