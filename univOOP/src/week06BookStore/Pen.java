package week06BookStore;

import java.util.Scanner;

class Pen implements Manageable {
	String itemName;
	float mmThick;
	int price;

	@Override
	public void read(Scanner scan) {
		itemName = scan.next();
		mmThick = scan.nextFloat();
		price = scan.nextInt();
	}

	@Override
	public void print() {
		System.out.printf("[팬]\t%s %.2fmm [%d원]\n", itemName, mmThick, price);
	}

	@Override
	public boolean matches(String kwd) {
		if (kwd.contains(itemName))
			return true;
		if (kwd.contentEquals("" + mmThick))
			return true;
		if (kwd.contentEquals("" + price))
			return true;
		return false;
	}
}
