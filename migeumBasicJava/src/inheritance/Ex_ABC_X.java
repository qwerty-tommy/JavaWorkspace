package inheritance;

import java.util.Scanner;

public class Ex_ABC_X {

	public static void main(String[] args) {
		C[] man = new C[3];
		Scanner sc = new Scanner(System.in);

		String name;
		String idNum;
		int height;
		int weight;
		double sight;
		int score1;
		int score2;
		int score3;

		for (int i = 0; i < 3; i++) {
			System.out.print("�̸� : ");
			name = sc.nextLine();
			System.out.print("�ֹι�ȣ : ");
			idNum = sc.nextLine();
			System.out.print("Ű : ");
			height = sc.nextInt();
			System.out.print("������ : ");
			weight = sc.nextInt();
			System.out.print("�÷� : ");
			sight = sc.nextDouble();
			System.out.print("���� : ");
			score1 = sc.nextInt();
			System.out.print("���� : ");
			score2 = sc.nextInt();
			System.out.print("���� : ");
			score3 = sc.nextInt();
			sc.nextLine();
			man[i] = new C(name, idNum, height, weight, sight, score1, score2, score3);
			System.out.println("\n");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸� : " + man[i].name);
			System.out.println("=============");
			System.out.println("�ֹι�ȣ : " + man[i].num);
			System.out.println("Ű : " + man[i].height);
			System.out.println("������ : " + man[i].weight);
			System.out.println("�÷� : " + man[i].sight);
			System.out.print("���� : " + man[i].score1);
			System.out.print("  ���� : " + man[i].score2);
			System.out.println("  ���� : " + man[i].score3 + "\n");
			System.out.print("���� : " + man[i].sum());
			System.out.println("  ��� : " + man[i].avg()+"\n");
		}

		sc.close();

	}

}
