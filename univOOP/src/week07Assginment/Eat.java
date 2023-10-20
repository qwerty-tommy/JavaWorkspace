package week07Assginment;

import java.util.Scanner;

class Eat implements Calory {
	Food food;
	int qnty;
	String unit;
	int kcal;

	@Override
	public String toString() {		//식사의 대한 2번째 출력함수 toString2 사용
		return food.toString2(qnty, kcal, unit);
	}

	@Override
	public void read(Scanner scan) {
		String name = scan.next();
		food = (Food) Dine.findFood(name);
		qnty = scan.nextInt();
		unit = scan.next();
		kcal = getKcal();
	}

	// g,ml 단위에 대해서 계산 적용
	@Override
	public int getKcal() {
		if (unit.equals("ml") || unit.equals("g"))
			return food.getKcal() * qnty / ((DividableFood) food).size;
		else
			return food.getKcal();
	}
}