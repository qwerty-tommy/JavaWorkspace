package generic;

class Order<K, V> {
	private K key;
	private V value;

	public Order(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}

public class Ex03_polyTypeGeneric {

	public static void main(String[] args) {
		Order<String, Integer> p1 = new Order<String, Integer>("mykey", 123456);
		Order<String, String> p2 = new Order<String, String>("java", "a programming Language");

		System.out.println(p1.getKey() + "  " + p1.getValue());
		System.out.println(p2.getKey() + "  " + p2.getValue());

	}

}
