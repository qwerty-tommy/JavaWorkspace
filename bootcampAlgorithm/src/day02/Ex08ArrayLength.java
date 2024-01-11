package day02;

import java.util.Scanner;

public class Ex08ArrayLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = -1;
		for (int i : arr) {
			sum += i;
		}

		System.out.println((sum/5));
	}
}
