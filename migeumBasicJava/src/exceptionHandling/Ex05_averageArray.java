package exceptionHandling;

import java.util.Scanner;

public class Ex05_averageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list=null;
		int sum = 0, count;

		try {
			System.out.print("정수의 개수 : ");
			count = sc.nextInt();
			//list = new int[count];

			for (int i = 0; i < count; i++) {
				System.out.print("정수를 입력하세요 : ");
				list[i] = sc.nextInt();
			}

			for (int i = 0; i < count; i++) {
				sum += list[i];
			}
			System.out.println("평균 : " + sum / count);
			
			sc.close();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 오류");
		} catch (NegativeArraySizeException e) {
			System.out.println("음수 배열 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 오류");
		} catch (NullPointerException e) {
			System.out.println("null 참조 오류");
		}
			
	}

}
