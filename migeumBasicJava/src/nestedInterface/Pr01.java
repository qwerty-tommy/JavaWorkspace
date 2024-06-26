package nestedInterface;

public class Pr01 {

	class InstanceInner01 {
		int iv = 100;
		//static int cv = 100;
		final static int CONST = 100;
	}

	static class StaticInner01 {
		int iv = 200;
		static int cv = 200;
	}

	void myMethod() {
		class LocalInner01 {
			int iv = 300;
			//static int cv = 300;
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner01.CONST);
		System.out.println(StaticInner01.cv);
	}

}
