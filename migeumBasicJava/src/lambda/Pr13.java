package lambda;

import java.util.function.Function;

public class Pr13 {
	public static void main(String[] args) {
		Address member = new Address("한국", "분당");
		Function<Address, String> countryFunction = a -> a.getCountry();

		System.out.println(countryFunction.apply(member));
	}
}
