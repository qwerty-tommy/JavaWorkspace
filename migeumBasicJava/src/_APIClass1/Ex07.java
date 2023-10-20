package _APIClass1;

class Point {
	int xPos, yPos;

	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void show() {
		System.out.println("xPos, yPos = " + xPos + " " + yPos);
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return xPos == p.xPos && yPos == p.yPos;
	}
}

class Rectangle {
	Point upperLeft, lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	public void showPosition(String name) {
		System.out.println(name + " 직사각형 위치정보");
		System.out.print("좌 상단 : ");
		upperLeft.show();
		System.out.print("우 하단 : ");
		lowerRight.show();
		System.out.println();
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;
		return upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 2, 8, 9);
		Rectangle rec2 = new Rectangle(2, 3, 4, 5);
		Rectangle rec3 = new Rectangle(1, 2, 8, 9);

		rec1.showPosition("rec1 =>");
		rec2.showPosition("rec2 =>");
		rec3.showPosition("rec3 =>");

		if (rec1.equals(rec2))
			System.out.println("rec1 과 rec2는 위치정보가 같습니다.");
		else
			System.out.println("rec1 과 rec2는 위치정보가 다릅니다.");
		if (rec1.equals(rec3))
			System.out.println("rec1 과 rec3는 위치정보가 같습니다.");
		else
			System.out.println("rec1 과 rec3는 위치정보가 다릅니다.");
	}
}
