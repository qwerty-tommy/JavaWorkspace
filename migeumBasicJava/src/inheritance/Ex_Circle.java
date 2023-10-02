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

		System.out.println("5 ���� ���� �������� ������ �̸��� �Է��Ͻÿ�=>");

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
		System.out.println("=>���� ������ ���� ���ڴ�" + comp(nc) + "�Դϴ�.");

		sc.close();
	}
}

/*
 * 5 ũ������ 8 ġ������ 25 ������� 30 ��Ȧ���� 15 ��������
 */