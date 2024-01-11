package ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Manageable {
	String name;
	String phone;
	ArrayList<String> registeredCodes = new ArrayList<>();

	@Override
	public void read(Scanner scan) {
		name = scan.next();
		phone = scan.next();
		String code;
		Message message = null;
		while (true) {
			code = scan.next();
			if (code.equals("0"))
				break;
			message = (Message) Department.msgMgr.find(code);
			if (message == null)
				System.out.println("[null: " + code+"]");
			else
				registeredCodes.add(message.code);
		}
	}

	@Override
	public void print() { // Student
		System.out.format("%s %s ", name, phone);
		for (String myMsg : registeredCodes) {
			System.out.print(myMsg + " ");
		}
		System.out.println();
	}

	@Override
	public boolean matches(String kwd) {
		return name.contentEquals(kwd);
	}
}