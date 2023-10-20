
package nested;

class A5{
	B field1=new B();
	C field2=new C();
	
	void method1() {
		B var1=new B();
		C var2=new C();
		var1.plus(2,3);
	}
	
	//static B field3=new B();
	static C field4=new C();
	
	static void method2() {
		//B var1=new B();
		C var2=new C();
	}
	
	class B {
		int b1;
		int b2;
		void plus(int b1,int b2) {
			System.out.println(b1+"+"+b2+"="+(b1+b2));
		}
	}
	
	static class C{
		int c1;
		int c2;
		void plus(int c1, int c2) {
			System.out.println(c1+"+"+c2+"="+(c1+c2));
		}
	}	
}

public class Pr05_AB {

	public static void main(String[] args) {
		A5 a=new A5();
		
		a.field1.plus(1,2);
		a.field2.plus(10, 20);
		
		a.method1();
		A5.field4.plus(5, 6);
		
		A5.B b=a.new B();
		b.plus(100, 200);
		
		A5.C c=new A5.C();
		c.plus(1000, 2000);
		
	}

}
