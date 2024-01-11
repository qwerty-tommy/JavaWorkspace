package day02;

import java.util.Scanner;

public class Pr02ArrayGen {
	public static Boolean checkDuplicate(int array[], int target) {
		for (int i = 0; i < 100; i++) {
			if (target == array[i])
				return false;
		}
		return true;
	}

	public static void generate(int array[], int size) {
		for (int j = 0; j < size; j++) {
			int i = (int) (Math.random() * 100 + 1);
			if (checkDuplicate(array, i))
				array[j] = i;
			else {
				j--;
				continue;
			}
		}
	}

	public static void sysout(int array[], int size) {
		for (int j = 0; j < size; j++) {
			System.out.print(array[j] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 몇 개? ");
		int size = scanner.nextInt();
		int array[] = new int[100];

		generate(array, size);
		sysout(array, size);

		scanner.close();
	}
}
