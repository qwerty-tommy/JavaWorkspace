package nestedInterface;

class A06 {
	int field1;

	void method1() {
		System.out.println("field1=" + field1);
		System.out.println("field2=" + field2);
	}

	static int field2;

	static void method2() {
		// System.out.println("field1="+fiedld1);
		System.out.println("field2=" + field2);
	}

	class B06 {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	static class C06 {
		void method() {
			// field1=10;
			// method1();

			field2 = 20;
			method2();
		}
	}
}

public class Ex06 {
	public static void main(String[] args) {
		A06 a = new A06();
		A06.B06 b = a.new B06();
		b.method();

		A06.C06 c = new A06.C06();
		c.method();
	}
}
