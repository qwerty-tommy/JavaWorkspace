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
			System.out.println("(1) ��ü ���\n(2) �� ���\n(3) ���ϸ� �˻�");
			System.out.println("(4) �÷��̾� Ű���� �˻�\n(0) ����");
			System.out.println("===================================");
			System.out.print("�Է� : ");
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
			System.out.print("���ϸ� Ű���� :");
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

	// Ʈ���̳� ���� �ڵ�
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
			System.out.print("Ʈ���̳��� Ű���� : ");
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

	// Ʈ���̳� Ŭ�������� �Է¹��� �� ���ϸ� ��ü���� ������ �Ѱ��ֱ� ����
	Pokemon findPokemon(int pokemonNumber) {
		if (pokemonNumber <= 0 || pokemonNumber > pokemonList.size()) {
			return null;
		}
		return pokemonList.get(pokemonNumber - 1);
	}

}
