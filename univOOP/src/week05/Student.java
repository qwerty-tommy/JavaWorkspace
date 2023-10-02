package week05;

import java.util.Scanner;
import java.util.ArrayList;

class Student {
	private int id;
	String name;
	private String phone;
	private int year;
	private int score;
	ArrayList<Lecture> lectures = new ArrayList<Lecture>();

	public Student() {
	}

	void read(Scanner scan, Department department) {
		String tmp;
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		while (!(tmp = scan.next()).equals("0")) {
			lectures.add(department.findLecture(tmp));
		}
	}

	void print() {
		System.out.print(
				id + " " + name + " " + phone + " " + year + "�г� " + ((score == -1) ? "NaN" : String.valueOf(score)));

		System.out.print("\t");
//		for (int i = 0;  i < lectures.size(); i++) {
//			System.out.printf("[%s] ", lectures.get(i).code);
//		}
		System.out.println();
	}

	boolean matches(String kwd) {
		// return name.equals(kwd) || Integer.toString(id).equals(kwd);
		if (kwd.contains(name))
			return true;
		if (kwd.length() >= 4 && phone.contains(kwd))
			return true;
		if (kwd.contentEquals("" + year))
			return true;
		return kwd.length() > 4 && kwd.contains("" + id);
	}

	boolean matches(String[] kwds) {
		for (String kwd : kwds) {
			if (kwd.charAt(0) == '-' && matches(kwd.substring(1)))
				return false;

			else if (!matches(kwd))
				return false;
		}
		return true;
	}

	boolean matchScore(String kwdFrom, String kwdTo) {
		int from;
		int to;

		if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = 0;
			to = 100;
		} else if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = Integer.parseInt(kwdFrom);
			to = 100;
		} else if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = 0;
			to = Integer.parseInt(kwdTo);
		} else {
			from = Integer.parseInt(kwdFrom);
			to = Integer.parseInt(kwdTo);
		}

		return score >= from && score <= to;
	}
}
