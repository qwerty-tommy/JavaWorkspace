package week02;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String phone;
	private int year;

	public Student() {
	}

	void read(Scanner scan, int idInput) {
		id = idInput;
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}

	void print() {
		System.out.println(id + " " + name + " " + phone + " " + year + "ÇÐ³â");
	}

	boolean matches(String kwd) {
		//return name.equals(kwd) || Integer.toString(id).equals(kwd);
		return kwd.equals(name) 
				|| kwd.equals(""+id)
				||kwd.endsWith(phone);
	}
}
