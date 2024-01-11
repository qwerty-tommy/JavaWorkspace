package collectionFramework2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class SimpleNumber11 {
	int num;

	public SimpleNumber11(int n) {
		num = n;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(num);
	}

	@Override
	public boolean equals(Object obj) {
		return ((SimpleNumber11)obj).num == num;
	}
}

public class Ex11 {
	public static void main(String[] args) {
		HashSet<SimpleNumber11> hSet = new HashSet<SimpleNumber11>();
		hSet.add(new SimpleNumber11(10));
		hSet.add(new SimpleNumber11(20));
		hSet.add(new SimpleNumber11(20));
		hSet.add(new SimpleNumber11(10));
		hSet.add(new SimpleNumber11(30));

		System.out.println("저장된 데이터 수 : " + hSet.size());

		Iterator<SimpleNumber11> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
