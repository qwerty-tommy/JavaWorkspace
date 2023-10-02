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
			if (idInput == 0)	//break문을 통해 반복문 탈출
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
		line = scan.nextLine();	//한줄 모두 입력받기
		if (line.equals("end"))
			break;
		
		String[] keywords = line.split(" ");	//입력받은 줄을 공백 기준 분리
		
		for (Pokemon st : pokemons) {
			if (st.matches(keywords))
				st.print();
		}
	}
}
	
//	기존의 search 코드
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
