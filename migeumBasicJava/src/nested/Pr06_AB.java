package nested;

class A6{
	int field1;
	
	void method1() {
		System.out.println("field1="+field1);
		System.out.println("field2="+field2);
	}
	
	static int field2;
	
	static void method2() {
		//System.out.println("field1="+field1);
		System.out.println("field2="+field2);
	}
	
	class B{
		void method() {
			field1=10;
			method1();
			
			field2=10;
			method2();
		}
	}
	
	static class C{
		void method() {
			//field1=10;
			//method1();
			
			field2=20;
			method2();		
		}
	}
}

public class Pr06_AB {
	public static void main(String[] args) {
		A6 a=new A6();
		A6.B b=a.new B();
		b.method();
		
		A6.C c=new A6.C();
		c.method();
	}
}
