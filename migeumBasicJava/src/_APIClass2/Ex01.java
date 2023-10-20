package _APIClass2;

public class Ex01 {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

//		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		System.out.println(Arrays.toString(arr2));
//
//		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
//		System.out.println(Arrays.toString(arr3));

		char[] arr4 = new char[10];
		System.arraycopy(arr1, 1, arr4, 3, 2);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}
