package exceptionHandling;

class FoolException24 extends RuntimeException{
	String name;
	public FoolException24(String str) {
		name=str;
	}
	@Override
	public String toString() {
		
		return name+"에러!!!!";
	}
}

public class Pr24_handlingCreateClass {
	public void sayNick(String nick) {
		try {
			if ("fool".equals(nick)) {
				throw new FoolException24("너의 별명은...");
			}
			System.out.println(nick);
		}catch (FoolException24 e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Pr24_handlingCreateClass test=new Pr24_handlingCreateClass();
		test.sayNick("genious");
		test.sayNick("fool");
	}

}
