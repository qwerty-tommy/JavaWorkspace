package _APIClass2;

import java.util.Arrays;

class Memeber04 implements Comparable<Memeber04> {
	String name;

	public Memeber04(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Memeber04 o) {
		return name.compareTo(name);
	}

}

public class Ex04 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인데스 : " + index);

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인데스: " + index);

		Memeber04 m1 = new Memeber04("홍길동");
		Memeber04 m2 = new Memeber04("박동수");
		Memeber04 m3 = new Memeber04("김민수");
		Memeber04[] memebers = { m1, m2, m3 };
		Arrays.sort(memebers);

		index = Arrays.binarySearch(memebers, m1);
		System.out.println("찾은 인덱스: " + index);
	}
}
