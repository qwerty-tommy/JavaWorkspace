package exceptionHandling;

public class XPr10_catchBlock {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (Exception e) { // catch문 자동 주석 삭제 설정
			System.out.println("Execption");
		}
		System.out.println(6);

	}

}
