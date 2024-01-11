package playGround;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

class StudentComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student a, Student b) {
		return a.getScore()-b.getScore();
	}
}

public class Sandbox {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 70));
		students.add(new Student("Charlie", 95));
		
		// 학생 객체를 점수에 따라 정렬
		Collections.sort(students,new StudentComparator());

		for (Student student : students) {
			System.out.println(student.getName() + ": " + student.getScore());
		}
	}

}
