package week04;

import java.util.ArrayList;
import java.util.Scanner;

class Lecture {
	String code;
	String name;
	int grade;
	String day;
	int time;

	ArrayList<Student> members = new ArrayList<>();

	Lecture(String name) {
		this.name = name;
	}

	void read(Scanner scan) {
		code = scan.next();
		grade = scan.nextInt();
		day = scan.next();
		time = scan.nextInt();
	}

	void print() {
		System.out.printf("%s %s %d %s %d", code, name, grade, day, time);
		System.out.println();
	}

	boolean matches(String kwd) {
		if (name.contentEquals(kwd)) {
			return true;
		}
		for (Student st : members)
			if (st.matches(kwd))
				return true;

		return false;
	}

}