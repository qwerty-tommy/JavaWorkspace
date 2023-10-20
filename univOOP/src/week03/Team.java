package week03;

import java.util.ArrayList;
import java.util.Scanner;

class Team {
	String name;
	ArrayList<Student> members = new ArrayList<>();

	Team(String name) {
		this.name = name;
	}

	void read(Scanner scan, Department department) {
		int studentNumber;
		Student st = null;
		while (true) {
			studentNumber = scan.nextInt();
			if (studentNumber == 0)
				break;
			st = department.findStudent(studentNumber);
			st.setMyTeam(this);
			members.add(st);
		}
	}

	void print() {
		System.out.printf("%s: ", name);
		for (Student st : members) {
			System.out.printf("%s ", st.name);
		}
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