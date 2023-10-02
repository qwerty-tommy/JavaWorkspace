package exception;

import java.util.Scanner;

class Pr06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list;
		int[] list2 = new int[5];
		int sum = 0, count;
		String str;

		System.out.println("정수의 개수");
		count = sc.nextInt();

		try {
			list = new int[count];

			for (int i = 0; i < count; i++) {
				System.out.println("정수를 입력세요 : ");
				list2[i] = list[i] = sc.nextInt();
			}
			for (int i = 0; i < count; i++) {
				sum += list[i];
			}
			//System.out.println(str);

			System.out.println("평균 : " + sum / count);
			sc.close();
		} catch (NegativeArraySizeException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
