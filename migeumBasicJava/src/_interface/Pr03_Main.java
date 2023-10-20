package _interface;

interface Searachable{
	void search(String url);
}

interface RemoteControl{
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();
	void trunOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

class SmartTelevision implements RemoteControl,Searachable{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("���� ���� : "+volume);
	}
	
}

public class Pr03_Main {
	public static void main(String[] args) {
		SmartTelevision stv=new SmartTelevision();
		stv.turnOn();
		stv.search("gululu");
		stv.setVolume(15);
		stv.setVolume(115);
	}

}
