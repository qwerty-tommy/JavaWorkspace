package _APIClass1;

public class Pr34_primitiveBoxing {

	public static void main(String[] args) {	//��ó��..
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		System.out.println(obj1 + obj2 + obj3);

		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value1 + value2 + value3);

	}

}
