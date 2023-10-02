package nested;

class A{
	class B{
		public B() {}
		int field1;
		//static int field2=1;
		void method1() {
			System.out.println("여기는 내부 클래스..");
		}
		//static void method2() {}
	}
}

public class Pr01_AB {
	public static void main(String[] args) {
		A a=new A();
		A.B b = a.new B();
		b.field1=3;
		b.method1();
	}
}
