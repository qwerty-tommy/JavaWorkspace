package _APIClass1;

public class Pr03_hashcode1 {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
//		if(s1==s2) {
//			System.out.println("ok");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("ok");
//		}
		String str1 = new String("abc");
		String str2 = new String("abc");
//		if(str1==str2) {
//			System.out.println("ok");
//		}else {
//			System.out.println("nnn");
//
//		}
//		if(str1.equals(str2)) {
//			System.out.println("ok");
//		}
		//
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

}
