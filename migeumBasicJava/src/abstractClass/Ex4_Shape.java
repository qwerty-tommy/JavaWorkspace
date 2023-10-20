package abstractClass;

import java.util.Scanner;

abstract class Shape {
	Point p;

	public Shape() {
		this(new Point(0, 0));
	}

	public Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPostion(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {
	double r;

	double calcArea() {
		return r * r * 3.14;
	}
	
	public String toString(){
		String buffer= String.format("%s%.1f"," 반지름" ,r);		//p같은 경우는 어떻게 형식지정?or String.format 사용불가?
		return super.p+buffer;
	}

	public Circle(double r) {
		this.r = r;
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
}

class Rectangle extends Shape {
	double width;
	double height;

	double calcArea() {
		return width * height;
	}

	boolean isSquare() {
		return (width == height);
	}
	
	public String toString(){
		String buffer;
		if (isSquare()) {
			buffer= String.format("%s%.1f%s%.1f%s"," 가로", width," 세로",height,"\n==>정사각형 입니다.");
		} else {
			buffer= String.format("%s%.1f%s%.1f%s"," 가로", width," 세로",height,"\n==>정사각형이 아닙니다.");
		}
				
		return super.p+" 반지름"+buffer;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	
}

class Point {
	int x;
	int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Ex4_Shape {

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		Point tmpp = new Point();
		int flag;
		Scanner sc = new Scanner(System.in);
		int loopCount = 0;
		Shape[] sh=new Shape[3];
		

		while (loopCount != 3) {
			System.out.println("1.정사각형 2.원");
			flag = sc.nextInt();

			switch (flag) {
			case 1:
				System.out.print("x값을 입력하시오");
				tmpp.x = sc.nextInt();
				System.out.print("y값을 입력하시오");
				tmpp.y = sc.nextInt();
				System.out.print("가로를 입력하시오");
				num1 = sc.nextDouble();
				System.out.print("세로를 입력하시오");
				num2 = sc.nextDouble();
				break;
			case 2:
				System.out.print("x값을 입력하시오");
				tmpp.x = sc.nextInt();
				System.out.print("y값을 입력하시오");
				tmpp.y = sc.nextInt();
				System.out.print("반지름을 입력하시오");
				num1 = sc.nextDouble();
				num2 = 0;
				break;

			default:
				break;
			}

			if (num2 == 0) {
				sh[loopCount] = new Circle(num1);
			} else {
				sh[loopCount]=new Rectangle(num1, num2);
			}

			loopCount++;
		}
		
		for (int i = 0; i < sh.length; i++) {
			System.out.println(sh[i]);	
		}
			
		sc.close();
	}

}
