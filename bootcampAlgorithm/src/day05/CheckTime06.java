package day05;

class SuperObject { // 슈퍼 클래스
	public void paint() {
		draw();
	}

	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	@Override
	public void paint() {
		super.draw();
	}

	@Override
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class CheckTime06 {
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
 	}
}	
