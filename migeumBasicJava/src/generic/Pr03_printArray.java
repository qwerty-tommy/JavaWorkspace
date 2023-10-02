package generic;

public class Pr03_printArray {

	public static void main(String[] args) {
		Integer[] iArray = { 10, 20, 30, 40, 50 };
		Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
		String[] str = { "apple", "banana", "grape", "orange" };
		
		printArray(iArray);
		
	}
	
	public static <T>  void printArray(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
