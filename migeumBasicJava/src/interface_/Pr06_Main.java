package interface_;

interface TypeOfFood{
	String getFood();
}

class Animal{
	String name;
	Animal(String name) {
		this.name=name;
	}
	
	
}

class Tiger extends Animal implements TypeOfFood{
	public Tiger(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return "사과";
	}
	
}

class Lion extends Animal implements TypeOfFood{
	
	public Lion(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return "바나나";
	}
}

class ZooKeeper{
	ZooKeeper(){
		System.out.println("I'm zookeeper");
	}
	
	public void feed(TypeOfFood f) {
		System.out.println(f.getFood()+"던져준다");
	}
}

public class Pr06_Main {

	public static void main(String[] args) {
		ZooKeeper zooKeeper=new ZooKeeper();
		Tiger tiger=new Tiger("호랑이");
		Lion lion=new Lion("사자");

		System.out.print("호랑이가 오면 ");
		zooKeeper.feed(tiger);
		
		System.out.print("사자가 오면 ");
		zooKeeper.feed(lion);
	}

}
