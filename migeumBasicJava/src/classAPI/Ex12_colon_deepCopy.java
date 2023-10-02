package classAPI;

import java.util.Arrays;

public class Ex12_colon_deepCopy {
	
	public static void main(String[] args) {
		
		
		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arrClone = arr.clone();
//		int[] arrClone=arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		arrClone[0] = 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		arr[0] = 30;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}
