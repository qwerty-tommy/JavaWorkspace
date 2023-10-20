package nestedInterface;

class Basket {
	int counter;

	public Basket() {
		this.counter = 0;
	}

	class Fruit {
		private String name;
		private int type;
		private int price;

		public Fruit(String name, int type, int price) {
			this.name = name;
			this.type = type;
			this.price = price;
		}

		@Override
		public String toString() {
			return "item [name=" + this.name + 
					",type=" + this.type + 
					",price=" + this.price + "]";
		}
	}

	Fruit fruits[] = new Fruit[10];

	void show() {
		for (int i = 0; i < this.counter; i++) {
			System.out.println(fruits[i]);
		}
	}

	void add(String name, int type, int price) {
		this.fruits[counter++] = new Fruit(name, type, price);
	}
}

public class Pr05 {

	public static void main(String[] args) {
		Basket basket=new Basket();
		
		basket.add("Apple", 1, 1000);
		basket.add("Banana", 2, 2000);
		basket.add("Orange", 2, 3000);
		
		basket.show();
	}

}
