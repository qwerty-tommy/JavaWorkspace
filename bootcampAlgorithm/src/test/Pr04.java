package test;

import java.util.HashMap;
import java.util.Scanner;

public class Pr04 {

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		HashMap<Integer, Integer> counter = new HashMap<>();

		System.out.println("202015015");

		while (true) {
			System.out.print("입력>> ");
			int select = scanny.nextInt();

			if (select == 0) {
				break;
			}

			int rand;

			for (int i = 0; i < select; i++) {
				counter.put(i, 0);
			}

			for (int i = 0; i < select; i++) {
				rand = (int) (Math.random() * select);
				counter.put(rand, counter.get(rand) + 1);
				System.out.print(rand + " ");
			}

			System.out.println();

			for (int i = 0; i < select; i++) {
				System.out.print(i + "(" + counter.get(i) + ") ");
			}

			System.out.println();
			counter.clear();

		}

		scanny.close();
	}
}
