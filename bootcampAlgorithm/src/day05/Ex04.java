package day05;

class Person04 {
}

class Student04 extends Person04 {
}

class Researcher04 extends Person04 {
}

class Professor04 extends Researcher04 {
}

public class Ex04 {
	static void print(Person04 p) {
		if (p instanceof Person04)
			System.out.print("Person ");
		if (p instanceof Student04)
			System.out.print("Student ");
		if (p instanceof Researcher04)
			System.out.print("Researcher ");
		if (p instanceof Professor04)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student04());
		System.out.print("new Researcher() ->\t");
		print(new Researcher04());
		System.out.print("new Professor() ->\t");
		print(new Professor04());
	}
}