package lambda;

import java.util.ArrayList;

public class Pr06 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(36);
		list.add(73);
		list.add(56);
		list.add(70);
		list.add(29);

		System.out.println("=== All element in list");
		list.forEach(x -> System.out.print(x+", "));
		System.out.println();
		
		list.replaceAll(x -> x / 10 * 10);
		System.out.println("=== All round element in list");
		list.forEach(x -> System.out.print(x+", "));
	}
}
