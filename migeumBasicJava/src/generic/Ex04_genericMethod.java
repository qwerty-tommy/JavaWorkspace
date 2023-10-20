//package generic;
//
//class MyArrayAlg{
//	public static <T> void swap(T[] a,int i, int j) {
//		T tmp=a[i];
//		a[i]=a[j];
//		a[j]=tmp;
//	}
//}
//
//public class Ex04_genericMethod {
//
//	public static void main(String[] args) {
//		String[] language= {"C++","C#","JAVA"};
//		Integer[] intarr= {10,20,30,40,50};
//		
//		MyArrayAlg.swap(language, 1, 2);
//		for (String value : language) {
//			System.out.println(value+" ");
//		}
//		System.out.println();
//		MyArrayAlg.swap(intarr, 2, 3);
//		for (int value : intarr) {
//			System.out.println(value+" ");
//		}
//		
//	}
//
//}
