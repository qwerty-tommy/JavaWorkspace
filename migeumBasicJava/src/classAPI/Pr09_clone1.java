package classAPI;

class Point implements Cloneable {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}

//	public Object clone() {
//		Object obj = null;
//		try {
//			obj = super.clone();
//		} catch (CloneNotSupportedException e) {
//		}
//		return obj;
//
//	}

}

public class Pr09_clone1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		//Point copy = (Point) original.clone();
		 Point copy=original;
		System.out.println(original);
		System.out.println(copy);
		original.x = 100;
		System.out.println(original);
		System.out.println(copy);

	}

}
