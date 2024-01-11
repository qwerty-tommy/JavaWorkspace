package day05;

class Point03 {
	private int x, y;

	public Point03(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint03 extends Point03 {
	String color;

	public ColorPoint03(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

public class Pr03 {
	public static void main(String[] args) {
		ColorPoint03 cp = new ColorPoint03(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다. ");
		System.out.println(cp + "입니다. "); // toString을 굳이 저렇게 사용할 필요가..?
	}

}
