package lambda;

@FunctionalInterface
interface Lambda {
	int in2out1(int a, int b);
}

public class Pr07 {
	public static void main(String[] args) {
		int scores[] = { 60, 80, 40, 60, 30 };
		Lambda filter = (a, b) -> a > b ? a : b;
		int max = scores[0];

		for (int i : scores) {
			max = filter.in2out1(max, i);
		}
		
		System.out.println("max : "+max);
	}
}
