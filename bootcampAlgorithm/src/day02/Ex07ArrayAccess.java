package day02;

import java.util.Scanner;

public class Ex07ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
		}

		int max = -1;
		for (int i : arr) {
			max = (max > arr[i]) ? max : arr[i];
		}

		System.out.println(max);
	}
}
