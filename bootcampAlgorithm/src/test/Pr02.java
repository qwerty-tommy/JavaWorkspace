package test;

import java.util.Scanner;

public class Pr02 {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);

		while (true) {
			System.out.print("입력>> ");
			int select = scanny.nextInt();

			if (select == 0) {
				break;
			}

			for (int i = 0; i < select; i++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

		scanny.close();
	}
}
