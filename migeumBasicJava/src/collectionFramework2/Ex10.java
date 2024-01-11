package collectionFramework2;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber10 {
	int num;

	public SimpleNumber10(int n) {
		num = n;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}

public class Ex10 {
	public static void main(String[] args) {
		HashSet<SimpleNumber10> hSet=new HashSet<SimpleNumber10>();
		hSet.add(new SimpleNumber10(10));
		hSet.add(new SimpleNumber10(20));
		hSet.add(new SimpleNumber10(20));
		hSet.add(new SimpleNumber10(10));
		hSet.add(new SimpleNumber10(30));
		
		System.out.println("저장된 데이터 수 : "+hSet.size());
		
		Iterator<SimpleNumber10> itr=hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}
}
