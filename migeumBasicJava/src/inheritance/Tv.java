package inheritance;

public class Tv {
	boolean power;
	int channel;
	int volume;
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}

	public void channelUp() {
		this.channel++;
	}
	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volume++;
	}
	public void volumeDown() {
		this.volume--;
	}

	public Tv() {}
	public Tv(boolean power, int channel, int volume) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
}
