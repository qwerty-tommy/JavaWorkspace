package generic;

public class Pr02 {

	static <T> void myPrint(T[] obj){
		for (T t : obj) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] iArray= {10,20,30,40,50};
		Double[] dArray= {1.1,1.2,1.3,1.4,1.5};
		Character[] cArray= {'K','O','R','E','A'};
		String[] sArray= {"apple","banana","grape","orange"};
		
		myPrint(iArray);
		myPrint(dArray);
		myPrint(cArray);
		myPrint(sArray);
	}

}
