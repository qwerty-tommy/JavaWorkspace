package day05;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d인치 %d Color Tv\n", getSize(), color);
	}
}

class IPTV extends ColorTV {
	String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	void printProperty() {
		System.out.printf("%s주소의 %d인치 %d Color Tv\n", ip, getSize(), color);
	}
}

public class Pr01 {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();

	}

}
