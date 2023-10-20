package week08;

import java.util.Scanner;

import mgr.Manageable;

public class Lecture implements Manageable, Comparable<Lecture> {
	String code;
	String name;
	int year;
	String day;
	String time;

	public Lecture() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void read(Scanner scan) {
		code = scan.next();
		name = scan.next();
		// System.out.println(name);
		year = scan.nextInt();
		day = scan.next();
		time = scan.next();
	}

	@Override
	public void print() {
		System.out.printf("(%s) %s (%d학년) %s%s\n", code, name, year, day, time);
	}

	@Override
	public boolean matches(String code2) {
		// TODO Auto-generated method stub
		if (code.equals(code2))
			return true;
		return false;
	}

	@Override
	public int compareTo(Lecture other) {
		if (year > other.year) return 1;
		if (year < other.year) return -1;
		if (!name.equals(other.name)) 
		return name.compareTo(other.name);
		else
			return code.compareTo(other.code);
	}
}
