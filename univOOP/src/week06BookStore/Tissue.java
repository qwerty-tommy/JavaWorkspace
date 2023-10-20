package week06BookStore;

import java.util.Scanner;

class Tissue implements Manageable {
	String tissueName;
	int nSheets;
	int price;

	@Override
	public void read(Scanner scan) {
		tissueName = scan.next();
		nSheets = scan.nextInt();
		price = scan.nextInt();
	}

	@Override
	public void print() {
		System.out.printf("[티슈]\t%s %d장 [%d원]\n", tissueName, nSheets, price);
	}

	@Override
	public boolean matches(String kwd) {
		if (kwd.contains(tissueName))
			return true;
		if (kwd.contentEquals("" + nSheets))
			return true;
		if (kwd.contentEquals("" + price))
			return true;
		return false;
	}
}
