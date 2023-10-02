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
	private PokemonTrainer myTrainer; // ���ϸ� �� ������ Ʈ���̳� �Ѹ����

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
			type2 = null; // �Ӽ��� 1���̰ų� 2���̹Ƿ�
		} else {
			scan.next(); // ���ۺ���
		}
	}

	void print() {
		System.out.printf("[%d] %s (%s", id, name, type1);

		if (type2 != null) {
			System.out.printf(", %s", type2);
		}

		System.out.printf(") ���ݷ�[%d] ����[%d] ü��[%d]", ATK, DEF, HP);

		if (myTrainer != null) {
			System.out.printf("\t[%s]", myTrainer.name);
		}
		System.out.println();
	}

	boolean matches(String kwd) {
		if (type2 != null && type2.contains(kwd)) {	//type2 �� ���� ���� �ֱ� ������ �и�
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
