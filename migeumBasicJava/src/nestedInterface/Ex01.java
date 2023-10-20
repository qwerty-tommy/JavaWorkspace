package nestedInterface;

class A01 {
	class B01 {
		public B01() {}

		int field1;

		// static int field2;
		void method1() {
			System.out.println("여기는 내부 클래스..");
		}
		// static void method2(){}

	}
}

public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		A01.B01 b = a.new B01();
		b.field1 = 3;
		b.method1();
	}
}
