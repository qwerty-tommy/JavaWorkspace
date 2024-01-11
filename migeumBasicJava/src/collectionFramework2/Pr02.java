package collectionFramework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Student02Comparator implements Comparator<Student02> {
//
//	@Override
//	public int compare(Student02 o1, Student02 o2) {
//		return o1.sum - o2.sum;
//	}
//
//}

class Student02 {
	int id;
	String name;
	int kor;
	int eng;
	int sum;
	int rank;

	static int ai = 1;

	public Student02(String name, int kor, int eng) {
		this.id = ai++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.sum = kor + eng;
		this.rank = 1;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + kor + " " + eng + " " + rank;
	}
}

public class Pr02 {
	public static void main(String[] args) {
		String name[] = { "sally", "prodo", "mary", "brown", "mono" };
		int kor[] = { 100, 70, 50, 80, 60 };
		int eng[] = { 90, 60, 80, 40, 80 };

		ArrayList<Student02> student02 = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			student02.add(new Student02(name[i], kor[i], eng[i]));
		}

		System.out.println("=== 입력자료");
		for (Student02 student : student02) {
			System.out.println(student);
		}

		Collections.sort(student02, new Comparator<Student02>() {
			@Override
			public int compare(Student02 o1, Student02 o2) {
				int result = o2.sum - o1.sum;
				if (result < 0)
					o2.rank++;
				else if (result > 0)
					o1.rank++;
				else {
					o1.rank++;
					o2.rank++;
				}
				return result;
			}
		});

		System.out.println("=== 정렬 후");
		for (Student02 student : student02) {
			System.out.println(student);
		}
	}
}
