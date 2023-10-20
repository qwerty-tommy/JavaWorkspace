package pack_interface;

interface SysSW{
	void start();
	void stop();
	int setSpeed(int speed);
	int turn(int degree);
}

class CarSW implements SysSW{
	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	@Override
	public int setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다.");
		return 0;
	}
	@Override
	public int turn(int degree) {
		System.out.println("자동차가 속도를 "+degree+"도만큼 바꿉니다.");
		return 0;
	}
}

public class Ex09_AutonomousCar {

	public static void main(String[] args) {
		CarSW c=new CarSW();
		
		c.start();
		c.setSpeed(30);
		c.turn(15);
		c.stop();
	}
}
