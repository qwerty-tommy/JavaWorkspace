package _APIClass1;

public class Pr07_toString3 {

	public static void main(String[] args) {
		Pr07_toString3 obj=new Pr07_toString3();
		obj.toStringMethod(obj);
	}
	public void toStringMethod(Object obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus"+obj);
	}
	public String toString() {
		return "toString class";
	}
}
