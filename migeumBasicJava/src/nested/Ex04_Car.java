package nested;

class Car{
	String carName;
	
	class Tire{
		int tireSize;
		 public Tire(int tireSize) {
			 this.tireSize=tireSize;
		 }
	}
	static class Engine{
		int engineSize;
		public Engine(int engineSize) {
			this.engineSize=engineSize;
		}
	}
	
	public Car(String carName) {
		this.carName=carName;
	}
}

public class Ex04_Car {

	public static void main(String[] args) {
		Car myCar=new Car("그랜저");
		
		Car.Tire tire=myCar.new Tire(5);
		
		Car.Engine engine=new Car.Engine(5);
		
		System.out.println("자동차이름: "+myCar.carName+"  타이어크기: "+tire.tireSize);
		
		
	}

}
