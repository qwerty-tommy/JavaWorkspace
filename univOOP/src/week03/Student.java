package week03;

import java.util.Scanner;
import java.util.Random;

class Student {
	private int id;
	String name;
	private String phone;
	private int year;
	private int score;
	private Team myTeam; // 인당 팀은 무조건 1개 이하

	public Student() {
	}

	void setMyTeam(Team myTeam) {
		this.myTeam = myTeam;
	}

	void read(Scanner scan, int idInput) {
		id = idInput;
		name = scan.next();
		phone = scan.next();
		year = scan.nextInt();
		score = -1;
		myTeam = null;
	}

	void print() {
		System.out.print(
				id + " " + name + " " + phone + " " + year + "학년 " + ((score == -1) ? "NaN" : String.valueOf(score)));

		if (myTeam != null) {
			System.out.printf("\t[%s]", myTeam.name);
		}
		System.out.println();
	}

	boolean matches(String kwd) {
		// return name.equals(kwd) || Integer.toString(id).equals(kwd);
		if (kwd.contains(name))
			return true;
		if (kwd.length() >= 4 && phone.contains(kwd))
			return true;
		if (kwd.contentEquals("" + year))
			return true;
		return kwd.length() > 4 && kwd.contains("" + id);
	}

	boolean matches(String[] kwds) {
		for (String kwd : kwds) {
			if (kwd.charAt(0) == '-' && matches(kwd.substring(1)))
				return false;

			else if (!matches(kwd))
				return false;
		}
		return true;
	}

	void inputScore(Scanner scan) {
		Random rand = new Random();
		// System.out.printf("%s:", name);
		// score = scan.nextInt();
		// 원래는 점수를 입력받아야하지만 편의를 위해 램덤한 값으로 대신함
		score = rand.nextInt(100) + 1;
		System.out.printf("%s: %d점\n", name, score);

	}

	boolean matchScore(String kwdFrom, String kwdTo) {
		int from;
		int to;

		if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = 0;
			to = 100;
		} else if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = Integer.parseInt(kwdFrom);
			to = 100;
		} else if (kwdFrom.contentEquals("-") && kwdTo.contentEquals("-")) {
			from = 0;
			to = Integer.parseInt(kwdTo);
		} else {
			from = Integer.parseInt(kwdFrom);
			to = Integer.parseInt(kwdTo);
		}

		return score >= from && score <= to;
	}
}
