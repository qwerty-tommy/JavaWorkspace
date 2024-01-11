package day05;

class Person02 {
	private int weight;
	int age;
	protected int height;
	public String name;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}

class Student02 extends Person02 {
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
	}

	Student02() {
	}

	public Student02(int age, String name, int height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student02 s = new Student02();
		s.set();

		Student02 suyong = new Student02(30, "정수영", 200);
		
	}

}
