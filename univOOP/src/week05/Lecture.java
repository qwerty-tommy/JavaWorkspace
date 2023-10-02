package week05;

import java.util.ArrayList;
import java.util.Scanner;

class Lecture {
	int isElecture;
	String code;
	String name;
	int grade;
	String day;
	int time;

	ArrayList<Student> members = new ArrayList<>();

	Lecture(int isElecture) {
		this.isElecture=isElecture;
	}

	void read(Scanner scan) {
		code = scan.next();
		name = scan.next();
		grade = scan.nextInt();
		day = scan.next();
		time = scan.nextInt();
	}

	void print() {
		System.out.printf("%d %s %s %d %s %d",isElecture, code, name, grade, day, time);
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