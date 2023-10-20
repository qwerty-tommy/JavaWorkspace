package polymorphism;

public class Ex01_Main {
	static void action(Ex01_Robot robot) {
		robot.action();
	}
	
	public static void main(String[] args) {
		Ex01_Robot[] arr = { new Ex01_DanceRobot(), new Ex01_SingRobot(), new Ex01_DrawRobot() };
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

}
