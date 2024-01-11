package day01;

import java.util.Scanner;

public class Ex14PrintFruitPrice {
	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		String name = scanny.next();
		int price;

		switch (name) {
		case "mango":
			price = 1500;
			break;

		case "apple":
		case "banana":
			price = 1000;
			break;

		case "orange":
			price = 500;
			break;

		default:
			price = 0;
			break;
		}

		System.out.println(price + "원");

		scanny.close();
	}
}
