package _APIClass2;

import java.util.Arrays;

class Memeber03 implements Comparable<Memeber03> {
	String name;

	public Memeber03(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Memeber03 o) {
		return name.compareTo(o.name);
	}

}

public class Ex03 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] = %d\n",i,scores[i]);
		}
		System.out.println();

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d] = %s\n",i,names[i]);
		}
		System.out.println();

		Memeber03 m1 = new Memeber03("홍길동");
		Memeber03 m2 = new Memeber03("박동수");
		Memeber03 m3 = new Memeber03("김민수");
		Memeber03[] memebers = { m1, m2, m3 };
		Arrays.sort(memebers);

		for (int i = 0; i < memebers.length; i++) {
			System.out.printf("Memeber[%d] = %s\n",i,memebers[i].name);
		}
	}
}
