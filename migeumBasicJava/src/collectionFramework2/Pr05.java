package collectionFramework2;

import java.util.HashSet;
import java.util.Set;

public class Pr05 {
	public static void main(String[] args) {
		String[] sample = { "단어", "중복", "구절", "중복" };
		Set<String> set = new HashSet<String>();
		int cnt = 0;

		System.out.print("중복된 단어 : ");

		for (String string : sample) {
			cnt++;
			set.add(string);
			if (cnt > set.size()) {
				System.out.print(string);
				cnt--;
			}
		}
		
		System.out.println();
		System.out.println(set);
	}
}
