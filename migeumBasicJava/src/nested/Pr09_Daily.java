package nested;

class Person {
	void wake() {
		System.out.println("4시에 일어 납니다.");
	}
}

class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}

public class Pr09_Daily {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}

}
