package exceptionHandling;

public class Pr21_handlingBothMainAndMethod {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}

	static void method1() throws Exception	{
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}
}
