package day07;

import java.util.HashMap;
import java.util.Scanner;

public class Pr02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> countries = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = scanner.next();

			if (country.equals("그만"))
				break;

			int population = scanner.nextInt();
			countries.put(country, population);
		}

		while (true) {
			System.out.print("인구 검색 >> ");
			String country = scanner.next();

			if (country.equals("그만"))
				break;

			if (countries.containsKey(country)) {
				System.out.println(country + "의 인구는 " + countries.get(country));
			} else {
				System.out.println(country + " 나라는 없습니다.");
			}
		}
		scanner.close();
	}
}

/*
Korea 5000
USA 1000000
Swiss 2000
France 3000
그만
France
스위스
그만
 */

