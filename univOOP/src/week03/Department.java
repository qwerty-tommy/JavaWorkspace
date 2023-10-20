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
			System.out.print("(1) 전체 출력 (2) 팀 출력 ");
			System.out.print("(3) 검색 (4) 점수검색 ");
			System.out.print("(5) 팀 검색 (0) 종료 \n입력 : ");
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
			System.out.print("검색키워드 여러개(빈칸으로 구분):");
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
	
	//점수 관련 코드
	void searchScore() {
		String line = null;
		line = scan.nextLine();
		String kwdFrom;
		String kwdTo;
		while (true) {
			System.out.print("검색할 점수 구간 (빈칸으로 구분):");
			line = scan.nextLine();
			kwdFrom = line.trim().split(" ")[0];
			if (kwdFrom.equals("end"))
				break;
			kwdTo = line.trim().split(" ")[1];	//입력값이 end인 경우, 유효하지 않기 때문에 아래로 옮김
			for (Student st : studentList) {
				if (st.matchScore(kwdFrom, kwdTo))
					st.print();
			}
		}
	}

	void inputScores() {
		System.out.println("학생 점수 입력");
		for (Student st : studentList) {
			st.inputScore(scan);
		}
	}
	
	//팀 관련 코드
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
			System.out.print("검색할 팀의 키워드 : ");
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
	
	//팀클래스에서 입력받을 때 학생 객체에도 정보를 넘겨주기 위함
	Student findStudent(int studentNumber) {
		if (studentNumber <= 0 || studentNumber > studentList.size()) {
			return null;
		}
		return studentList.get(studentNumber - 1);
	}

}
