package inheritance;

public class CaptionTv extends Tv {

	public String toString() {
		if (power) {
			return ("채널은 " + channel + "  볼륨은 " + volume);
		} else {
			return ("출력없음");
		}
	}

	public CaptionTv() {}
	public CaptionTv(boolean power, int channel, int volume) {
		super(power, channel, volume);
	}
}
