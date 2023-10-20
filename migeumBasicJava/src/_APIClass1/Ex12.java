package _APIClass1;

import java.util.Arrays;

class A implements Cloneable {
	int i;
	int arr[];
	String s;

	public A(int i, int arr[], String s) {
		this.i = i;
		this.arr = arr;
		this.s = s;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		int newI = i;
//		int[] newArr = null;
//		for (int i = 0; i < arr.length; i++) {
//			newArr[i] = arr[i];
//		}
//		String newS = new String(s);
//		A cloned = new A(newI, newArr, newS);
		
		A cloned=(A)super.clone();
		cloned.arr=Arrays.copyOf(arr, arr.length);
		
		return cloned;
	}

	@Override
	public String toString() {
		String buf = "";
		buf += i + "\n";
		for (int i : arr) {
			buf += i + " ";
		}
		buf += "\n" + s + "\n";
		return buf;
	}

}

public class Ex12 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		A a = new A(1, arr, "first");

		A aClone = null;
		try {
			aClone = (A) a.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(a);
		System.out.println(aClone);

		for (int i = 0; i < arr.length; i++) {
			aClone.arr[i] *= 10;
		}

		System.out.println(a);
		System.out.println(aClone);
	}
}
