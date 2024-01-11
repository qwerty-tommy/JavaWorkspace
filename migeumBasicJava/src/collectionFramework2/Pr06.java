package collectionFramework2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Pr06 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자묶음 개수 : ");
		int deckNum = scanner.nextInt();

		System.out.print("카드 묶음의 크기 : ");

		for (int i = 0; i < deckNum; i++) {
			queue.add(scanner.nextInt());
		}

		int a = queue.poll();
		int sum = 0;
		while (!queue.isEmpty()) {
			a += queue.poll();
			sum += a;
			System.out.println(sum);
		}
		System.out.println("최소 비교 횟수 : " + sum);

		scanner.close();
	}
}
