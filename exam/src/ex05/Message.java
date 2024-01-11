package ex05;

import java.util.Scanner;

public class Message implements Manageable {
	String code; // 과목 코드
	String date;
	String line;

	@Override
	public void read(Scanner scan) {
		code = scan.next();
		date = scan.next();
		line = scan.nextLine();
	}

	@Override
	public void print() {
		System.out.printf("%s %s (%s)\n", code, date, line);
	}

	@Override
	public boolean matches(String kwd) {
		if (code.equals(kwd))
			return true;
		return false;
	}

}
