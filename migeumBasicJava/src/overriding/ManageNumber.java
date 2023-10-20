package overriding;

import java.util.Scanner;

class normalFriend{
	String name;
	String phoneNum;
	
	public void print() {
		String str = String.format("%10s%10s", name, phoneNum);
		System.out.println(str);
	}

	public normalFriend(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
}

class collegeFriend extends normalFriend {
	String collegeName;
	int grade;

	public void print() {
		System.out.println(super.name+super.phoneNum+collegeName+grade);
	}

	public collegeFriend(String name, String phoneNum, String collegeName, int grade) {
		super(name, phoneNum);
		this.collegeName = collegeName;
		this.grade = grade;
	}
}

class companyFriend extends normalFriend {
	String companyName;

	public void print() {
		System.out.println(super.name+super.phoneNum+companyName);
	}

	public companyFriend(String name, String phoneNum, String companyName) {
		super(name, phoneNum);
		this.companyName = companyName;
	}
}

public class ManageNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		normalFriend[] f = new normalFriend[100];

		int flag;
		int friendNum = 0;

		String name;
		String phonenum;
		String spaceName;
		int grade;
      
		while (true) {
			System.out.println("=>�����ϼ���..");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ��ü����Ʈ");
			System.out.println("4. ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("���� : ");

			flag = sc.nextInt();

			switch (flag) {
			case 1:
				System.out.println("�������Է�");
				System.out.println("1.�Ϲ� 2.���� 3.ȸ��");
				System.out.print("=>");
				flag = sc.nextInt();
				sc.nextLine();

				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				phonenum = sc.nextLine();

				for (int i = 0; i < friendNum; i++) {
					if (f[i].name.equals(name)) {
						flag = 0;
					}
				}
				if (flag == 0) {
					System.out.println("�̹� �����մϴ�.");
					break;
				}

				switch (flag) {
				case 1:
					f[friendNum] = new normalFriend(name, phonenum);
					break;
				case 2:
					System.out.print("�����̸� : ");
					spaceName = sc.nextLine();
					System.out.print("�г� : ");
					grade = sc.nextInt();
					f[friendNum] = new collegeFriend(name, phonenum, spaceName, grade);
					break;
				case 3:
					System.out.print("ȸ��� : ");
					spaceName = sc.nextLine();
					f[friendNum] = new companyFriend(name, phonenum, spaceName);
					break;

				default:
					break;
				}

				friendNum++;
				break;
			case 2:
				sc.nextLine();
				System.out.print("�̸� : ");
				name = sc.nextLine();

				for (int i = 0; i < friendNum; i++) {
					if (f[i].name.compareTo(name) == 0) {
						f[i].print();
						flag = 0;
						break;
					}
				}
				if (flag != 0) {
					System.out.println("�������� �ʽ��ϴ�.");
				}

				break;
			case 3:
				for (int i = 0; i < friendNum; i++) {
						f[i].print();				
				}
				break;
			case 4:
				sc.nextLine();
				System.out.print("�̸� : ");
				name = sc.nextLine();

				for (int i = 0; i < friendNum; i++) {
					if (f[i].name.compareTo(name) == 0) {
						System.out.println("�����߽��ϴ�");
						f[i] = null;
						flag = 0;
						break;
					}
				}
				if (flag != 0) {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;
			case 5:

				break;

			default:
				break;
			}
			if(flag==-1) break;
		}
		sc.close();
	}
}
