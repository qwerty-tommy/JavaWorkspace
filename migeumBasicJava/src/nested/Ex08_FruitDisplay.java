package nested;

interface Kind_Fruit{
	public void disp();
}

public class Ex08_FruitDisplay {

	public static void main(String[] args) {
		Kind_Fruit fruit1=new Kind_Fruit() {
			
			@Override
			public void disp() {
				System.out.println("apple");
			}
		};
		
		Kind_Fruit fruit2=new Kind_Fruit() {
			
			@Override
			public void disp() {
				System.out.println("banana");
			}
		};
		
		fruit1.disp();
		fruit2.disp();
	}

}
