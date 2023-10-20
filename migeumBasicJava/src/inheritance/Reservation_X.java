package inheritance;

import java.util.Scanner;

class Seat {
	private String name;

	Seat() {
		name = "____";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

class Airplane extends Seat {
	Seat[] list = new Seat[8];
	
	public Airplane() {
		init();
	}

	void init() {
		for (int i = 0; i < 8; i++) {
			list[i] = new Seat();
		}
	}
}

class Airline extends Airplane {
	Airplane[] list = new Airplane[3];

	Airline() {
		init_Airline();
	}
	
	void init_Airline() {
		for (int i = 0; i < 3; i++) {
			list[i] = new Airplane();
		}
	}
}

public class Reservation_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Airline al=new Airline();
		
		int airplaneNum;
		int intBuf;
		String strBuf;

		System.out.println("*** �ڹ��װ��� ���Ű��� ȯ���մϴ�. ***");
		System.out.println();

		do {
			System.out.println("== ����:1 ���:2 ��Ȳ:3 ����:4 >>");
			intBuf = sc.nextInt();

			switch (intBuf) {
			case 1:
				System.out.print("1ȣ�� 2ȣ�� 3ȣ��  >> ");
				airplaneNum = sc.nextInt();
				System.out.print(airplaneNum+"ȣ�� ");
				for (int i = 0; i < al.list[airplaneNum].list.length; i++) {
					System.out.print(al.list[airplaneNum].list[i].getName()+"  ");
				}
				System.out.print("\n�¼���ȣ >>");
				intBuf=sc.nextInt();
				sc.nextLine();
				System.out.print("�̸��Է� >>");
				strBuf=sc.nextLine();
				al.list[airplaneNum].list[intBuf].setName(strBuf);
				break;
			case 2:
				System.out.print("1ȣ�� 2ȣ�� 3ȣ��  >> ");
				airplaneNum = sc.nextInt();
				System.out.print(airplaneNum+"ȣ�� ");
				for (int i = 0; i < al.list[airplaneNum].list.length; i++) {
					System.out.print(al.list[airplaneNum].list[i].getName()+"  ");
				}
				System.out.print("\n�¼���ȣ >>");
				intBuf=sc.nextInt();
				sc.nextLine();
				System.out.print("�̸��Է� >>");
				strBuf=sc.nextLine();
				al.list[airplaneNum].list[intBuf].setName("____");
				break;
			case 3:
				System.out.println("�¼���Ȳ");
				for (airplaneNum = 0; airplaneNum < al.list.length; airplaneNum++) {
					System.out.print(airplaneNum+"ȣ�� ");
					for (int i = 0; i < al.list[airplaneNum].list.length; i++) {
						System.out.print(al.list[airplaneNum].list[i].getName()+"  ");
					}
					System.out.println();
				}
				break;
			}
			if (intBuf == 4)
				break;
			System.out.println("\n");
		} while (true);

		sc.close();
	}

}
