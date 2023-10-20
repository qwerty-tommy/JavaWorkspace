package exceptionHandling;

public class Pr15_exceptionInfoInMethod {

	public static void main(String[] args) throws Exception {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("handling in main");
			e.printStackTrace();
		}

	}

	static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("handling in method1");
			e.printStackTrace();
		}
	}

	static void method2() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("handling in method2");
			e.printStackTrace();
		}
	}

}
