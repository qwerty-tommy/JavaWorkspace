package day02;

public class Ex03DoWhileSample {
	public static void main(String[] args) {
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1);
		} while (c != 'z' + 1);
	}
}
