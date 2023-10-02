package generic;

import java.util.ArrayList;

class Fruit1 {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple1 extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape1 extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy1 {
	@Override
	public String toString() {
		return "Toy";
	}
}

public class Pr01_checkError {
	public static void main(String[] args) {
		Box1<Fruit> fruitBox = new Box1<Fruit>();
		Box1<Apple> appleBox = new Box1<Apple>();
		Box1<Toy> toyBox = new Box1<Toy>();
//		Box1<Grape> grapeBox = new Box1<Apple>();

		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());

		toyBox.add(new Toy());
//		toyBox.add(new Apple());

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}
}

class Box1<T> {
	ArrayList<T> list = new ArrayList<>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

}