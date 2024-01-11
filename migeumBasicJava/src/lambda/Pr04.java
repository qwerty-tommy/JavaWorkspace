package lambda;

import java.util.Scanner;

@FunctionalInterface
interface MyFunction04 {
	public int calculate(int x, int y);
}

public class Pr04 {
	public static void main(String[] args) {
		Scanner scany = new Scanner(System.in);
		int x, y;
		int result;

		System.out.println("Input x : ");
		x = scany.nextInt();
		System.out.println("Input y : ");
		y = scany.nextInt();

		MyFunction04 mf = (int a, int b) -> a * b;
		
		result = mf.calculate(x, y);

		System.out.println("Result is " + result);
	}
}
