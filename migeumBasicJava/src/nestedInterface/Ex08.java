package nestedInterface;

class Outter08{
	String field ="Outer-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested08{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-Method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter08.this.field);
			Outter08.this.method();
		}
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Outter08 outter=new Outter08();
		Outter08.Nested08 nested=outter.new Nested08();
		nested.print();
	}
}
