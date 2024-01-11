package playGround;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

class Sand<T> implements Comparable<T>, Iterable<Integer> {

	public enum Size {
		SMALL(1), MEDIUM(10), LARGE(100);

		int size;

		private Size(int i) {
			this.size = i;
		}

		@Override
		public String toString() {
			return "What a " + name() + " xx!\nIt might be " + size + "cm";

		}
	}

	public static <E> void swap(List<E> a, int i, int j) {
		E tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}

	public static void shuffle(List<?> a, Random random) {
		for (int i = 0; i < a.size(); i++) {
			swap(a, i - 1, random.nextInt(i));
		}
	}

	@Override
	public int compareTo(T o) {
		return 0;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new RandIterator(10);

	}

	public Size takeSize() {
		return Size.SMALL;
	}

	@Override
	public String toString() {
		return "Who cares?";
	}

	public void print() {
		System.out.println(toString());
	}
}

class RandIterator implements Iterator<Integer> {
	List<Integer> shuffleList;

	RandIterator(int n) {
		shuffleList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			shuffleList.add(i);
		}
		Collections.shuffle(shuffleList);
	}

	public boolean hasNext() {
		return shuffleList.size() > 0;
	}

	public Integer next() {
		Integer st = shuffleList.get(0);
		shuffleList.remove(st);
		return st;
	}
}

public class SeeSaw {
	public static void main(String[] args) {
		List<String> list = new Vector<>(); // Arraylist, LinkedList

		for (int i = 0; i < 5; i++) {
			list.add("사과" + i);
		}

		list.get(0);
		list.set(0, "apple");
		list.add("사과3");
		list.remove(0);

		List<String> subList = new ArrayList<>();
		subList = list.subList(1, 4);

		System.out.println(list);
		System.out.println(subList);
		System.out.println(list.lastIndexOf("사과3"));
		System.out.println(list.indexOf("사과3"));

		list.addAll(subList);
		System.out.println(list);

		

		// map
		Map<String, Integer> map = new HashMap<>(); // TreeMap, LinkedHashMap,
		map.clear();
		map.putAll(map);
		map.put("tmp", 0);
		map.get("tmp");

		if (map.containsKey("null")) {
			System.out.println("Who?");
		} else if (map.containsValue(-1)) {
			System.out.println("cares.");
		}

		// iterator
		Sand<Integer> ss = new Sand<>();

//		for (Integer integer : ss) {
//			System.out.println(integer);
//		}

		Iterator<Integer> i = ss.iterator();
		while (i.hasNext()) {
			System.out.print(i.next());
		}

		System.out.println(ss.takeSize());
	}
}