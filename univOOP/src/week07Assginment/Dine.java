package week07Assginment;

import java.util.HashMap;
import java.util.Scanner;

public class Dine implements Calory {
	Manager eatManager = new Manager();
	// ArrayList<Calory> foodList = new ArrayList<>(); 
	//Food의 ArrayList를 가지고 검색 기능 제공 -> 어떤 검색기능을 원하는지 모르겠음
	static HashMap<String, Calory> foodMap = new HashMap<>(); // food의 대한 검색기능은 HashMap에서 처리

	int day;
	int month;
	String eatType;
	int cc; // 필요없어짐
	int totalCal;

	@Override
	public void read(Scanner filein) {
		this.month = filein.nextInt();
		this.day = filein.nextInt();
		this.eatType = filein.next();
		this.cc = filein.nextInt();

		eatManager.readAll(filein, new Factory() {
			@Override
			public Calory create() {
				return new Eat();
			}
		});

//		for (int i = 0; i < cc; i++) {
//			totalCal += eatManager.calories.get(i).getKcal();
//		}

//		for (Calory calory : eatManager.calories) {
//			totalCal += calory.getKcal();
//		}

		for (Calory calory : eatManager.getCalories()) { // getCalories getter메소드 추가
			totalCal += calory.getKcal();
		}

	}

	@Override
	public int getKcal() {
		return totalCal;
	}

	@Override
	public String toString() {
		System.out.printf("%d/%d %s ", month, day, eatType);
		System.out.printf("총칼로리: %dkcal\n", totalCal);
		String buf = "";
		for (Calory calory : eatManager.getCalories()) {
			buf += calory.toString() + "\n";
		}
		return buf;
	}

	static Calory findFood(String n) {
		Calory f = foodMap.get(n);
		if (f == null) {
			System.out.println("find null => " + n);
			throw new NullPointerException();
		}
		return f;
	}
}