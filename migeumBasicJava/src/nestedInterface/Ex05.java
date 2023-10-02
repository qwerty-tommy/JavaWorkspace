package nestedInterface;

class A05 {
	// �ν��Ͻ� �ʵ�
	B05 field1 = new B05();
	C05 field2 = new C05();

	// �ν��Ͻ� �޼�
	void method1() {
		B05 var1 = new B05();
		C05 var2 = new C05();
		var1.plus(2, 3);
	}

	// ���� �ʵ� �ʱ�ȭ
	// static B field3=new B();
	static C05 field4 = new C05();

	// ���� �޼ҵ�
	static void method2() {
		// B var1=new B();
		C05 var2 = new C05();
	}

	// �ν��Ͻ� ��� Ŭ����
	class B05 {
		int b1;
		int b2;

		void plus(int b1, int b2) {
			System.out.println(b1 + "+" + b2 + "=" + (b1 + b2));
		}
	}

	// ���� ��� Ŭ����
	static class C05 {
		int c1;
		int c2;

		void plus(int c1, int c2) {
			System.out.println(c1 + "+" + c2 + "=" + (c1 + c2));
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		A05 a = new A05();

		a.field1.plus(1, 2);
		a.field2.plus(10, 20);

		a.method1();
		A05.field4.plus(5, 6);

		A05.B05 b = a.new B05();
		b.plus(100, 200);

		A05.C05 c = new A05.C05();
		c.plus(1000, 2000);
	}

}
