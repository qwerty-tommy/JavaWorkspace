package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MonthScedule {
	private Map<Integer, Day> days = new HashMap<>();

	Day get(int date) {
		return days.get(date);
	}

	void set(int date, Day day) {
		days.put(date, day);
	}
}

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	public Day(String work) {
		this.work = work;
	}

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}

	@Override
	public String toString() {
		return work;
	}
}

public class Ex05 {
	static void input(MonthScedule monthScedule, Scanner scanner) {
		System.out.print("날짜(1~30)? ");
		int date = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)? ");
		String duty = scanner.next();
		monthScedule.set(date, new Day(duty));
	}

	static void lookup(MonthScedule monthScedule, Scanner scanner) {
		System.out.print("날짜(1~30)? ");
		int date = scanner.nextInt();
		System.out.println("1일의 할 일은 " + monthScedule.get(date) + " 입니다.");
	}

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		MonthScedule monthScedule = new MonthScedule();
		int select;

		while (true) {
			System.out.print("이번달 스케줄 관리 프로그램.\r\n" + "할일(입력:1, 보기:2, 끝내기:3) >> ");
			select = scanny.nextInt();
			
			switch (select) {
			case 1:
				input(monthScedule, scanny);
				break;
			case 2:
				lookup(monthScedule, scanny);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				scanny.close();
				return;

			default:
				break;
			}
		}
	}

}