package week07Assginment;

import java.util.Scanner;

public class CaloryMgr {
	Manager foodManager = new Manager();
	Manager dineManager = new Manager();

	void mymain() {
		int sum = 0;
		Scanner foodScanner = Manager.openFile("food.txt");

		foodManager.readAll(foodScanner, new Factory() {
			@Override
			public Calory create() {
				if (foodScanner.nextInt() == 1)
					return new Food();
				else // type2
					return new DividableFood();
			}
		});
		foodScanner.close();

		foodManager.printAll();
		System.out.println("=====================================");

		Scanner managerScanner;
		for (int i = 1; i < 5; i++) {	//식사 입력 파일은 4개로 나눴음
			managerScanner = Manager.openFile("eats-input" + i + ".txt");
			dineManager.readAll(managerScanner, new Factory() {
				@Override
				public Calory create() {
					return new Dine();
				}
			});
			managerScanner.close();
		}

		dineManager.printAll();
		System.out.println("=====================================");

		for (Calory calory : dineManager.getCalories()) {
			sum += calory.getKcal();
		}

		System.out.printf("모든 칼로리 총합 : %dkal", sum);
	}

	public static void main(String[] args) {
		CaloryMgr a = new CaloryMgr();
		a.mymain();
	}
}
