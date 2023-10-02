package classAPI;

public class Pr27_transStringPrimitive {

	public static void main(String[] args) {
		int iVal=100;
		String strVal=String.valueOf(iVal);
		
		double dVal=200.0;
		String strVal2=dVal+" ";
		
		double sum=Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2);
		double sum2=Integer.valueOf(strVal)+Double.valueOf(strVal2);
		
		System.out.println(String.join(" ", strVal, "+", strVal2, "=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
		int val=Integer.parseInt("\t123".trim());
		System.out.println(val+100);
	}

}
