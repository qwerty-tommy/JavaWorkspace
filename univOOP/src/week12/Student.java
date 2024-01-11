package week12;

import java.util.Scanner;

import mgr.Manageable;

public class Student implements Manageable {
	String name;
	int id;
	String phone;
	int year;

	@Override
	public void read(Scanner scan) {
		id = scan.nextInt();
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
	}

	@Override
	public void print() { // Student
		System.out.format("%d %s %s (%d학년)\n", id, name, phone, year);
	}
	@Override
	public boolean matches(String kwd) {
		// TODO Auto-generated method stub
		if (name.contentEquals(kwd))
			return true;
		return ("" + id).contentEquals(kwd);
	}
}