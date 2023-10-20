package exceptionHandling;

public class Pr21_handlingBothMainAndMethod {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}

	static void method1() throws Exception	{
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}
}
