package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();

	void readAll() {
		Student st = null;
		int idInput;
		while (true) {
			idInput = scan.nextInt();
			if (idInput == 0)
				break;
			st = new Student();
			st.read(scan, idInput);
			studentList.add(st);
		}
	}

	void printAll() {
		for (Student st : studentList) {
			st.print();
		}
	}

	void search() {
		String name = null;
		while (true) {
			System.out.print("¿Ã∏ß:");
			name = scan.next();
			if (name.equals("end"))
				break;
			for (Student st : studentList) {
				if (st.matches(name))
					st.print();
			}
		}
	}

}
