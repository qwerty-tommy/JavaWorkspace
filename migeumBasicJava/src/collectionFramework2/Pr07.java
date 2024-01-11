package collectionFramework2;

import java.util.HashSet;

class MyHashSet extends HashSet<String> {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		String buf = "";
		if (!isEmpty()) {
			buf += "총 객체수 : " + size();
			buf += "\n";
			for (String str : this) {
				buf += str + "\n";
			}
		} else {
			buf = "비어있음\n";
		}
		return buf;
	}

}

public class Pr07 {
	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add("Java");
		set.add("JDBC");
		set.add("Sevlet/JSP");
		set.add("iBATIS");

		System.out.println(set);
		
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}
}
