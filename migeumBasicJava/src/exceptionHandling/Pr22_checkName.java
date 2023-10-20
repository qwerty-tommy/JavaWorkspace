package exceptionHandling;

public class Pr22_checkName {
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	
	public static void main(String[] args) {
		Pr22_checkName test=new Pr22_checkName();
		test.sayNick("fool");
		test.sayNick("genious");
	}

}
