package exceptionHandling;

public class Pr07_handlingArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;

		try {
			for (i = 0; i <= array.length; i++) {
				System.out.println(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 " + i + "는 사용할 수 없네요!");
		}

	}

}
