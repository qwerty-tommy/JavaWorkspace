package nestedInterface;

class Car04 {
	String name;
	Tire04 tire;

	public Car04(String name, int size) {
		this.name = name;
		this.tire=new Tire04(25);
	}

	class Tire04 {
		int size;

		public Tire04(int size) {
			this.size = size;
		}
	}

	static class Engine04 {
	}
	
	void printInfo() {
		System.out.println("자동차 이름 : "+this.name);
		System.out.println("타이어 크기 : "+this.tire.size);
	}
}

public class Pr04 {

	public static void main(String[] args) {
		Car04 myCar=new Car04("그랜저",25);
		myCar.printInfo();
	}

}
