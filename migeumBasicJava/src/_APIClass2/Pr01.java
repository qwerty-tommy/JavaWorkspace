package _APIClass2;

import java.util.Arrays;

class Goods implements Comparable<Goods> {
	String item;
	int price;
	int size;
	int amount;

	public Goods(String item, int price, int size, int amount) {
		this.item = item;
		this.price = price;
		this.size = size;
		this.amount = amount;
	}

	@Override
	public int compareTo(Goods o) {
		return o.item.compareTo(item);
	}

	@Override
	public String toString() {
		return String.format("%s %d %d %d", item, price, size, amount);
	}
}

public class Pr01 {
	public static void main(String[] args) {
		Goods[] origin = new Goods[3];
		origin[0] = new Goods("pencil", 10, 10, 1000);
		origin[1] = new Goods("eraser", 30, 30, 3000);
		origin[2] = new Goods("stapler case", 20, 20, 2000);

		System.out.print("[");
		for (Goods goods : origin) {
			System.out.print(goods + ", ");
		}
		System.out.println("]");

		Arrays.sort(origin);

		System.out.print("[");
		for (Goods goods : origin) {
			System.out.print(goods + ", ");
		}
		System.out.println("]");

		Goods[] newbie = new Goods[3];

		newbie = Arrays.copyOf(origin, origin.length);

		System.out.print("[");
		for (Goods goods : newbie) {
			System.out.print(goods + ", ");
		}
		System.out.println("]");
	}
}
