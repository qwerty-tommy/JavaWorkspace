package exceptionHandling;

public class Pr20_whenFinally {

	public static void main(String[] args) {
		Pr20_whenFinally.method1();
		System.out.println("mehtod1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}
	
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}
}
