package nestedInterface;

class A02 {
	static class C02 {
		public C02() {}

		int field1;
		static int field2;

		void method1() {
			System.out.println("정적내부 클래스...");
		}

		static void method2() {}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A02.C02 c = new A02.C02();
		c.field1 = 3;
		c.method1();
		A02.C02.field2 = 3;
		A02.C02.method2();
	}
}
