package _APIClass1;

class Card{
	String kind;
	int number;
	
	public Card() {
		this("SPADE",1);
	}
	
	public Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
}

public class Pr05_toString1 {

	public static void main(String[] args) {
		Card c1=new Card();
		Card c2=new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
