package _interface;

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
		return "���";
	}
	
}

class Lion extends Animal implements TypeOfFood{
	
	public Lion(String name) {
		super(name);
	}

	@Override
	public String getFood() {
		return "�ٳ���";
	}
}

class ZooKeeper{
	ZooKeeper(){
		System.out.println("I'm zookeeper");
	}
	
	public void feed(TypeOfFood f) {
		System.out.println(f.getFood()+"�����ش�");
	}
}

public class Pr06_Main {

	public static void main(String[] args) {
		ZooKeeper zooKeeper=new ZooKeeper();
		Tiger tiger=new Tiger("ȣ����");
		Lion lion=new Lion("����");

		System.out.print("ȣ���̰� ���� ");
		zooKeeper.feed(tiger);
		
		System.out.print("���ڰ� ���� ");
		zooKeeper.feed(lion);
	}

}
