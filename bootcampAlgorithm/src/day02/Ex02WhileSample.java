package day02;

import java.util.Scanner;

public class Ex02WhileSample {
	public static void main(String[] args) {
		int count = 0, sum = 0, tmp;
		Scanner scanny = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		tmp = scanny.nextInt();

		while (tmp != -1) {
			sum += tmp;
			count++;
			tmp = scanny.nextInt();
		}
		
		System.out.print("정수의 개수는 " + count + "개이며 ");
		System.out.println("평균은 " + (double)sum/count + "입니다.");
		
		scanny.close();
	}
}
