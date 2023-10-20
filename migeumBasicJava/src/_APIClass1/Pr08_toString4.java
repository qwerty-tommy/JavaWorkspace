package _APIClass1;

class Card8 {
	String kind;
	int number;

	public Card8() {
		this("SPADE", 1);
	}

	public Card8(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class Pr08_toString4 {

	public static void main(String[] args) {
		Card8 c1=new Card8();
		Card8 c2=new Card8("HEART",10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
