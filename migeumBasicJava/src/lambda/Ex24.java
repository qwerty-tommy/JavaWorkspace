package lambda;

import java.util.function.Function;

public class Ex24 {
	public static void main(String[] args) {
		Function<Memeber, Address> functionA = (m) -> m.getAddress();
		Function<Address, String> functionB = (a) -> a.getCity();
		Function<Memeber, String> functionAB = functionA.andThen(functionB);

		String city = functionAB.apply(new Memeber("홍길동", "asdf", new Address("한국", "성남")));
		System.out.println("거주 도시 : " + city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Memeber("홍길동", "asdf", new Address("한국", "성남")));
		System.out.println("거주 도시 : " + city);

	}
}