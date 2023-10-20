package nested;

class Item{
	class Fruit{
		private String name;
		private int type;
		private int price;
		public Fruit(String name, int type, int price) {
			this.name=name;
			this.type=type;
			this.price=price;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public int getType() {
			return type;
		}
		
	}	
}

public class Ex05_Fruit {

	public static void main(String[] args) {
		Item item=new Item();
		Item.Fruit fruit=item.new Fruit("apple",1,1000);
		System.out.println("name="+fruit.getName()+", type="+fruit.getType()+", price="+fruit.getPrice());
	}

}
