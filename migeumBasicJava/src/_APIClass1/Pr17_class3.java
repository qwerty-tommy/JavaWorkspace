package _APIClass1;

interface Action {
	public void execute();
}

class SendAction implements Action {
	@Override
	public void execute() {
		System.out.println("�����͸� �����ϴ�.");
	}
}

class ReceiveAction implements Action {
	@Override
	public void execute() {
		System.out.println("�����͸� �޽��ϴ�.");
	}
}

public class Pr17_class3 {		

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("classAPI.SendAction");		//�ڷῡ�� ��Ű�� �̸� ������ ���� ���� ��������..
			// Class calzz=Class.forName("ReceiveAction");
			Action action = (Action) clazz.newInstance();	//��ó���� ��������..?
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
