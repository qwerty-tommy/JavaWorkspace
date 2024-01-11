package lambda;

@FunctionalInterface
interface MyFunction05<T> {
	public void method(T x);
}

public class Pr05 {
	public static void main(String[] args) {
		MyFunction05<Integer> mf1 = (Integer x) -> {
			for (int i = 0; i < 3; i++) {
				System.out.print(x + " ");
			}
		};
		mf1.method(10);

		MyFunction05<Double> mf2 = (Double x) -> {
			for (int i = 0; i < 3; i++) {
				System.out.print(x + " ");
			}
		};
		mf2.method(3.3);

		MyFunction05<String> mf3 = (String x) -> {
			for (int i = 0; i < 3; i++) {
				System.out.print(x + " ");
			}
		};
		mf3.method("Hello!");
	}
}
