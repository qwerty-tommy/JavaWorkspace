package week06Assignment;

import java.util.Scanner;

interface Manageable {

	public void read(Scanner scan);

	boolean matches(String kwd);

	public void print();
}
