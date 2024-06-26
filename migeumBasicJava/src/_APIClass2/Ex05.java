package _APIClass2;

import java.util.Comparator;
import java.util.Objects;

public class Ex05 {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s3, s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s2, s2, new StudentComparator());
		System.out.println(result);
	}

	static class Student {
		int sno;

		public Student(int sno) {
			this.sno = sno;
		}
	}

	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return Integer.compare(o1.sno, o2.sno);
		}

	}
}