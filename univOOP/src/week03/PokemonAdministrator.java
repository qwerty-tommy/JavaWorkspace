package week03;

import java.util.ArrayList;
import java.util.Scanner;

class PokemonAdministrator {
	Scanner scan = new Scanner(System.in);
	ArrayList<Pokemon> pokemonList = new ArrayList<>();
	ArrayList<PokemonTrainer> traninerList = new ArrayList<>();

	void run() {
		int menu;
		readAllPokemons();
		readTrainer();
		while (true) {

			System.out.println("===================================");
			System.out.println("(1) 전체 출력\n(2) 팀 출력\n(3) 포켓몬 검색");
			System.out.println("(4) 플레이어 키워드 검색\n(0) 종료");
			System.out.println("===================================");
			System.out.print("입력 : ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				printAllPokemons();
				break;
			case 2:
				printTranier();
				break;
			case 3:
				search();
				break;
			case 4:
				searchTranier();
				break;
			default:
				return;
			}
		}
	}

	void readAllPokemons() {
		Pokemon pokemon = null;
		int idInput;
		while (true) {
			idInput = scan.nextInt();
			if (idInput == 0)
				break;
			pokemon = new Pokemon();
			pokemon.read(scan, idInput);
			pokemonList.add(pokemon);
		}
	}

	void printAllPokemons() {
		for (Pokemon pokemon : pokemonList) {
			pokemon.print();
		}
	}

	void search() {
		String line = null;
		line = scan.nextLine();
		String[] kwdArr;
		while (true) {
			System.out.print("포켓몬 키워드 :");
			line = scan.nextLine();
			kwdArr = line.trim().split(" ");
			if (kwdArr[0].equals("end"))
				break;
			for (Pokemon pokemon : pokemonList) {
				if (pokemon.matches(kwdArr))
					pokemon.print();
			}
		}
	}

	// 트레이너 관련 코드
	void readTrainer() {
		String name;
		PokemonTrainer t;
		while (true) {
			name = scan.next();
			if (name.contentEquals("end"))
				break;
			t = new PokemonTrainer(name);
			t.read(scan, this);
			traninerList.add(t);
		}
	}

	void printTranier() {
		for (PokemonTrainer trainer : traninerList)
			trainer.print();
	}

	void searchTranier() {
		String kwd;
		scan.nextLine();
		while (true) {
			System.out.print("트레이너의 키워드 : ");
			kwd = scan.nextLine();
			kwd = kwd.trim();
			if (kwd.equals("end"))
				break;
			for (PokemonTrainer trainer : traninerList) {
				if (trainer.matches(kwd))
					trainer.print();
			}
		}
	}

	// 트레이너 클래스에서 입력받을 때 포켓몬 객체에도 정보를 넘겨주기 위함
	Pokemon findPokemon(int pokemonNumber) {
		if (pokemonNumber <= 0 || pokemonNumber > pokemonList.size()) {
			return null;
		}
		return pokemonList.get(pokemonNumber - 1);
	}

}
