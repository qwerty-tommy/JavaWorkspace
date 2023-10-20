package generic;

class Util {
	public static <T> Box6<T> boxing(T t){
		Box6<T> box=new Box6<T>();
		box.set(t);
		return box;
	}
}

class Box6<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

public class Ex06_typeParameter {

	public static void main(String[] args) {
		Box6<Integer> box1=Util.<Integer>boxing(100);
		int intValue=box1.get();
		
		Box6<String> box2=Util.boxing("ȫ�浿");
		String strValue=box2.get();
	}

}
