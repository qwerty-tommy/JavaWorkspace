package nestedInterface;

class A04 {
	A04() {
		System.out.println("A 객체가 생성됨");
	}

	/** 인스턴스 멤버 클래스 **/
	class B04 {
		public B04() {
			System.out.println("B 객체가 생성됨");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2(){}
	}

	/** 정적 멤버 클래스 **/
	static class C04 {
		C04() {
			System.out.println("C 객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		/** 로컬클래스 **/
		class D04 {
			public D04() {
				System.out.println("D 객체가 생성됨");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2(){}
		}
		D04 d = new D04();
		d.field1 = 3;
		d.method1();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		A04 a=new A04();
		
		//인스턴스 멤버 클래스 객체 생성
		A04.B04 b=a.new B04();
		b.field1=3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A04.C04 c=new A04.C04();
		c.field1=3;
		c.method1();
		A04.C04.field2=3;
		A04.C04.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
