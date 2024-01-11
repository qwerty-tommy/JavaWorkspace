package day04;

class TV {
	String name;
	int date;
	int size;

	public TV(String name, int date, int size) {
		this.name = name;
		this.date = date;
		this.size = size;
	}

	void show() {
		System.out.println(name + "에서 만든 " + date + "년형 " + size + "인치 TV");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
