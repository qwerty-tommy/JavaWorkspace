package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Pr05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letter;
		int height;

		System.out.print("�Ƕ�̵忡 ���� ���� : ");
		letter = scanner.next().charAt(0);

		while (true) {
			try {
				System.out.print("�Ƕ�̵� ���� : ");
				height = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���");
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
