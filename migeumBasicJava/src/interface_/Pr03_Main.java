package interface_;

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
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

class SmartTelevision implements RemoteControl,Searachable{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 볼륨 : "+volume);
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
