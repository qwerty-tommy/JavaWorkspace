package _APIClass1;

import java.util.Arrays;

public class Pr10_clone2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arrClone=arr.clone();
//		int[] arrclone=arr;
		arrClone[0]=6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
