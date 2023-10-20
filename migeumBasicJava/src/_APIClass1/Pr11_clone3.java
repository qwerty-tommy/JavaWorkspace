package _APIClass1;

class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	int age;
	public int[] score = new int[3];
	public boolean adult;

	public Member(String id, String name, String password, int[] score, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		for (int i = 0; i < 3; i++) {
			this.score[i] = score[i];
		}
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cloned;
	}

}

public class Pr11_clone3 {

	public static void main(String[] args) {
		int[] score = { 100, 90, 80 };
		Member original = new Member("blue", "ȫ�浿", "12345", score, 25, true);

		Member cloned = original.getMember();
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.id);
		System.out.println("password: " + cloned.password);

		for (int i = 0; i < 3; i++) {
			System.out.println("score :" + cloned.score[i] + " ");
		}
		System.out.println("\nage: " + cloned.age);
		System.out.println("adult: " + cloned.adult);

		System.out.println();

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.id);
		System.out.println("password: " + original.password);

		for (int i = 0; i < 3; i++) {
			System.out.println("score :" + original.score[i] + " ");
		}
		System.out.println("\nage: " + original.age);
		System.out.println("adult: " + original.adult);

		cloned.password = "67890";
		cloned.score[2] = 100;

		System.out.println();

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.id);
		System.out.println("password: " + original.password);

		for (int i = 0; i < 3; i++) {
			System.out.println("score :" + original.score[i] + " ");
		}
		System.out.println("\nage: " + original.age);
		System.out.println("adult: " + original.adult);

	}

}
