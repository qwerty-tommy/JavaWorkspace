package week06Assignment;

import java.util.Scanner;

public class Item implements Manageable {
	int num;
	static int count = 0;
	String code;
	String name;
	int price;

	public void read(Scanner scan) {
		num = ++count;
		code = scan.next();
		name = scan.next();
		price = scan.nextInt();
	}

	public void print() {
		System.out.printf("[%d] %s %s\t%5d원\n", num, code, name, price);
	}

	public boolean matches(String kwd) {
		if (kwd.length() <= 2 && kwd.equals("" + num))
			return true;
		if (name.contains(kwd))
			return true;
		if (kwd.length() > 2 && code.contains(kwd))
			return true;
		return false;
	}
}