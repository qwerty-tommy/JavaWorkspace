package inheritance;

import java.util.Scanner;

class Worker {
	private int wage1;
	private int wage2;
	private int wage3;

	public int getSum() {
		return wage1 + wage2 + wage3;
	}

	public int getWage1() {
		return this.wage1;
	}

	public int getWage2() {
		return this.wage2;
	}

	public int getWage3() {
		return this.wage3;
	}

	public Worker(int wage1, int wage2, int wage3) {
		this.wage1 = wage1;
		this.wage2 = wage2;
		this.wage3 = wage3;
	}
}

class WorkerInfo extends Worker {
	private String name;

	public String getName() {
		return this.name;
	}

	public WorkerInfo(int wage1, int wage2, int wage3, String name) {
		super(wage1, wage2, wage3);
		this.name = name;
	}
}

public class WageManange_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WorkerInfo[] wi = new WorkerInfo[100];

		while (true) {
			int workerNum = 0;
			System.out.println("<< 메뉴 >>");
			System.out.println("1. 직원등록");
			System.out.println("2. 급여내역");
			System.out.println("3. 급여총액");
			System.out.println("4. 종료");
			System.out.print("==> ");
			
			int intBuf = sc.nextInt();

//			if (workerNum == 0 && intBuf != 1) {
//				System.out.println("직원등록이 되어있지 않습니다. 등록해주세요");
//				intBuf = 1;
//			}

			switch (intBuf) {
			case 1:
				System.out.print("이름 : ");
				String strBuf = sc.nextLine();
				sc.nextLine();
				System.out.print("급여 : ");
				wi[workerNum] = new WorkerInfo(sc.nextInt(), sc.nextInt(), sc.nextInt(), strBuf);
				System.out.println("등록되었습니다.");
				workerNum++;
				break;
			case 2:
				System.out.println(wi[workerNum].getWage1());
				System.out.println(wi[workerNum].getWage2());
				System.out.println(wi[workerNum].getWage3());
				break;
			case 3:
				System.out.println(wi[workerNum].getSum());
				break;

			default:
				break;
			}

			if (intBuf == 4)
				break;

		}
		
		sc.close();

	}

}
