package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Pr05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letter;
		int height;

		System.out.print("피라미드에 쌓을 문자 : ");
		letter = scanner.next().charAt(0);

		while (true) {
			try {
				System.out.print("피라미드 층수 : ");
				height = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scanner.nextLine();
			}
		}

		scanner.close();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(letter);
			}

			System.out.println();
		}
	}

}
