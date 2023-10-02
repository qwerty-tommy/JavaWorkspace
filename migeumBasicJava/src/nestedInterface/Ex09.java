package nestedInterface;

class Person{
	void wake() {
		System.out.println("***4�ÿ� �Ͼ�ϴ�~");
	}
}

class Anonymous09{
	//�ʵ� �ʱⰪ���� ����
	Person field=new Person() {
		void work() {
			System.out.println("����մϴ�~");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		//���ú��������� ����
		Person localVar=new Person() {
			void walk() {
				System.out.println("��å�մϴ�~");
			}
			
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�~");
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
		anony.field.wake();	//�͸� ��ü �ʵ� ���
		anony.method1();	//�͸� ��ü ���ú��� ���
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�~");
				}
				
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}
		);
	}
}
