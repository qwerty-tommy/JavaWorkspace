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
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("주민번호 : ");
			idNum = sc.nextLine();
			System.out.print("키 : ");
			height = sc.nextInt();
			System.out.print("몸무게 : ");
			weight = sc.nextInt();
			System.out.print("시력 : ");
			sight = sc.nextDouble();
			System.out.print("국어 : ");
			score1 = sc.nextInt();
			System.out.print("영어 : ");
			score2 = sc.nextInt();
			System.out.print("수학 : ");
			score3 = sc.nextInt();
			sc.nextLine();
			man[i] = new C(name, idNum, height, weight, sight, score1, score2, score3);
			System.out.println("\n");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("이름 : " + man[i].name);
			System.out.println("=============");
			System.out.println("주민번호 : " + man[i].num);
			System.out.println("키 : " + man[i].height);
			System.out.println("몸무게 : " + man[i].weight);
			System.out.println("시력 : " + man[i].sight);
			System.out.print("국어 : " + man[i].score1);
			System.out.print("  영어 : " + man[i].score2);
			System.out.println("  수학 : " + man[i].score3 + "\n");
			System.out.print("총점 : " + man[i].sum());
			System.out.println("  평균 : " + man[i].avg()+"\n");
		}

		sc.close();

	}

}
