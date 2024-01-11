package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Pr11 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Consumer<Integer> printIterator = (i) -> System.out.print(i + " ");

		for (Integer integer : list)
			printIterator.accept(integer);
	}
}
