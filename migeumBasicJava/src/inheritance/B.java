package inheritance;

public class B extends A {
	int height;
	int weight;
	double sight;

	public int getheight() {
		return height;
	}

	public int getweight() {
		return weight;
	}

	public double getsight() {
		return sight;
	}

	public B(String name, String num, int height, int weight, double sight) {
		super(name, num);
		this.height = height;
		this.weight = weight;
		this.sight = sight;
	}
}
