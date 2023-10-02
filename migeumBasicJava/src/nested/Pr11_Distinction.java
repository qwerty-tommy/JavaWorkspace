package nested;

class Outer11{
	int value=10;
	
	class Inner{
		int value=20;
		
		void method1() {
			int value=30;
			System.out.println("value : "+value);
			System.out.println("this.value : "+this.value);
			System.out.println("Inner.this.value : "+Inner.this.value);
			System.out.println("Outer11.this.value : "+Outer11.this.value);
		}
	}
}

public class Pr11_Distinction {

	public static void main(String[] args) {
		Outer11 outer=new Outer11();
		Outer11.Inner inner=outer.new Inner();
		inner.method1();
	}

}
