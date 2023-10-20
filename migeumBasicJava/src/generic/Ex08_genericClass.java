package generic;

class Util8 {
	public static <T extends String> boolean equal(T t1, T t2) {
		if (t1.equals(t2))
			return true;
		else
			return false;
	}
}

public class Ex08_genericClass {

	public static void main(String[] args) {
		if (Util8.equal("apple", "apple")) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

//		if (Util8.equal(10, 20)) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
		
	}

}
