package day01;

import java.util.Scanner;

public class Ex12NestedIf {
	static Boolean isPass(int grade, int score) {
		if (grade == 4) 
			return score>70;
		else
			return score>60;
		
	}

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int score, grade;

		System.out.print("점수를 입력하세요(0~100): ");
		score = scanny.nextInt();

		System.out.print("학년을 입력하세요(1~4): ");
		grade = scanny.nextInt();
		
		if(isPass(grade, score))
			System.out.println("합격!");
		else
			System.out.println("불합격!");
		
		scanny.close();
	}
}
