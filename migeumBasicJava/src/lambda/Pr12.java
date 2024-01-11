package lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Pr12 {
	public static void main(String[] args) {
		Supplier<Integer> RandSupplier = () -> (int) (Math.random() * 100);
		Consumer<Integer> printConsumer = (i) -> System.out.print(i + " ");

		for (int j = 0; j < 10; j++)
			printConsumer.accept(RandSupplier.get());
	}
}
