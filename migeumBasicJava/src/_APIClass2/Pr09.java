package _APIClass2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr09 {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다";
		String pattern = "자바";

		StringBuffer sb = new StringBuffer();

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);

		while (m.find())
			m.appendReplacement(sb, "Java");

		m.appendTail(sb);

		System.out.println(sb.toString());
	}
}
