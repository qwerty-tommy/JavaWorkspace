//package generic;
//
//import java.util.ArrayList;
//
//interface Eatable {
//}
//
//class Fruit implements Eatable {
//	@Override
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//class Apple extends Fruit {
//	@Override
//	public String toString() {
//		return "Apple";
//	}
//}
//
//class Grape extends Fruit {
//	@Override
//	public String toString() {
//		return "Grape";
//	}
//}
//
//class Toy {
//	@Override
//	public String toString() {
//		return "Toy";
//	}
//}
//
//class FruitBox<T extends Fruit & Eatable> extends Box<T> {
//}
//
//class Box<T> {
//	ArrayList<T> list = new ArrayList<>();
//
//	void add(T item) {
//		list.add(item);
//	}
//
//	T get(int i) {
//		return list.get(i);
//	}
//
//	int size() {
//		return list.size();
//	}
//
//	@Override
//	public String toString() {
//		return list.toString();
//	}
//
//}
//
//public class Ex10_boundedGenericClass {
//
//	public static void main(String[] args) {
//		FruitBox<Fruit> fruitBox=new FruitBox<Fruit>();
//		FruitBox<Apple> appleBox=new FruitBox<ga>
//	}
//
//}
