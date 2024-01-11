package collectionFramework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student {
	String name;
	String major;
	int id;
	int kor;
	int eng;
	int math;

	public Student(String name, String major, int id, int kor, int eng, int math) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	boolean isPass() {
		return kor + eng + math > 180;
	}

	@Override
	public String toString() {
		return name + " " + major + " " + id + " " + kor + " " + eng + " " + math + " " + major;
	}
}

public class Pr07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		String major;
		int id;
		int kor;
		int eng;
		int math;
		HashMap<String, Student> studentMap = new HashMap<>();
		HashSet<String> studentSet = new HashSet<>();

		while (true) {
			System.out.print("1.입력 2.리스트 3.pass명단 4.nopass 5.종료 =>");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("이름 : ");
				name = scanner.next();
				System.out.print("학과 : ");
				major = scanner.next();
				System.out.print("학번 : ");
				id = scanner.nextInt();
				System.out.print("국어 : ");
				kor = scanner.nextInt();
				System.out.print("영어 : ");
				eng = scanner.nextInt();
				System.out.print("수학 : ");
				math = scanner.nextInt();

				studentMap.put(name, new Student(name, major, id, kor, eng, math));
				studentSet.add(major);

				break;

			case 2:
				System.out.println(studentMap);
				break;

			case 3:
				for (Map.Entry<String, Student> studEntry : studentMap.entrySet()) {
					Student student = ((Student) studEntry.getValue());
					if (student.isPass())
						System.out.println(student);
				}
				break;

			case 4:
				int cnt;
				for (String majorElemnt : studentSet) {
					cnt = 0;
					for (Map.Entry<String, Student> studEntry : studentMap.entrySet()) {
						Student student = ((Student) studEntry.getValue());
						if (!student.isPass() && student.major.equals(majorElemnt))
							cnt++;
					}
					System.out.println(majorElemnt + " : " + cnt);
				}

				break;

			case 5:
				scanner.close();
				return;

			default:
				break;
			}
		}
	}
}
/*
 * 1 홍길동 컴퓨터정보 2001 90 92 95 1 강감찬 정보통신 2002 88 75 80 1 유관순 전기전자 2004 100 40 30
 */
