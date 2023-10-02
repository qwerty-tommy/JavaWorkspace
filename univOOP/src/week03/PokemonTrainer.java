package week03;

import java.util.ArrayList;
import java.util.Scanner;

class PokemonTrainer {
	String name;
	ArrayList<Pokemon> myPokemon = new ArrayList<>();

	PokemonTrainer(String name) {
		this.name = name;
	}

	void read(Scanner scan, PokemonAdministrator pokmonlist) {
		int pokemonNumber;
		Pokemon pokemon = null;
		for (int i = 0; i < 5; i++) {
			pokemonNumber = scan.nextInt();
			pokemon = pokmonlist.findPokemon(pokemonNumber);
			pokemon.setMyTrainer(this);
			myPokemon.add(pokemon);
		}
	}

	void print() {
		System.out.printf("%s: ", name);
		for (Pokemon pokemon : myPokemon) {
			System.out.printf("%s ", pokemon.name);
		}
		System.out.println();
	}
	

	boolean matches(String kwd) {
		if (name.contentEquals(kwd)) {
			return true;
		}
		for (Pokemon pokemon : myPokemon)
			if (pokemon.matches(kwd))
				return true;

		return false;
	}

}