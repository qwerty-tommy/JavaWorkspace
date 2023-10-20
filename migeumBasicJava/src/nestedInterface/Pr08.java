package nestedInterface;

interface Kind_Fruit{
	public void disp();
}

public class Pr08 {

	public static void main(String[] args) {
		Kind_Fruit kind_Fruit1=new Kind_Fruit(){			
			@Override
			public void disp() {
				System.out.println("apple");
			}
		};
		kind_Fruit1.disp();
		
		Kind_Fruit kind_Fruit2=new Kind_Fruit() {
			@Override
			public void disp() {
				System.out.println("banana");
			}
		};
		kind_Fruit2.disp();
	}

}
