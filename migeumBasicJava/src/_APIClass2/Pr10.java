package _APIClass2;

import java.util.Scanner;

public class Pr10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("문자열 입력하세요.");
		String string = s.nextLine();

		StringBuffer sb = new StringBuffer(string);

		for (int i = 0; i < string.length(); i++) {
			System.out.print(sb.substring(i + 1, string.length()));
			System.out.println(sb.substring(0, i));
		}
	}
}
