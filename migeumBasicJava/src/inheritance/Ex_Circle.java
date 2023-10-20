package inheritance;

import java.util.Scanner; 

public class Ex_Circle {
	public static String comp(NamedCircle[] nc) {
		int index = 0;
		for (int i = 0; i < 4; i++) {
			if (nc[i].radius >= nc[i + 1].radius) {
				index = i;
			}
		}
		return nc[index].name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("5 개의 정수 반지름과 피자의 이름을 입력하시오=>");

		NamedCircle[] nc = new NamedCircle[5];
		int r;
		String name;

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + ">>");
			r = sc.nextInt();
			name = sc.nextLine();

			nc[i] = new NamedCircle(r, name);
		}

		System.out.println(nc[0].name + nc[1].name + nc[2].name + nc[3].name + nc[4].name);
		System.out.println("=>가장 면적이 넓은 피자는" + comp(nc) + "입니다.");

		sc.close();
	}
}

/*
 * 5 크림피자 8 치즈피자 25 대왕피자 30 블랙홀피자 15 마늘피자
 */