package nestedInterface;


class Charactor {
	int counter;

	public Charactor() {
		this.counter = 0;
	}

	class item {
		private String name;
		private int type;
		private int price;

		public item(String name, int type, int price) {
			this.name = name;
			this.type = type;
			this.price = price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + this.name + 
					",type=" + this.type + 
					",price=" + this.price + "]";
		}
	}

	item items[] = new item[10];

	void show() {
		for (int i = 0; i < this.counter; i++) {
			System.out.println(items[i]);
		}
	}

	void add(String name, int type, int price) {
		this.items[counter++] = new item(name, type, price);
	}
}

public class Pr06 {
	public static void main(String[] args) {
		Charactor charactor=new Charactor();
		
		charactor.add("Sword", 1, 100);
		charactor.add("Gun", 2, 50);
		
		charactor.show();
	}	
}

