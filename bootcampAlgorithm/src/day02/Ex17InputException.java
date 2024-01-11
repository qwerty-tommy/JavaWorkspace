package day02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex17InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개를 입력하세요");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			try {
				sum += scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();
				i--;
				continue;
			}
		}

		System.out.println(sum);

		scanner.close();
	}
}
