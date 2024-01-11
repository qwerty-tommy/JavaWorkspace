package day02;

import java.util.Scanner;

public class Ex06BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;

		System.out.println("exit을 입력하면 종료합니다.");

		while (true) {
			str = scanner.nextLine();
			System.out.print(">>");
			if(str.equals("exit")) 
				break;
			
		}

		System.out.println("종료합니다...");
		scanner.close();
	}
}
