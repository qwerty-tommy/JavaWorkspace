package exceptionHandling;

public class Ex02_findErrorEdit {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		int n;

		for (int i = 0; i < 100; i++) {
			n = (int) (Math.random() * 10);
			System.out.println(n + ":");
			try {
				result = number / n;
			} catch (ArithmeticException e) {
				System.out.println("noooooooooooooooooooooooooooooooooooo");
			}
			System.out.println(result);
		}

	}

}
