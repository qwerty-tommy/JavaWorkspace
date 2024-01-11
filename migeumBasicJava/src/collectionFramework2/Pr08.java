package collectionFramework2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(age);
	}

	@Override
	public boolean equals(Object obj) {
		Person others = (Person) obj;
		return name.contentEquals(others.name) && age == others.age;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}

public class Pr08 {
	public static void main(String[] args) {
		Set<Person> hSet = new HashSet<>();

		hSet.add(new Person("이진호", 10));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		hSet.add(new Person("김명호", 15));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));

		System.out.println("저장된 데이터 수 : " + hSet.size());
		for (Person person : hSet) {
			System.out.println(person);
		}
	}
}
