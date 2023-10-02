package classAPI;

interface Action {
	public void execute();
}

class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}

class ReceiveAction implements Action {
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}

public class Pr17_class3 {		

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("classAPI.SendAction");		//자료에선 패키지 이름 빼던데 내껀 빼면 오류나옴..
			// Class calzz=Class.forName("ReceiveAction");
			Action action = (Action) clazz.newInstance();	//줄처진거 버전문제..?
			action.execute();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();		
		}
	}

}
