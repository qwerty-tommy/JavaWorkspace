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
		System.out.println("�ڵ��� �̸� : "+this.name);
		System.out.println("Ÿ�̾� ũ�� : "+this.tire.size);
	}
}

public class Pr04 {

	public static void main(String[] args) {
		Car04 myCar=new Car04("�׷���",25);
		myCar.printInfo();
	}

}
