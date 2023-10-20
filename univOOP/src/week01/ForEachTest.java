package week01;

import java.util.Scanner;

public class ForEachTest {
	int scores[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int sum;
	Scanner scanner = new Scanner(System.in);

	void start() {
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("%d ", sum);

		for (int n : scores)
			System.out.printf("%d ", n);
	}

	public static void main(String[] args) {
		ForEachTest test = new ForEachTest();
		test.start();
	}

}
