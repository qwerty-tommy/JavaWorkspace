package generic;

class Box2<T>{
	private T data;
	public void set(T data) {
		this.data=data;
	}
	public T get() {
		return data;
	}
}

public class Ex02_boxWithGeneric {

	public static void main(String[] args) {
		Box2 b=new Box2();
		b.set("Hello World!");
		String s=(String)b.get();
		System.out.println(s);
		b.set(new Integer(10));
		Integer i= (Integer)b.get();
		System.out.println(i);
	}

}
