package nested;

class A3{
	void method() {
		class D{
			public D() {
			}
			int field1;
			//static int field2;
			void method1() {
				System.out.println("여기는 로컬클래스...");
			}
			//static void method2(){};		
		}
		D d =new D();
		d.field1=3;
		d.method1();
	}
}

public class Pr03_AB {

	public static void main(String[] args) {
		A3 a=new A3();
		a.method();
	}

}
