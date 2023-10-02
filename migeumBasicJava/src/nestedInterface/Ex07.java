package nestedInterface;

class Outter07 {
	public void method2(int arg) {
		int localVariable = 1;
		// arg==100;
		// localVariable=100;

		class inner07 {
			public void method() {
				int result = arg + localVariable;
				System.out.println(result);
				result++;
				System.out.println(result);
			}
		}

		inner07 in = new inner07();
		in.method();
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Outter07 out = new Outter07();
		out.method2(100);
	}
}
