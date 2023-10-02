package overriding;

class BoxOv {
	public void wrap() {
		System.out.println("simple wrap");
	}
}

class PaperBoxOv extends BoxOv {
	public void wrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBoxOv extends PaperBoxOv {
	public void wrap() {
		System.out.println("gold wrap");
	}
}

public class WrapBoxOverriding {
	public static void main(String[] args) {
		BoxOv box1 = new BoxOv();
		BoxOv box2 = new PaperBoxOv();
		BoxOv box3 = new GoldPaperBoxOv();

		box1.wrap();
		box2.wrap();
		box3.wrap();
	}

}
