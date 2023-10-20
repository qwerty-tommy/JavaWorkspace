package week04Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Lecture {
	String code;
	String name;
	int grade;
	String day;
	int time;

	ArrayList<Student> members = new ArrayList<>();

	void read(Scanner scan) {
		code = scan.next();
		name = scan.next();
		grade = scan.nextInt();
		day = scan.next();
		time = scan.nextInt();
	}

	void print() {
		System.out.printf("\n[%s] %s (%d학년) %s %d", code, name, grade, day, time);
	}

	boolean matches(String kwd) {
		if (kwd.contentEquals(code)) {// Department.findLecture()에서 사용
			return true;
		}
		if (kwd.contentEquals(name)) {
			return true;
		}
		if (kwd.contentEquals("" + grade)) {
			return true;
		}
		if (kwd.length() > 1 && kwd.contentEquals("" + time)) {
			return true;
		}
		if (kwd.contentEquals(day)) {
			return true;
		}

		return false;
	}

	boolean matches(String[] kwds) {
		for (String kwd : kwds) {
			if (kwd.charAt(0) == '-') {
				if (matches(kwd.substring(1)))
					return false;
			}

			else if (!matches(kwd))
				return false;
		}
		return true;
	}
}