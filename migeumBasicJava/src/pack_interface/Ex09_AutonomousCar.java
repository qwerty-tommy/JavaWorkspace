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
		System.out.println("�ڵ����� ����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
	@Override
	public int setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ��� "+speed+"km/h�� �ٲߴϴ�.");
		return 0;
	}
	@Override
	public int turn(int degree) {
		System.out.println("�ڵ����� �ӵ��� "+degree+"����ŭ �ٲߴϴ�.");
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
