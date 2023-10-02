package inheritance;

public class CaptionTv extends Tv {

	public String toString() {
		if (power) {
			return ("ä���� " + channel + "  ������ " + volume);
		} else {
			return ("��¾���");
		}
	}

	public CaptionTv() {}
	public CaptionTv(boolean power, int channel, int volume) {
		super(power, channel, volume);
	}
}
