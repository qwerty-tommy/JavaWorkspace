package day04;

import java.util.Scanner;

class Grade {
	int math;
	int sci;
	int eng;

	public Grade(int math, int sci, int eng) {
		super();
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	}

	int average() {
		return (int) (math + sci + eng) / 3;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int sci = scanner.nextInt();
		int eng = scanner.nextInt();
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.average() + " 입니다.");

		scanner.close();
	}

}
