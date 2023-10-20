package _APIClass2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr15 {
	public static void main(String[] args) {
		String reg = "^[a-zA-Z]{1}+[a-zA-Z0-9]{7,11}$";
		Scanner s = new Scanner(System.in);

		System.out.println("ID를 입력하세요 : ");
		String input = s.next();

		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(input);

		Boolean flag = false;
		while (m.find())
			flag = true;
		
		if (flag)
			System.out.println("ID로 사용할 수 있습니다.");
		else
			System.out.println("ID로 사용할 수 없습니다.");

	}
}
