package exception;

class Pr02 {

	public static void main(String[] args) {
		int num = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": ");
			try {
				result = num / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0ÀÌ ¹ß»ý~");
				i--;
			}
		}

	}

}
