package week05;

import java.util.Scanner;

class ELecture extends Lecture {
	String url;

	ELecture(int isElecture) {
		super(isElecture);
	}

	@Override
	void read(Scanner scan) {
		super.read(scan);
		url = scan.next();
	}

	@Override
	void print() {
		super.print();
		System.out.printf("\t\t%s\n", url);
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