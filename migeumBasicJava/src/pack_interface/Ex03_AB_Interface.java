package pack_interface;

interface Method{
	void methodB();
}

class A3{
	public void methodA() {
		Method m=new B3();
		m.methodB();
	}
}

class B3 implements Method{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class Ex03_AB_Interface {
	public static void main(String[] args) {
		A3 a =new A3();
		a.methodA();
	}
}
