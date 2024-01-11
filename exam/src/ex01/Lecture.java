package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture implements Manageable {
	String code;
	ArrayList<Food> outList = new ArrayList<>();

	public Lecture(String code) {
		this.code = code;
	}

	@Override
	public void read(Scanner scan) {
	}

	@Override
	public void print() {
		System.out.printf("[%s]\n", code);
		for (Food message : outList) {
//			System.out.printf("%s (%s) %s\n", message.code, message.date, message.line);
		}
	}

	@Override
	public boolean matches(String kwd) {
		return code.equals(kwd);
	}

	void addMsg(Food m) {
		outList.add(m);
	}
}
