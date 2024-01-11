package day07;

import java.util.HashMap;
import java.util.Scanner;

public class Pr03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> students = new HashMap<String, Double>();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = scanner.next();
			double grade = scanner.nextDouble();
			students.put(name, grade);
		}

		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double scholarshipCriteria = scanner.nextDouble();

		System.out.print("장학생 명단 : ");
		for (String key : students.keySet()) {
			if (students.get(key) >= scholarshipCriteria) {
				System.out.print(key + " ");
			}
		}
		scanner.close();
	}
}
