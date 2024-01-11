package test;

import java.util.Scanner;

public class Pr01 {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);

		System.out.print("입력>> ");
		int select = scanny.nextInt();

		for (int i = 0; i < select; i++) {
			System.out.print(i + " ");
		}

		scanny.close();
	}
}
