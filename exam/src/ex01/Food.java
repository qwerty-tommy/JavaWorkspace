package ex01;

import java.util.Scanner;

public class Food implements Manageable {
	String id;
	String name;
	int price;
	int quantity;

	@Override
	public void read(Scanner scan) {
		id = scan.next();
		name = scan.next();
		price = scan.nextInt();
		quantity = scan.nextInt();
	}

	@Override
	public void print() {
		System.out.printf("[%s] %s %d (재고 %d개)\n", id, name, price, quantity);
	}

	void printLess(int n) {
		if(quantity<=n) {
			print();
		}
	}

	@Override
	public boolean matches(String kwd) {
		if (id.equals(kwd))
			return true;
		if (name.contains(kwd))
			return true;
		if ((price + "").equals(kwd))
			return true;
		return false;
	}

}
