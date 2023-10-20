package week04;

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
			System.out.print("(1) ��ü ��� (2) �� ��� ");
			System.out.print("(3) �˻� (4) �����˻� ");
			System.out.print("(5) �� �˻� (0) ���� \n�Է� : ");
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
		Student st = null;
		int idInput;
		while (true) {
			idInput = scan.nextInt();
			if (idInput == 0)
				break;
			st = new Student();
			st.read(scan, idInput, this);
			studentList.add(st);
		}
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
			System.out.print("�˻�Ű���� ������(��ĭ���� ����):");
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

	// �� ���� �ڵ�
	void readAllLectures() {
		Lecture t;
		String name;
		while (true) {
			name = scan.next();
			if (name.contentEquals("end"))
				break;
			t = new Lecture(name);
			t.read(scan);
			lecturelist.add(t);
		}
	}

	void printAllLectures() {
		for (Lecture team : lecturelist)
			team.print();
	}

//	// ��Ŭ�������� �Է¹��� �� �л� ��ü���� ������ �Ѱ��ֱ� ����
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
