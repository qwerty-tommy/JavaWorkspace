package week06Store;

import java.util.Scanner;

interface Manageable {

	public void read(Scanner scan);
	public void print();
	boolean matches(String kwd);
}
