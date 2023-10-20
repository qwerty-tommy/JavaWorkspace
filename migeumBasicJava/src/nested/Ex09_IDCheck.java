package nested;

import java.util.Scanner;

class Info {
	String name;
	String num;
	int score1, score2, score3;
	String sex;
	String birth;
	int age;

	class forCheck {
		public String check(String num, String sex, String birth) {

			boolean flag = false;
			Scanner sc = new Scanner(System.in);

			while (flag == false) {
				String[] splitedNum = num.split("-");
				int firstNum = Integer.parseInt(splitedNum[0]);
				int secondNum = Integer.parseInt(splitedNum[1]);
				int intBirth = Integer.parseInt(birth);

				if (!((secondNum / 1000000 == 2) || (secondNum / 1000000 == 3))) {
					System.out.println("�ֹι�ȣ�� Ʋ���ϴ�. �ٽ� �Է��ϼ���!!");
					num = sc.nextLine();
					continue;
				}
				if (!(firstNum == (int) intBirth % 1000000)) {
					System.out.println("�ֹι�ȣ�� Ʋ���ϴ�. �ٽ� �Է��ϼ���!!");
					num = sc.nextLine();
					continue;
				}
				if (!(sex == "��" && secondNum / 1000000 == 3) || !(sex == "��" && secondNum / 1000000 == 2)) {
					System.out.println("�ֹι�ȣ�� Ʋ���ϴ�. �ٽ� �Է��ϼ���!!");
					num = sc.nextLine();
					continue;
				}
				flag = true;
			}

			return num;
		}
	}
	
	public void printInfo() {
		System.out.println(name+"�� ������");
		System.out.println("������� : "+birth);
		System.out.println("���� : "+age);
		System.out.println("���� : "+(score1+score2+score3));
		System.out.println("��� : "+((score1+score2+score3)/3));
	}

	public Info(String name, String num, int score1, int score2, int score3, String sex, String birth, int age) {
		forCheck check = new forCheck();

		this.name = name;
		this.num = check.check(num, sex, birth);
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sex = sex;
		this.birth = birth;
		this.age = age;
	}
}

public class Ex09_IDCheck {

	public static void main(String[] args) {
		Info person = new Info("ȫ�⵿", "111111-1111111", 100, 100, 100, "��", "199111111", 106);

	}

}
