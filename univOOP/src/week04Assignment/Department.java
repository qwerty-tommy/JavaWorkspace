package week04Assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Lecture> lecturelist = new ArrayList<>();

	void run() {
		int menu;
		readAllLectures();
		readAllStudents();
		while (true) {
			System.out.print("(1)학생출력 (2)수업출력 (3)학생검색 (4)수업검색");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				printAllStudents();
				break;
			case 2:
				printAllLectures();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				searchLecture();
				break;
			default:
				break;
			}
		}
	}

	void readAllLectures() {
		Scanner filein=openFile("lecture.txt");
		Lecture lec = null;
		int isElecture;
		
		while (filein.hasNext()) {
			isElecture = filein.nextInt();
			switch (isElecture) {
			case 1:
				lec = new Lecture();
				break;
			case 2:
				lec = new ELecture();
				break;
			default:
				break;
			}

			lec.read(filein);
			lecturelist.add(lec);
		}
		filein.close();
	}

	void printAllLectures() {
		for (Lecture lec : lecturelist)
			lec.print();
		System.out.println();
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

	void readAllStudents() {
		Scanner filein=openFile("student.txt");
		Student st;
		
		while (filein.hasNext()) {
			st = new Student();
			st.read(filein,  this);
			studentList.add(st);
		}
		
		filein.close();
	}

	void printAllStudents() {
		for (Student st : studentList) {
			st.print();
		}
	}

	void searchStudent() {
		String line = null;
		line = scan.nextLine();
		String[] kwdArr;
		while (true) {
			System.out.print("검색할 키워드: ");
			line = scan.nextLine();
			kwdArr = line.trim().split(" ");
			if (kwdArr[0].equals("end"))
				break;
			for (Student st : studentList) {
				if (st.matches(kwdArr))
					st.print();
			}
		}
	}
	
	void searchLecture() {
		String line = null;
		line = scan.nextLine();
		String[] kwdArr;
		while (true) {
			System.out.print("\n검색할 키워드: ");
			line = scan.nextLine();
			kwdArr = line.trim().split(" ");
			if (kwdArr[0].equals("end"))
				break;
			for (Lecture lec : lecturelist) {
				if (lec.matches(kwdArr))
					lec.print();
			}
		}
	}

	public Lecture findLecture(String code) {
		for (Lecture lec : lecturelist) {
			if (lec.matches(code))
				return lec;
		}
		return null;
	}

}
