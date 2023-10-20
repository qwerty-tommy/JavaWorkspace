package _APIClass1;

class Car15 {
}

public class Pr15_class1 {

	public static void main(String[] args) {
		Car15 car = new Car15();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("classAPI.Car15");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace(); // ..?
		}
	}

}
