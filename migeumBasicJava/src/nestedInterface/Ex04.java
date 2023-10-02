package nestedInterface;

class A04 {
	A04() {
		System.out.println("A ��ü�� ������");
	}

	/** �ν��Ͻ� ��� Ŭ���� **/
	class B04 {
		public B04() {
			System.out.println("B ��ü�� ������");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2(){}
	}

	/** ���� ��� Ŭ���� **/
	static class C04 {
		C04() {
			System.out.println("C ��ü�� ������");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		/** ����Ŭ���� **/
		class D04 {
			public D04() {
				System.out.println("D ��ü�� ������");
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
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A04.B04 b=a.new B04();
		b.field1=3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A04.C04 c=new A04.C04();
		c.field1=3;
		c.method1();
		A04.C04.field2=3;
		A04.C04.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
