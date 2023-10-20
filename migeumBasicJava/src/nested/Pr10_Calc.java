package nested;

interface Calculatable {
	public int sum();
}

class Anonymous10 {
	private int field;

	public void method(final int arg1, int arg2) {
		final int var1 = 10000;
		int var2 = 1000;

		field = 100;
		
		//arg2=20;
		//var2=30;
		
		Calculatable calc=new Calculatable() {
			
			@Override
			public int sum() {
				int result=field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}

public class Pr10_Calc {

	public static void main(String[] args) {
		Anonymous10 anony=new Anonymous10();
		anony.method(1, 10);
	}

}
