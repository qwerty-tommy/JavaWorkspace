package nestedInterface;

import java.util.Scanner;

import nestedInterface.Student.Grade;

class Student {
	Scanner scanner = new Scanner(System.in);
	String name;

	public Student(String name) {
		this.name = name;
	}

	class ID {
		String id;
		String sex;
		String birthtime;
		int age;
		String birthplace;

		public ID() {

			while (true) {
				System.out.println("ID : ");

				this.id = scanner.nextLine();
				if (isCodeValid())
					break;
			}

			this.sex = "m";
			this.birthtime = "1911년 11월 11일";
			this.age = 106;
			this.birthplace = "경기";
		}

		Boolean isSexValid() {
			if (sex == "m" && (id.charAt(6) == '1' || id.charAt(6) == '3')
					|| sex == "f" && (id.charAt(6) == '2' || id.charAt(6) == '4'))
				return true;

			return false;
		}

		Boolean isPlacecodeValid() {
			switch (id.substring(8, 9)) {
			case "00":
			case "01":
			case "02":
			case "03":
			case "04":
			case "05":
			case "06":
			case "07":
			case "08":
				if (birthplace.substring(0, 1) == "서울")
					return true;
				break;

			case "09":
			case "10":
			case "11":
			case "12":
				if (birthplace.substring(0, 1) == "부산")
					return true;
				break;

			case "13":
			case "14":
			case "15":
				if (birthplace.substring(0, 1) == "인천")
					return true;
				break;

			case "16":
			case "17":
			case "18":
			case "19":
			case "20":
			case "21":
			case "22":
			case "23":
			case "24":
			case "25":
				if (birthplace.substring(0, 1) == "경기")
					return true;
				break;

			case "26":
			case "27":
			case "28":
			case "29":
			case "30":
			case "31":
			case "32":
			case "33":
			case "34":
				if (birthplace.substring(0, 1) == "강원")
					return true;
				break;

			default:
				return false;
			}
			return false;
		}

		Boolean isBirthtimeValid() {
			if (birthtime.substring(2, 3) == id.substring(0, 1) && birthtime.substring(6, 7) == id.substring(2, 3)
					&& birthtime.substring(10, 11) == id.substring(4, 5))
				return true;

			return false;
		}

		Boolean isCodeValid() {
			int alu = 0;

			for (int i = 0; i < 13; i++) {
				if (i == 6)
					continue;
				alu += (id.charAt(i) - '0');
			}

			return 11 - alu % 11 == id.charAt(13)-'0';
		}

		Boolean isValid() {
//			// 성별 체크
//			if (!isSexValid())
//				return false;
//
//			// 출생지 체크
//			if (!isPlacecodeValid())
//				return false;
//
//			// 생년월일 체크
//			if (!isBirthtimeValid())
//				return false;

			// 검증로직 체크
			if (!isCodeValid())
				return false;

			return true;
		}
	}

	class Grade {
		int kor;
		int eng;
		int math;

		public Grade() {
			System.out.println("kor : ");
			this.kor = scanner.nextInt();

			System.out.println("eng : ");
			this.eng = scanner.nextInt();

			System.out.println("math : ");
			this.math = scanner.nextInt();
		}

	}

}

public class Pr09 {

	public static void main(String[] args) {
		Student student = new Student("최정원");
		Student.ID id = student.new ID();
		Student.Grade grade = student.new Grade();

		System.out.println(student);
		System.out.println(id.age+ id.birthplace+ id.birthtime+ id.id);
		System.out.println(grade.kor+ grade.eng+ grade.math);
	}

}
