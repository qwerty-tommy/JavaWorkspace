package day07;

import java.util.Vector;

class Point02 {
	private int x, y;

	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Vector<Point02> v = new Vector<Point02>();

		v.add(new Point02(2, 3));
		v.add(new Point02(-5, 20));
		v.add(new Point02(30, -8));

		v.remove(1);

		for (int i = 0; i < v.size(); i++) {
			Point02 p = v.get(i);
			System.out.println(p);
		}
	}

}
