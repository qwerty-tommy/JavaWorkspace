package day02;

public class Ex11IrregularArray {
	public static void main(String[] args) {
		int[][] ddArr = new int[4][];
		ddArr[0] = new int[3];
		ddArr[1] = new int[2];
		ddArr[2] = new int[3];
		ddArr[3] = new int[2];

		for (int[] is : ddArr) {
			for (int is2 : is) {
				is2 = (int) (Math.random() * 100);
				System.out.println(is2);
			}
		}
		
		for (int[] is : ddArr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
}
