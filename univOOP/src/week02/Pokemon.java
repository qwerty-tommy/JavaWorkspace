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

	void print() {	//문자열이 너무 길어져서 다음칸으로 넘김
		System.out.println(
			id + " " + name + " " + 
			attack + " " + defense +
			" " + hp + " " + type);
	}
	
	boolean matches(String... keywords) {	//가변인자를 통해 여러 키워드를 다룸
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
//		return kwd.equals(name) || //조건식이 너무 길어서 다음칸으로 넘김
//			kwd.equals("" + id) || 
//			kwd.equals(type);
//	}
}
