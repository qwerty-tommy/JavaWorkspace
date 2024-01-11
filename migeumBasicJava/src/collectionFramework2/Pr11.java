package collectionFramework2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pr11 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		Set<String> subset;

		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			subset = treeSet.subSet(scanner.next(), scanner.next());

			for (String string : subset) {
				System.out.println(string);
			}
		}
	}
}
