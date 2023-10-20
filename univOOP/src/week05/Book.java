package week05;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	String title;
	String pub;
	String isbn;
	int year;
	ArrayList<String> authors = new ArrayList<>();
	int price;

	void read(Scanner scan) {
		title = scan.next();
		pub = scan.next();
		isbn = scan.next();
		year = scan.nextInt();
		String token = null;
		while (true) {
			token = scan.next();
			if (token.contentEquals("0"))
				break;
			authors.add(token);
		}
		price = scan.nextInt();
	}

	void print() {
		printBookType();
		System.out.format("%s (%s/%s/%d년도) [%d원] 저자:",
				title, pub, isbn, year, price);
		for (String a: authors)
			System.out.print(a + " ");
		System.out.println();
	}
	
	void printBookType() {
		System.out.print("[일반책] ");
	}

	boolean matches(String kwd) {
		if (title.contains(kwd))
			return true;
		if (isbn.equals(kwd))
			return true;
		return false;
	}
}
