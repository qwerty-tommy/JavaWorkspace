package day02;

import java.util.Scanner;

public class Pr01CharDecrease {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		char c = scanner.next().charAt(0);
		char tmp;

		while (c >= 'a') {
			tmp = 'a';
			while (tmp <= c) {
				System.out.print(tmp);
				tmp = (char) (tmp + 1);
			}
			c = (char) (c - 1);
			System.out.println();
		}

		scanner.close();
	}
}
