package collectionFramework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		Ex05 s = new Ex05();
		s.checkHashMap();
	}

	public void checkHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "aaa");
		map.put("B", "bbb");
		map.put("C", "ccc");
		map.put("D", "ddd");
		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Map.Entry<String, String> tmp : entry) {
			System.out.println(tmp.getKey() + " " + tmp.getValue());
		}
	}
}
