package generic;

class Tv {
	@Override
	public String toString() {
		return "Tv";
	}
}

class Car {
	@Override
	public String toString() {
		return "Car";
	}
}

class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public M getModel() {
		return model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public void showPr() {
		System.out.println("kind : " + kind);
		System.out.println("model : " + model);
	}

	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}
}

public class Pr06_genericProduct {

	public static void main(String[] args) {
		Product<Tv, String> pr1 = new Product<Tv, String>(new Tv(), "½º¸¶Æ®Tv");
		Product<Car, String> pr2 = new Product<Car, String>(new Car(), "µðÁ©");
		
		pr1.showPr();
		pr2.showPr();
	}

}
