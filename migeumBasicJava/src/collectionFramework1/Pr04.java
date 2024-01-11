package collectionFramework1;

import java.util.Iterator;
import java.util.LinkedList;

public class Pr04 {
	public static void main(String[] args) {
		LinkedList<Integer> intList = new LinkedList<>();

		intList.add(10);
		intList.add(20);
		intList.add(70);
		intList.add(90);
		intList.add(100);
		intList.add(40);

		Iterator<Integer> intIterator = intList.iterator();

		int sum = 0;
		while (intIterator.hasNext()) {
			int i = intIterator.next();
			System.out.print(i + "  ");
			sum += i;
		}

		System.out.println("\n합=" + sum);
	}
}
