package week12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RandSelector implements Iterable<Student> {
	Collection<Student> myList = null;

	RandSelector(Collection<Student> mList) {
		myList = mList;
	}

	@Override
	public Iterator<Student> iterator() {
// TODO Auto-generated method stub
		return new RandIterator();
	}

	private class RandIterator implements Iterator<Student> {
		List<Student> shuffleList;

		RandIterator() {
			shuffleList = new ArrayList<>(myList);
			Collections.shuffle(shuffleList);
		}

		public boolean hasNext() {
			return shuffleList.size() > 0;
		}

		public Student next() {
			Student st = shuffleList.get(0);
			shuffleList.remove(st);
			return st;
		}
	}
}