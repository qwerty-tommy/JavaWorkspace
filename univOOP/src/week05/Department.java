package week05;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Lecture> lecturelist = new ArrayList<>();

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

	void run() {
		int menu;
		readAllLectures();
		readAllStudents();
		while (true) {
			System.out.print("(1)학생출력 (2)수업출력");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				printAllStudents();
				break;
			case 2:
				printAllLectures();
				break;
			case 3:
				search();
				break;
			default:
				break;
			}
		}
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

	void search() {
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

	void readAllLectures() {
		Scanner filein=openFile("lecture.txt");
		Lecture t = null;
		int isElecture;
		
		while (filein.hasNext()) {
			isElecture = filein.nextInt();
			if (isElecture == 0)
				break;
			switch (isElecture) {
			case 1:
				t = new Lecture(isElecture);
				break;
			case 2:
				t = new ELecture(isElecture);
				break;
			default:
				break;
			}

			t.read(filein);
			lecturelist.add(t);
		}
	}

	void printAllLectures() {
		for (Lecture team : lecturelist)
			team.print();
	}

//	Student findStudent(int studentNumber) {
//		if (studentNumber <= 0 || studentNumber > studentList.size()) {
//			return null;
//		}
//		return studentList.get(studentNumber - 1);
//	}

	public Lecture findLecture(String code) {
		for (Lecture lec : lecturelist) {
			if (lec.matches(code))
				return lec;
		}
		return null;
	}

}
