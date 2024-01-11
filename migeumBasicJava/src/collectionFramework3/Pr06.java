package collectionFramework3;

import java.util.HashMap;
import java.util.Scanner;

public class Pr06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kor;
		String eng;
		HashMap<String, String> dictionaryMap = new HashMap<>();

		while (true) {
			System.out.print(
					"1. 사전에 단어추가\r\n" + "2. 사전의 단어삭제\r\n" + "3. 사전의 단어검색\r\n" + "4. 사전의 단어리스트\r\n" + "5. 종료\r\n");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("영어이름입력 : ");
				kor = scanner.next();
				System.out.print("한글이름입력 : ");
				eng = scanner.next();
				dictionaryMap.put(kor, eng);
				System.out.println("입력완료");
				break;

			case 2:
				System.out.print("이름 : ");
				dictionaryMap.remove(scanner.next());
				break;

			case 3:
				System.out.print("이름 : ");
				System.out.print(dictionaryMap.get(scanner.next()));
				break;

			case 4:
				System.out.println(dictionaryMap);
				break;

			case 5:
				scanner.close();
				return;

			default:
				break;
			}
		}
	}
}
