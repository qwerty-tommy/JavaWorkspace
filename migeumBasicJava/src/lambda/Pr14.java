package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Pr14 {
	public static void main(String[] args) {
		Supplier<Integer> RandSupplier = () -> (int) (Math.random() * 100);
		Consumer<Integer> printConsumer = (i) -> System.out.print(i + " ");
		Function<Integer, Integer> modifyFunction = (i) -> ((int) i / 10) * 10;

		ArrayList<Integer> randNumList = new ArrayList<>();
		ArrayList<Integer> modifiedNumList = new ArrayList<>();
		
		System.out.println("=== 10 rand list");
		for (int j = 0; j < 10; j++) {
			int tmp = RandSupplier.get();
			randNumList.add(tmp);
			printConsumer.accept(tmp);
		}
		
		System.out.println("\n=== 10 rand list modified");
		for (Integer randNum : randNumList) {
			int tmp = modifyFunction.apply(randNum);
			modifiedNumList.add(tmp);
			printConsumer.accept(tmp);
		}
	}
}
