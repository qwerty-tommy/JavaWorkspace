//package nested;
//
//class Character {
//
//	class Item {
//		String name;
//		int type;
//		int cost;
//
//		public void printInfo() {
//			System.out.println("Gameitem [name="+this.name+", type="+this.type+", price="+this.cost+"]");
//		}
//		
//		public Item(String name, int type, int cost) {
//			this.name = name;
//			this.type = type;
//			this.cost = cost;
//		}
//	}
//}
//
//public class Ex06_GameItem__����Ŭ�����迭 {
//
//	public static void main(String[] args) {
//		Character character = new Character();
//		Character.Item item1 = character.new Item("Sword", 1, 100);
//		Character.Item item2 = character.new Item("Gun", 2, 50);
//
//		Character.Item items[]= {character.new Item("Knife", 1, 70), character.new Item("Bomb", 3, 500)};
//		
//		item1.printInfo();
//		item2.printInfo();
//		System.out.println(item1.cost+item2.cost);
//		
//		items[0].printInfo();
//		items[1].printInfo();
//	}
//
//}
