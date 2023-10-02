package overriding;

class Bank {
	public double getRate() {
		return 0.0;
	}
}

class BadBank extends Bank {
	double interest = 10.0;

	public double getRate() {
		return interest;
	}
}

class NormalBank extends Bank {
	double interest = 5.0;

	public double getRate() {
		return interest;
	}
}

class GoodBank extends Bank {
	double interest = 3.0;

	public double getRate() {
		return interest;
	}
}

public class BankInterest {
	public static void main(String[] args) {
		BadBank bb = new BadBank();
		NormalBank nb = new NormalBank();
		GoodBank gb = new GoodBank();

		System.out.println("BadBank의 이자율은 : " + bb.getRate());
		System.out.println("NormalBank의 이자율은 : " + nb.getRate());
		System.out.println("GoodBank의 이자율은 : " + gb.getRate());
	}	
}
