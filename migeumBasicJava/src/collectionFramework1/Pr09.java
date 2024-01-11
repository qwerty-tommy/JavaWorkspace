package collectionFramework1;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int id;
	String name;
	int kor;
	int eng;
	int sum;
	int rank;

	public Student(int id, String name, int kor, int eng) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		sum = kor + eng;
		rank = 1;
	}

	@Override
	public int compareTo(Student o) {
		return o.sum - sum;
	}

	@Override
	public String toString() {
		return "" + id + "\t" + name + "\t" + kor + "\t" + eng + "\t" + rank;
	}
}

public class Pr09 {
	public static void main(String[] args) {
		String name[] = { "sally", "Prodo", "mary", "brown", "mono" };
		int kor[] = { 100, 70, 50, 80, 60 };
		int eng[] = { 90, 60, 80, 40, 80 };

		ArrayList<Student> students = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			students.add(new Student(i + 1, name[i], kor[i], eng[i]));
		}
		
		for (Student student : students) {
			for (Student student2 : students) {
				if (student.sum < student2.sum)
					student.rank++;
			}
		}

		System.out.println("=== 입력자료");
		for (Student student : students) {
			System.out.println(student);
		}

		Collections.sort(students);

		System.out.println("=== 입력자료");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
