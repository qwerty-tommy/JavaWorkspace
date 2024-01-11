package collectionFramework1;

import java.util.ArrayList;

class Fruit {
	int no;
	String name;
	String price;

	public Fruit(int no, String name, String price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "" + no + " " + name + " " + price;
	}
}

public class Pr08 {
//	void printElement(ArrayList<Fruit> list) {
//		for (Fruit fruit : list) {
//			System.out.print(fruit+", ");
//		}
//	}

	static void shuffle(ArrayList<Fruit> list, int complexity) {
		int listSize = list.size();
		int rand;

		for (int i = 0; i < complexity; i++) {
			rand = (int) (Math.random() * ((double) listSize));
			swap(list, 0, rand);
		}
	}

	static void swap(ArrayList<Fruit> list, int a, int b) {
		Fruit tmp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, tmp);
	}

	public static void main(String[] args) {
		Fruit banana = new Fruit(2, "banana", "2000");
		Fruit grape = new Fruit(3, "grape", "3000");
		Fruit melon = new Fruit(1, "melon", "1000");
		Fruit orange = new Fruit(4, "orange", "4000");

		ArrayList<Fruit> boardList = new ArrayList<>();

		boardList.add(banana);
		boardList.add(grape);
		boardList.add(melon);
		boardList.add(orange);

		System.out.println("섞기전 : " + boardList);

		shuffle(boardList, 100);

		System.out.println("섞은후 : " + boardList);
	}
}
