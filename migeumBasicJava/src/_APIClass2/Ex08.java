package _APIClass2;

import java.util.Objects;

public class Ex08 {
	static String rName;

	public static void main(String[] args) {
		String name = null;
		setName(name);
	}

	public static void setName(String name) {
		rName = Objects.requireNonNull(name, "No named~");
	}
}
