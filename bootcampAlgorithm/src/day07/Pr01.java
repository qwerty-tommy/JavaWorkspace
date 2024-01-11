package day07;

import java.util.Scanner;
import java.util.Vector;

public class Pr01 {
	public static void main(String[] args) {
		Vector<Integer> box = new Vector<>();
		Scanner scanny = new Scanner(System.in);

		while (true) {
			System.out.println("정수(-1이 입력될 때까지)>> ");
			int tmp = scanny.nextInt();
			if (tmp == -1) {
				break;
			}
			box.add(tmp);
		}

		int maxNum = 0;

		for (Integer element : box) {
			maxNum = (element > maxNum) ? element : maxNum;
		}

		System.out.println("가장 큰 수는 " + maxNum);

		scanny.close();
	}
}


/*
10 6 22 6 88 77 -1
*/