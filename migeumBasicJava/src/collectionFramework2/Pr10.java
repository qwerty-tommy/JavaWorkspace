package collectionFramework2;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pr10 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

		set.add(87);
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);

		System.out.print("가장 낮은 점수 : ");
		System.out.println(set.first());

		System.out.print("가장 높은 점수 : ");
		System.out.println(set.last());

		System.out.print("95점 아래 점수 : ");
		System.out.println(set.lower(95));

		System.out.print("95점 위의 점수 : ");
		System.out.println(set.higher(95));

		System.out.print("95점이거나 바로 아래 점수 : ");
		System.out.println(set.floor(95));

		System.out.print("85점이거나 바로 위의 점수 : ");
		System.out.println(set.ceiling(85));

		// set = (TreeSet<Integer>) set.descendingSet();

		while (!set.isEmpty()) {
			System.out.println(set.first() + "(남은 객체의 수 : " + set.size() + ")");
			set.remove(set.first());
		}

	}
}
