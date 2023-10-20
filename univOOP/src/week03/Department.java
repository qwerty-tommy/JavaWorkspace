package week03;

import java.util.ArrayList;
import java.util.Scanner;

class Department {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<>();
	ArrayList<Team> teamList = new ArrayList<>();

	void run() {
		int menu;
		readAllStudents();
		readTeams();
		inputScores();
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
				printTeams();
				break;
			case 3:
				search();
				break;
			case 4:
				searchScore();
				break;
			case 5:
				searchTeams();
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
			st.read(scan, idInput);
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
	
	//���� ���� �ڵ�
	void searchScore() {
		String line = null;
		line = scan.nextLine();
		String kwdFrom;
		String kwdTo;
		while (true) {
			System.out.print("�˻��� ���� ���� (��ĭ���� ����):");
			line = scan.nextLine();
			kwdFrom = line.trim().split(" ")[0];
			if (kwdFrom.equals("end"))
				break;
			kwdTo = line.trim().split(" ")[1];	//�Է°��� end�� ���, ��ȿ���� �ʱ� ������ �Ʒ��� �ű�
			for (Student st : studentList) {
				if (st.matchScore(kwdFrom, kwdTo))
					st.print();
			}
		}
	}

	void inputScores() {
		System.out.println("�л� ���� �Է�");
		for (Student st : studentList) {
			st.inputScore(scan);
		}
	}
	
	//�� ���� �ڵ�
	void readTeams() {
		String name;
		Team t;
		while (true) {
			name = scan.next();
			if (name.contentEquals("end"))
				break;
			t = new Team(name);
			t.read(scan, this);
			teamList.add(t);
		}
	}

	void printTeams() {
		for (Team team : teamList)
			team.print();
	}

	void searchTeams() {
		String kwd;
		scan.nextLine();
		while (true) {
			System.out.print("�˻��� ���� Ű���� : ");
			kwd = scan.nextLine();
			kwd = kwd.trim();
			if (kwd.equals("end"))
				break;
			for (Team team : teamList) {
				if (team.matches(kwd))
					team.print();
			}
		}
	}
	
	//��Ŭ�������� �Է¹��� �� �л� ��ü���� ������ �Ѱ��ֱ� ����
	Student findStudent(int studentNumber) {
		if (studentNumber <= 0 || studentNumber > studentList.size()) {
			return null;
		}
		return studentList.get(studentNumber - 1);
	}

}
