package pack_interface;

interface Repairable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	public Unit(int hp) {
		MAX_HP=hp;
	}
	//...
}

class GroundUnit extends Unit{
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	public Tank() {
		super(150);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "tank";
	}
	//..
}

class Dropship extends AirUnit implements Repairable {
	public Dropship() {
		super(125);
		hitPoint=MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	//..
}

class Marine extends GroundUnit {
	public Marine() {
		super(40);
		hitPoint=MAX_HP;
	}
	//..
}

class SCV extends GroundUnit implements Repairable {
	public SCV() {
		super(60);
		hitPoint=MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u=(Unit)r;
			while (u.hitPoint!=u.MAX_HP) {
				/*Unit의 HP를 증가시킨다.*/
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}
	//..
}

public class Ex08_Starcraft {

	public static void main(String[] args) {
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		Marine marine=new Marine();
		SCV scv=new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);	marine은 repairable인터페이스를 implements하지 못하였고 scv의 repair함수의 매개변수는 repairable인터페이스를 받으므로 marine은 repair함수의 대상이 될 수 없다.
		
	}

}
