package day02;

import java.util.Scanner;

public class Ex05ContinueExample {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);

		int sum = 0, n;
		System.out.println("정수를 5개 입력하세요.");

		for (int i = 0; i < 5; i++) {
			n = scanny.nextInt();
			if (n < 0)
				continue;
			sum += n;
		}

		System.out.println("양수의 합은 " + sum);

	}
}
