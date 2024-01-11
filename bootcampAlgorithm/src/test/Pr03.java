package test;

import java.util.Scanner;

public class Pr03 {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);

		while (true) {
			System.out.print("입력>> ");
			int select = scanny.nextInt();

			if (select == 0) {
				break;
			}

			for (int i = 0; i < select; i++) {
				System.out.print((int) (Math.random() * select) + " ");
			}
			
			System.out.println();

		}

		scanny.close();
	}
}
