package lambda;

class Student {
	String name;
	int scores[] = new int[3];

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = math;
	}

	int sum() {
		int sum = 0;
		Lambda accumulator = (a, b) -> a + b;

		for (int s : scores) {
			sum = accumulator.in2out1(s, sum);
		}
		
		return sum;
	}
}

public class Pr08 {
	public static void main(String[] args) {
		Student[] students = { new Student("홍길동", 90, 96, 98), new Student("유관순", 95, 93, 80),
				new Student("이순신", 100, 80, 90) };

		for (Student student : students) {
			System.out.println(student.name+"'s scoresum : "+student.sum());
		}
	}
}
