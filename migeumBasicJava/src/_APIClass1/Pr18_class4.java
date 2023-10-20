package _APIClass1;

class Card18 {
	String kind;
	int num;

	public Card18() {
		this("SPADE",1);
	}

	public Card18(String kind, int num) {
		this.kind=kind;
		this.num=num;
	}
	
	public String toString() {
		return kind+":"+num;
	}
	
}

public class Pr18_class4 {

	public static void main(String[] args) throws Exception{
		Card18 c=new Card18("HEART",3);
		Card18 c2=Card18.class.newInstance();
		
		Class cObj=c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}
