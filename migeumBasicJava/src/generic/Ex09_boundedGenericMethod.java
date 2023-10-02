package generic;

public class Ex09_boundedGenericMethod {

	public static void main(String[] args) {
		int result1 = compare(10, 20);
		System.out.println(result1);
		
		int result2=compare(4.5, 2);
		System.out.println(result2);
	}

	public static <T extends Number, V extends Number> int compare(T t1, V t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		// return Double.compare(v1,v2);
		if (v1 > v2)
			return 1;
		else if (v1 < v2)
			return -1;
		else
			return 0;
	}
}
