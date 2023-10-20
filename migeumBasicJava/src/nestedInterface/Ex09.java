package nestedInterface;

class Person{
	void wake() {
		System.out.println("***4시에 일어납니다~");
	}
}

class Anonymous09{
	//필드 초기값으로 대입
	Person field=new Person() {
		void work() {
			System.out.println("출급합니다~");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		//로컬변수값으로 대입
		Person localVar=new Person() {
			void walk() {
				System.out.println("산책합니다~");
			}
			
			void wake() {
				System.out.println("7시에 일어납니다~");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}

public class Ex09 {
	public static void main(String[] args) {
		Anonymous09 anony=new Anonymous09();
		anony.field.wake();	//익명 객체 필드 사용
		anony.method1();	//익명 개체 로컬변수 사용
		//익명 객체 매개값 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다~");
				}
				
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}
}
