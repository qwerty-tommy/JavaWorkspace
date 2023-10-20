package nested;

class A2{
	static class C{
		public C() {
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("정적 내부 클래스...");
		}
		static void method2() {
		}
	}
}

public class Pr02_AB {

	public static void main(String[] args) {
		A2.C c=new A2.C();
		c.field1=3;
		c.method1();
		A2.C.field2=3;
		A2.C.method2();
	}

}
