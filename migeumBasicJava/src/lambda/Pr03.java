package lambda;

@FunctionalInterface
interface MyInterface03 {
	void sayHello(String name);
}

public class Pr03 {
	public static void main(String[] args) {
		MyInterface03 mi = (String name) -> System.out.println("Hello " + name);
		mi.sayHello("Dum");
	}
}
