package generic;

class Box{
	private Object data;
	public void set(Object data) {
		this.data=data;
	}
	public Object get() {
		return data;
	}
}

public class Ex01_box {

	public static void main(String[] args) {
			Box b=new Box();
			b.set("Hello World!");
			String s =(String)b.get();
			System.out.println(s);
			b.set(new Integer(10));
			Integer i=(Integer)b.get();
			System.out.println(i);
	}

}
