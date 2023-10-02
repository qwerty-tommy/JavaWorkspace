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

		System.out.println("*** 자바항공에 오신것을 환영합니다. ***");
		System.out.println();

		do {
			System.out.println("== 예약:1 취소:2 현황:3 종료:4 >>");
			intBuf = sc.nextInt();

			switch (intBuf) {
			case 1:
				System.out.print("1호기 2호기 3호기  >> ");
				airplaneNum = sc.nextInt();
				System.out.print(airplaneNum+"호기 ");
				for (int i = 0; i < al.list[airplaneNum].list.length; i++) {
					System.out.print(al.list[airplaneNum].list[i].getName()+"  ");
				}
				System.out.print("\n좌석번호 >>");
				intBuf=sc.nextInt();
				sc.nextLine();
				System.out.print("이름입력 >>");
				strBuf=sc.nextLine();
				al.list[airplaneNum].list[intBuf].setName(strBuf);
				break;
			case 2:
				System.out.print("1호기 2호기 3호기  >> ");
				airplaneNum = sc.nextInt();
				System.out.print(airplaneNum+"호기 ");
				for (int i = 0; i < al.list[airplaneNum].list.length; i++) {
					System.out.print(al.list[airplaneNum].list[i].getName()+"  ");
				}
				System.out.print("\n좌석번호 >>");
				intBuf=sc.nextInt();
				sc.nextLine();
				System.out.print("이름입력 >>");
				strBuf=sc.nextLine();
				al.list[airplaneNum].list[intBuf].setName("____");
				break;
			case 3:
				System.out.println("좌석현황");
				for (airplaneNum = 0; airplaneNum < al.list.length; airplaneNum++) {
					System.out.print(airplaneNum+"호기 ");
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
