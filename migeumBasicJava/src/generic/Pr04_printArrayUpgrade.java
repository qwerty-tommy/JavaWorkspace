package generic;

public class Pr04_printArrayUpgrade {

	public static void main(String[] args) {
		Integer[] iArray = { 10, 20, 30, 40, 50 };
		Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
		String[] str = { "apple", "banana", "grape", "orange" };
		
		System.out.println(printArrayReturn(iArray));
		
	}
	
	public static <T extends Comparable> T printArrayReturn(T[] array) {
		T max=array[0];
		T min=array[0];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (max.compareTo(array[i])<0) {
				max=array[i];
			}
//			if (min>array[i]) {
//				min=array[i];
//			}
		}
		System.out.println();
		
		return max;
	}

}
