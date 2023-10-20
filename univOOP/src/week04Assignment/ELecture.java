package week04Assignment;

import java.util.Scanner;

class ELecture extends Lecture {
	String url;

	@Override
	void read(Scanner scan) {
		super.read(scan);
		url = scan.next();
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("\t\t[플립러닝] %s", url);
	}

	@Override
	boolean matches(String kwd) {
		if (super.matches(kwd))
			return true;
		if (url.contains(kwd))
			return true;
		return false;
	}
}