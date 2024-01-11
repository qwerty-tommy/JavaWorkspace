package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Pr16 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(60, 70, 80, 100, 80, 65, 79, 95, 86);
		Predicate<Integer> over80Predicate = (i) -> i >= 80;
		int sum = 0;

		for (Integer element : list) {
			if (over80Predicate.test(element))
				sum += element;
		}
		System.out.println("sum(only over 80) : " + sum);
	}
}
