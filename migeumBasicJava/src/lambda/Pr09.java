package lambda;

public class Pr09 {
	public static void main(String[] args) {
		Student[] students = { new Student("홍길동", 90, 96, 98), new Student("유관순", 95, 93, 80),
				new Student("이순신", 100, 80, 90) };

		Lambda summation = (a, b) -> a + b;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;

		for (Student student : students) {
			korSum = summation.in2out1(student.scores[0], korSum);
			engSum = summation.in2out1(student.scores[1], engSum);
			mathSum = summation.in2out1(student.scores[2], mathSum);
		}

		System.out.println("korSum : " + korSum + "\nengSum : " + engSum + "\nmathSum : " + mathSum);
	}
}
