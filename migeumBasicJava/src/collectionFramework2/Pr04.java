package collectionFramework2;

import java.util.Scanner;

public class Pr04 {
	static boolean isOpenBracket(String ch) {
		return ch == "(" || ch == "{" || ch == "[";
	}

	static boolean isCloseBracket(String ch) {
		return ch == ")" || ch == "}" || ch == "]";
	}

	static void bracketChecker(String str) {
		LinkedListStack stack = new LinkedListStack();

		String[] strings = str.split("");
		for (String ch : strings) {
			if (isOpenBracket(ch)) {
				stack.push(ch);
			} else if (isOpenBracket(ch)) {
				if (stack.isEmpty()) {
					System.out.println("괄호가 일치합니다.");
				}
				stack.pop();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("식 입력 : ");
			String str = scanner.nextLine();

			bracketChecker(str);
		}
	}
}
