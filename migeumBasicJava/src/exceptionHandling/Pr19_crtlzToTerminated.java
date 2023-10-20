package exceptionHandling;

import java.util.Scanner;

public class Pr19_crtlzToTerminated {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String id;
		try {
			while (true) {
				id=in.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
