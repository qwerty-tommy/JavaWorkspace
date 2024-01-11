package lambda;

import java.util.function.Consumer;

class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

}

class Memeber {
	private String name;
	private String id;
	private Address address;

	public Memeber(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}

public class Ex23 {
	public static void main(String[] args) {
		Consumer<Memeber> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};

		Consumer<Memeber> consumerB = (m) -> {
			System.out.println("consumerB : " + m.getId());
		};

		Consumer<Memeber> consumerAB = consumerA.andThen(consumerB);

		consumerAB.accept(new Memeber("홍길동", "asdf", new Address("한국", "성남")));

	}
}
