package week07Assginment;

import java.util.Scanner;

public class DividableFood extends Food implements Calory {
	int size;
	String sizeUnit;

	@Override
	public void read(Scanner scan) {
		super.read(scan);
		size = scan.nextInt();
		sizeUnit = scan.next();
	}

	@Override
	public String toString() {
		return String.format("[%2d] %s-%s (%s) %d%s", id, type, name, getDetail(), size, sizeUnit);
	}

	@Override
	String toString2(int qnty, int kcal, String unit) {
		if (unit.equals("ml") || unit.equals("g"))
			return String.format("%s -> %dkcal*%d/%d%s=%dkcal", super.toString2(qnty, kcal, unit), this.kcal, qnty,
					size, sizeUnit, kcal);
		else
			return super.toString2(qnty, kcal, unit);
	}
}
