package exceptionHandling;

public class Pr20_whenFinally {

	public static void main(String[] args) {
		Pr20_whenFinally.method1();
		System.out.println("mehtod1()의 수행을 마치고 main메서드로 돌아왔습니다.");
	}
	
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}
}
