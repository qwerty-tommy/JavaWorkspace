package week02;

public class MainPokemon {

	void start() {
		PokemonList pokemonList = new PokemonList();
		pokemonList.readAll();
		pokemonList.printAll();
		pokemonList.search();
	}

	public static void main(String[] args) {
		MainPokemon main = new MainPokemon();
		main.start();
	}

}
