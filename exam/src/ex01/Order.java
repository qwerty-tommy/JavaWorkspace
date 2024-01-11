package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Order implements Manageable {
	String id;
	int num;
	int sum;
	ArrayList<Food> registeredCodes = new ArrayList<>();

	@Override
	public void read(Scanner scan) {
		id = scan.next();
		num = scan.nextInt();

		Food food;
		String code;
		for (int i = 0; i < num; i++) {
			code = scan.next();
			food = (Food) Department.foodMgr.find(code);
			registeredCodes.add(food);
			sum += food.price;
			if (food.quantity > 0) {
				print();
				food.quantity--;
			}
			else {
				print();
				System.out.println("^재고부족");
			}
		}

	}

	@Override
	public void print() {
		System.out.format("%s 총 %d원 (%d개) : [", id, sum, num);
		for (Food food : registeredCodes) {
			System.out.print(food.name + " ");
		}
		System.out.println("]");
	}

	@Override
	public boolean matches(String kwd) {
		if (id.contentEquals(kwd)) {
			return true;
		}
		for (Food food : registeredCodes) {
			return food.matches(kwd);
		}
		return false;
	}
}