package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Pr15 {
	public static List<Student> students = Arrays.asList(new Student("aaa", 100, 90, 80),
			new Student("bbb", 100, 70, 60), new Student("ccc", 80, 50, 40));

	public static int avg(ToIntFunction<Student> f) {
		return 0;
	}

	public static void main(String[] args) {
		ToIntFunction<Student> scoreFunction;

		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;

		scoreFunction = s -> s.scores[0];
		for (Student student : students) {
			korSum += scoreFunction.applyAsInt(student);
		}
		scoreFunction = s -> s.scores[1];
		for (Student student : students) {
			engSum += scoreFunction.applyAsInt(student);
		}
		scoreFunction = s -> s.scores[2];
		for (Student student : students) {
			mathSum += scoreFunction.applyAsInt(student);
		}

		System.out.println("국어 총점 : " + korSum);
		System.out.println("영어 총점 : " + engSum);
		System.out.println("수학 총점 : " + mathSum);
	}

}
