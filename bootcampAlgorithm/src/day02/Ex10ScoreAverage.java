package day02;

public class Ex10ScoreAverage {
	public static void main(String[] args) {
		double[][] score = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
				{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
				{ 3.7, 4.0 }, // 3학년 1, 2학기 평점
				{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점

		Double sum = 0.0;
		for (double[] ds : score) {
			for (double d : ds) {
				sum += d;
			}
		}

		System.out.println("avg = " + (sum / 8));
	}
}
