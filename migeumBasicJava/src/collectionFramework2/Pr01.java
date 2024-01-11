package collectionFramework2;

import java.util.Arrays;

class Student01 implements Comparable<Student01> {
	int id;
	String name;

	public Student01(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student01 o) {
		return id - o.id;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class Pr01 {
	public static void main(String[] args) {
		Student01 array[] = { new Student01(20090001, "김철수"), new Student01(20090005, "이철수"),
				new Student01(20090002, "박철수"), new Student01(20090004, "남철수"), new Student01(20090003, "이철수"), };

		System.out.print("원본 :");
		for (Student01 student01 : array) {
			System.out.print(student01+", ");
		}

		Arrays.sort(array);
		System.out.print("\n정렬 후 :");

		for (Student01 student01 : array) {
			System.out.print(student01+", ");
		}
	}
}
