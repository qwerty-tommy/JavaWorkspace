package week04Assignment;

import java.util.Scanner;

import java.util.ArrayList;

class Student {
	String name;
	int id;
	String phone;
	int year;
	ArrayList<Lecture> lectures = new ArrayList<Lecture>();

	void read(Scanner scan, Department department) {
		String tmp;
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		while (!(tmp = scan.next()).equals("0")) 
			lectures.add(department.findLecture(tmp));
	}

	public void print() {
		System.out.print(
				id + " " + name + " " + phone + " " + year + "학년 ");

		System.out.print("\t");
		for (Lecture mylec: lectures) {
			System.out.print("\t");
			mylec.print();
		}
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
			//아래 2가지 if문은 서로 다른 조건임
			//if (kwd.charAt(0) == '-' && matches(kwd.substring(1)))
			//	return false;
			
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
