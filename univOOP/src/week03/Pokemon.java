package week03;

import java.util.Scanner;

class Pokemon {
	private int id;
	String name;
	private int ATK;
	private int DEF;
	private int HP;
	private String type1;
	private String type2;
	private PokemonTrainer myTrainer; // 포켓못 한 마리당 트레이너 한명배정

	public Pokemon() {
		myTrainer = null;
	}

	void read(Scanner scan, int idInput) {
		id = idInput;
		name = scan.next();
		ATK = scan.nextInt();
		DEF = scan.nextInt();
		HP = scan.nextInt();

		type1 = scan.next();
		type2 = scan.next();
		if (type2.equals("0")) {
			type2 = null; // 속성은 1개이거나 2개이므로
		} else {
			scan.next(); // 버퍼비우기
		}
	}

	void print() {
		System.out.printf("[%d] %s (%s", id, name, type1);

		if (type2 != null) {
			System.out.printf(", %s", type2);
		}

		System.out.printf(") 공격력[%d] 방어력[%d] 체력[%d]", ATK, DEF, HP);

		if (myTrainer != null) {
			System.out.printf("\t[%s]", myTrainer.name);
		}
		System.out.println();
	}

	boolean matches(String kwd) {
		if (type2 != null && type2.contains(kwd)) {	//type2 는 없을 수도 있기 때문에 분리
			return true;
		}

		return name.contains(kwd) || type1.contains(kwd);
	}

	boolean matches(String[] kwds) {
		for (String kwd : kwds) {
			if (kwd.charAt(0) == '-')
				return !matches(kwd.substring(1));

			else if (!matches(kwd))
				return false;
		}
		return true;
	}
	
	void setMyTrainer(PokemonTrainer myTrainer) {
		this.myTrainer = myTrainer;
	}
}
