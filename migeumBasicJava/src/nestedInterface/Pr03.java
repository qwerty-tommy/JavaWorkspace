package nestedInterface;

class Outer {
	class InstanceInner03 {
		int iv = 100;
	}

	static class StaticInner03 {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
}

public class Pr03 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner03 ii = oc.new InstanceInner03();

		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.c : " + Outer.StaticInner03.cv);

		Outer.StaticInner03 si = new Outer.StaticInner03();
		System.out.println("si.iv : " + si.iv);
	}
}
