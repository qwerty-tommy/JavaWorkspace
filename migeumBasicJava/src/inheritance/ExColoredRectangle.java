package inheritance;

class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getwidth() {
		return this.width;
	}

	public double getheight() {
		return this.height;
	}

}

class ColoredRectangle extends Rectangle {
	private String color;

	public ColoredRectangle(int x, int y, double width, double height, String color) {
		super(x, y, width, height);
		this.color = color;
	}

	public String getcolor() {
		return this.color;
	}

}

public class ExColoredRectangle {
	public static void main(String[] args) {
		ColoredRectangle s1 = new ColoredRectangle(10, 10, 20, 20, "red");

		System.out.println("Shape");
		System.out.println("Rectangle : " + s1.getwidth() * s1.getheight());
		System.out.println("ColoredRectangle : " + s1.getcolor());
	}
}
