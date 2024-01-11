package day01;

import java.util.Scanner;

public class Pr01ChargeCalculator {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);

		System.out.print("금액을 입력하시오 >>");
		int money = scanny.nextInt();

		System.out.println("오만원권 " + money / 50000 + "매");
		System.out.println("만원권 " + money % 50000 / 10000 + "매");
		System.out.println("천원권 " + money % 10000 / 1000 + "매");
		System.out.println("백원권 " + money % 1000 / 100 + "매");
		System.out.println("오십권 " + money % 100 / 50 + "매");
		System.out.println("십권 " + money % 50 / 10 + "매");
		System.out.println("일권 " + money % 10 + "매");

		scanny.close();
	}
}
