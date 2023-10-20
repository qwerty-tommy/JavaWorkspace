package exceptionHandling;

class FoolException25 extends RuntimeException{
	
}

public class Pr25_handlingInMain {
	public void sayNick(String nick) throws FoolException25{
		if ("fool".equals(nick)) {
			throw new FoolException25();
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	
	public static void main(String[] args) {
		Pr25_handlingInMain test=new Pr25_handlingInMain();
		try {
			test.sayNick("genious");
			test.sayNick("fool");
		} catch (FoolException25 e) {
			// TODO: handle exception
			System.err.println("FoolException이 발생했습니다.");
		}
	}

}
