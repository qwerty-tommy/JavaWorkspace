package nested;

class Outer8{
	String field="Outter=field";
	
	void method() {
		System.out.println("Outter-method");
	}
	class Nested{
		String field="Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outer8.this.field);
			Outer8.this.method();
		}
		
	}

	
}

public class Pr08_OuterNested {

	public static void main(String[] args) {
		Outer8 outer=new Outer8();
		Outer8.Nested nested=outer.new Nested();
		nested.print();
	}

}
