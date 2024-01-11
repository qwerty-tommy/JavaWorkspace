package health;

import java.util.Scanner;

import facade.UIData;
import mgr.Manageable;

public class UserFood implements Manageable, UIData {
	int size;
	int cal;
	Food food;

	String date;

	public UserFood(Food food, int size, Date date) {
		this.food = food;
		this.size = size;
		this.cal = (int) (food.getCalRatio() * size);
		this.date = date.toString();
	}

	@Override
	public String toString() {
		return "음식 이름 : " + food.name + "\n먹은 양 : " + size + "g\n칼로리 : " + cal + "cal\n";
	}

	@Override
	public void read(Scanner scan) {
	}

	@Override
	public void print() {
	}

	@Override
	public boolean matches(String kwd) {
		return kwd.equals(food.name);
	}

	@Override
	public void set(Object[] uitexts) {
	}

	@Override
	public String[] getUiTexts() {
		String[] texts = new String[4];
		texts[0] = User.string2Tag(date.toString());
		texts[1] = User.string2Tag(food.name);
		texts[2] = User.string2Tag("" + size); // 순서 변경 size, cal
		texts[3] = User.string2Tag("" + cal);
		return texts;
	}

	public String getName() {
		return this.food.name;
	}
}
