package ch05;

public class Main {
	public static void main(String[] args) {
		IntegerArrayList iList = new IntegerArrayList();

		iList.add(0, 40);
		iList.add(0, 20);
		iList.add(0, 30);
		iList.add(0, 10);

		System.out.println(iList);
	}
}
