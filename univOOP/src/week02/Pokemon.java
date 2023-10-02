package week02;

import java.util.Scanner;

public class Pokemon {
	private int id;
	private String name;
	private int attack;
	private int defense;
	private int hp;
	private String type;

	public Pokemon() {}

	void read(Scanner scan, int idInput) {
		id = idInput;
		name = scan.next();
		attack = scan.nextInt();
		defense = scan.nextInt();
		hp = scan.nextInt();
		type = scan.next();
	}

	void print() {	//���ڿ��� �ʹ� ������� ����ĭ���� �ѱ�
		System.out.println(
			id + " " + name + " " + 
			attack + " " + defense +
			" " + hp + " " + type);
	}
	
	boolean matches(String... keywords) {	//�������ڸ� ���� ���� Ű���带 �ٷ�
	    for (String kwd : keywords) {
	        if (kwd.equals(name) || 
	        	kwd.equals(Integer.toString(id)) || 
	        	kwd.equals(type)) {
	            return true;
	        }
	    }
	    return false;
	}
	







//	boolean matches(String kwd) {
//		// return name.equals(kwd) || Integer.toString(id).equals(kwd);
//		return kwd.equals(name) || //���ǽ��� �ʹ� �� ����ĭ���� �ѱ�
//			kwd.equals("" + id) || 
//			kwd.equals(type);
//	}
}
