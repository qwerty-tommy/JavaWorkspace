package _APIClass2;

import java.util.StringTokenizer;

public class Pr04 {
	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
	}
}
