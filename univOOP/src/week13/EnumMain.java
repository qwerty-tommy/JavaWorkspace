package week13;

import java.util.Iterator;
import java.util.Scanner;

enum WorkDay {
	MONDAY(1, "월"), TUESDAY(2, "화"), WEDNESDAY(3, "수"), THURSDAY(4, "목"), FRIDAY(0, "금");

	int number;
	String yoil;

	private WorkDay(int n, String harg) {
		number = n;
		yoil = harg;
	}

	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}

	int num() {
		return number;
	}

	String yoil() {
		return yoil;
	}
}

public class EnumMain {
	void run2() {
		Scanner scanner = new Scanner(System.in);
		WorkDay[] days = new WorkDay[5];
		for (int i = 0; i < 5; i++) {
			days[i] = WorkDay.valueOf(scanner.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s (%d) %s\n", days[i].name(), days[i].num(), days[i]);
			System.out.printf("%d년도생, %d년도생은 마스크 구입할 수 있습니다.\n", days[i].num() + 2000, days[i].num() + 2005);
		}
	}

	void run() {
		WorkDay day1 = WorkDay.THURSDAY;
		WorkDay day2 = WorkDay.MONDAY;
		System.out.printf("%s (%d) %s\n", day1.name(), day1.num(), day1);
		int n = 2002;
		System.out.printf("%d년도생: %s요일 마스크 구입 ", n, day2.yoil());
		if (n % 5 == day2.num())
			System.out.println("가능");
		else
			System.out.println("불가");
	}

	public static void main(String[] args) {
		EnumMain enumMain = new EnumMain();
		enumMain.run2();
	}
}
