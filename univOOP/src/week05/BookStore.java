package week05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	Scanner scan = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<>();

	void run() {
		readAllBooks();
		printAllBooks();
		search();
	}

	private void printAllBooks() {
		for (Book b : bookList)
			b.print();
	}

	void readAllBooks() {
		Scanner filein=openFile("book.txt");
		int n = 0;
		Book b = null;
		while (filein.hasNext()) {
			n = filein.nextInt();
			switch (n) {
			case 1:
				b = new Book();
				break;
			case 2:
				b = new EBook();
				break;
			case 3:
				b = new ABook();
				break;
			default:
				break;
			}
			b.read(filein);
			bookList.add(b);
		}
	}

	void search() {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			for (Book b : bookList)
				if (b.matches(kwd))
					b.print();
		}
	}
	
	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.printf("파일 오픈 실패: %s\n", filename);
			System.exit(0);
		}
		return filein;
	}


	public static void main(String[] args) {
		BookStore store = new BookStore();
		store.run();
	}

}
