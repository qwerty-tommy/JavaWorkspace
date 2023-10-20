package week06BookStore;

import java.util.Scanner;

interface Manageable {

	public void read(Scanner scan);
	public void print();
	boolean matches(String kwd);
}
