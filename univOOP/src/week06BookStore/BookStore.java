package week06BookStore;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	Scanner scan = new Scanner(System.in);
	ArrayList<Manageable> sellList = new ArrayList<>();

	void run() {
		readAllBooks();
		printAllBooks();
		search();
	}

	private void printAllBooks() {
		for (Manageable b : sellList)
			b.print();
	}

	void readAllBooks() {
		Scanner filein = openFile("book4.txt");
		int n = 0;
		Manageable m = null;
		while (filein.hasNext()) {
			n = filein.nextInt();
			switch (n) {
			case 1:
				m = new Book();
				break;
			case 2:
				m = new EBook();
				break;
			case 3:
				m = new ABook();
				break;
			case 4:
				m = new Pen();
				break;
			case 5:
				m = new Tissue();
				break;
			default:
				break;
			}
			m.read(filein);
			sellList.add(m);
		}
	}

	void search() {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			for (Manageable b : sellList)
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
