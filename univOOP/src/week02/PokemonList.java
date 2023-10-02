package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonList {
	Scanner scan = new Scanner(System.in);
	ArrayList<Pokemon> pokemons = new ArrayList<>();

	void readAll() {
		Pokemon st = null;
		int idInput;
		while (true) {
			idInput = scan.nextInt();
			if (idInput == 0)	//break���� ���� �ݺ��� Ż��
				break;
			st = new Pokemon();
			st.read(scan, idInput);
			pokemons.add(st);
		}
	}

	void printAll() {
		for (Pokemon st : pokemons) {
			st.print();
		}
	}
	
	void search() {
	String line = null;

	while (true) {
		System.out.print("keyword : ");
		line = scan.nextLine();	//���� ��� �Է¹ޱ�
		if (line.equals("end"))
			break;
		
		String[] keywords = line.split(" ");	//�Է¹��� ���� ���� ���� �и�
		
		for (Pokemon st : pokemons) {
			if (st.matches(keywords))
				st.print();
		}
	}
}
	
//	������ search �ڵ�
//	void search() {
//		String keyword = null;
//
//		while (true) {
//			System.out.print("keyword : ");
//			keyword = scan.next();
//			if (keyword.equals("end"))
//				break;
//			for (Pokemon st : pokemons) {
//				if (st.matches(keyword))
//					st.print();
//			}
//		}
//	}
}
