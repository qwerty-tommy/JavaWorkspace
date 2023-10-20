package nested;

class Outer {
	public void method2(int arg) {
		int localVariable = 1;
		// arg=100;
		// localVariable=100;

		class Inner {
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
				result++;
				System.out.println(result);
			}
		}

		Inner in = new Inner();
		in.method();
	}
}

public class Pr07_Outer {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.method2(100);
	}

}
