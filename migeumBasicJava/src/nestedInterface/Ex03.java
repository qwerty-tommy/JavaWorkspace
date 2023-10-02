package nestedInterface;

class A03{
	void method() {
		class D03{
			public D03() {
			}
			int field1;
			//static int field2;
			void method1() {
				System.out.println("여기는 로컬 클래스..");
			}
			//static void mehtod2()
		}
		D03 d=new D03();
		d.field1=3;
		d.method1();
	}
}

public class Ex03 {

	public static void main(String[] args) {
		A03 a=new A03();
		a.method();
	}

}
