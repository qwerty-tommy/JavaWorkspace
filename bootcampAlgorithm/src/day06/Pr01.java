package day06;

import java.util.HashMap;
import java.util.Map;

public class Pr01 {
	static String data = "It's not or never, come hold me tight\r\n" + "Kiss me my darling, be mine tonight\r\n"
			+ "Tomorrow will be too late\r\n" + "It's now or never, my love won't wait\r\n"
			+ "When I first saw you, with your smile so tender\r\n"
			+ "My heart was captured, my soul surrendered I spent a lifetime, waiting for the right time\r\n"
			+ "Now that your near, the time is here, at last\r\n"
			+ "It's now or never, come hold me tight Kiss me my darling, be mine tonight\r\n"
			+ "Tomorrow will be too late\r\n" + "It's now or never, my love won't wait.";

	public static void main(String[] args) {
		Map<Character, Integer> alphaMap = new HashMap<>();
		Character[] alphaArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < data.length(); i++) {
			char upperData = data.toUpperCase().charAt(i);
			alphaMap.put(upperData, alphaMap.getOrDefault(upperData, 0) + 1);
		}

		for (Character chr : alphaArray) {
			System.out.print(chr);
			for (int j = 0; j < alphaMap.getOrDefault(chr, 0); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
