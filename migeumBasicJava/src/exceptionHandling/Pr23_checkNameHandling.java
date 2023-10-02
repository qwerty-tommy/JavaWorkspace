package exceptionHandling;

class FoolException extends RuntimeException{}

public class Pr23_checkNameHandling {
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	
	public static void main(String[] args) {
		Pr23_checkNameHandling test=new Pr23_checkNameHandling();
		test.sayNick("genious");
		test.sayNick("fool");
	}

}
