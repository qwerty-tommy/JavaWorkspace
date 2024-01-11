package ch05;

public class IntegerArrayList implements IntegerListInterface {
	private Integer[] item;
	private int numItems;
	private static final int DEFAULT_CAPACITY = 64;
	private static final int NOT_FOUND = -1;

	public IntegerArrayList() { // 생성자 1
		item = new Integer[DEFAULT_CAPACITY];
		numItems = 0;
	}

	public IntegerArrayList(int n) { // 생성자 2
		item = new Integer[n];
		numItems = 0;
	}

	@Override
	public void add(int k, Integer x) {
		if (numItems >= item.length || k < 0 || k > numItems) {
			System.out.println("배열 용량 초과");
		} // 배열 용량 초과
		else {
			for (int i = numItems - 1; i >= k; i--)
				item[i + 1] = item[i]; // shift right
			item[k] = x;
			numItems++;
		}

	}

	@Override
	public void append(Integer x) {
		if (numItems >= item.length) {
			System.out.println("DEFAULT_CAPACITY 초과");
		} else
			item[numItems++] = x;

	}

	@Override
	public Integer remove(int k) {
		if (isEmpty() || k < 0 || k > numItems - 1)
			return null;
		else {
			Integer tmp = item[k];
			for (int i = k; i <= numItems - 2; i++)
				item[i] = item[i + 1]; // shift left
			numItems--;
			return tmp;
		}

	}

	@Override
	public boolean removeItem(Integer x) {
		int k = 0;
		while (k < numItems && item[k] != x)
			k++;
		if (k == numItems)
			return false;
		else {
			for (int i = k; i <= numItems - 2; i++)
				item[i] = item[i + 1]; // shift left
			numItems--;
			return true;
		}

	}

	@Override
	public Integer get(int i) {
		if (i >= 0 && i <= numItems - 1)
			return item[i];
		else
			return null;
	}

	@Override
	public void set(int i, Integer x) {
		if (i >= 0 && i <= numItems - 1)
			item[i] = x;
		else {
			/* 에러 처리 */ }
	}

	@Override
	public int indexOf(Integer x) {
		int i = 0;
		while (i < numItems && item[i] != x)
			i++;
		if (i == numItems)
			return NOT_FOUND;
		else
			return i; // x = item[i]는 i번 원소

	}

	@Override
	public int size() {
		return numItems;

	}

	@Override
	public boolean isEmpty() {
		return (numItems == 0);

	}

	@Override
	public void clear() {
		item = new Integer[item.length];
		numItems = 0;

	}

	@Override
	public String toString() {
		String buf = "";

		for (Integer element : item) {
			if (element == null)
				break;
			buf += element + " ";
		}

		return buf;
	}
}
