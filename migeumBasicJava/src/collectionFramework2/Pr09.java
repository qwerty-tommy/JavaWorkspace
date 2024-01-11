package collectionFramework2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pr09 {
	public static void main(String[] args) {
		//Set<Integer> bingo = new HashSet<Integer>();
		Set<Integer> bingo = new LinkedHashSet<>();
		
		while (bingo.size() < 25)
			bingo.add((int) (Math.random() * 50));

		int i = 0;
		for (Integer integer : bingo) {
			if (i++ % 5 == 0)
				System.out.println();
			System.out.print(integer + " ");
		}
	}
}
