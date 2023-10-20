package _APIClass2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pr12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int playerNum;
		ArrayList<String> playerList = new ArrayList<>();

		System.out.println("겜블링 게임에 참여할 선수 숫자 >> ");
		playerNum = s.nextInt();

		for (int i = 0; i < playerNum; i++) {
			System.out.print(i + 1 + "번째 선수 이름 >> ");
			playerList.add(s.next());
		}

		int a, b, c;
		Boolean winFlag = false;

		while (true) {
			for (String string : playerList) {
				System.out.printf("[%s] : <Enter>\n", string);
				// 엔터입력?

				a = random.nextInt(4);
				b = random.nextInt(4);
				c = random.nextInt(4);
				winFlag = (a == b && b == c);

				System.out.printf("\t%d %d %d\t%s\n", a, b, c, winFlag ? string + "님이 이겼습니다!" : "아쉽군요");

				if (winFlag)
					break;
			}

			if (winFlag)
				break;
		}
	}
}
