package week07Assginment;

import java.util.Scanner;

public class Food implements Calory {
	static private int serialNo = 0;
	int id;
	String type;
	String name;
	String unit;
	int kcal;

	public Food() {
		id = ++serialNo;
	}

	@Override
	public void read(Scanner scan) {
		type = scan.next();
		name = scan.next();
		unit = scan.next();
		kcal = scan.nextInt();
		Dine.foodMap.put(name, this);
	}

	@Override
	public String toString() {
		return String.format("[%2d] %s-%s (%s)", id, type, name, getDetail());
	}

	String toString2(int qnty, int kcal, String unit) {
		return String.format("%s %d%s(%dkcal) - %s", name, qnty, unit, kcal, getDetail());
	}

	@Override
	public int getKcal() {
		return kcal;
	}

	String getDetail() {
		return String.format("%dkcal/%d%s", kcal, 1, this.unit);
	}
}