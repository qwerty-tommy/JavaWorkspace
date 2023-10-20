package pack_interface;

import java.util.Scanner;

interface feedable {
	void feed(Animal animal);
}

class Animal {
	String name;
	String food;

	public void setName(String name) {
		this.name = name;
	}
}

class Lion extends Animal {
	public Lion() {
		super.name = "lion";
		super.food = "banana";
	}
}

class Tiger extends Animal {
	public Tiger() {
		super.name = "tiger";
		super.food = "apple";
	}
}

class NewCarnivore extends Animal {
	public NewCarnivore() {
		super.name = "carnivore";
		super.food = "newfood";
	}
}

class ZooKeeper implements feedable {
	@Override
	public void feed(Animal animal) {
		System.out.println(animal.name + "�� ������ " + animal.food + "�� �ش�.");
	}
}

public class Ex06_FeedAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] animal = new Animal[5];
		ZooKeeper zooKeeper = new ZooKeeper();

		int flag;
		int loopCount = 0;

		while (loopCount != 5) {
			System.out.println("� ������ ���Դٸ�.. 1.���� 2.ȣ���� 3.�ٸ����ĵ���");
			flag = sc.nextInt();
			switch (flag) {
			case 1:
				animal[loopCount]=new Lion();
				break;
			case 2:
				animal[loopCount]=new Tiger();
				break;
			case 3:
				animal[loopCount]=new NewCarnivore();
				break;
			default:
				break;
			}
			if (flag==0) {
				break;
			}
			
			zooKeeper.feed(animal[loopCount]);
			loopCount++;
		}

		sc.close();
	}
}
