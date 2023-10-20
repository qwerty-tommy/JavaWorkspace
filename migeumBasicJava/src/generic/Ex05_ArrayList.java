package generic;

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple {
	@Override
	public String toString() {

		return "Apple";
	}
}

class Grape {
	@Override
	public String toString() {

		return "Grape";
	}
}

class Toy {
	@Override
	public String toString() {

		return "Toy";
	}
}

class Box5<T> {
	ArrayList<T> list = new ArrayList<T>();

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

public class Ex05_ArrayList {

	public static void main(String[] args) {
		Box5<Fruit> fruitBox=new Box5<Fruit>();
		Box5<Apple> appleBox=new Box5<Apple>();
		Box5<Toy> toyBox=new Box5<Toy>();
		
		fruitBox.add(new Fruit());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		appleBox.add(new Apple());
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
