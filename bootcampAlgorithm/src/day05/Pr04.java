package day05;

class PositivePoint extends Point03 {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(0, 0);
		if (x > 0 && y > 0) {
			move(x, y);
		}
	}

	protected void move(int x, int y) {
		if (x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)의 점", getX(), getY());
	}
}

public class Pr04 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
