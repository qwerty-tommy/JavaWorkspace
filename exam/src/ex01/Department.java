package ex01;

import java.util.Scanner;

public class Department {
	Scanner scan = new Scanner(System.in);
	static Manager foodMgr = new Manager();
	Manager orderMgr = new Manager();

	void run() {
		foodMgr.readAll("foods.txt", () -> new Food());
		// foodMgr.printAll();
		orderMgr.readAll("orders.txt", () -> new Order());
		// orderMgr.printAll();

		int sel;
		String str;
		while (true) {
			System.out.print("(1) 제품검색 (2) 주문검색 (3) 재고부족제품 (4)주문 (5)제품입고 =>");
			sel = scan.nextInt();

			switch (sel) {
			case 1:
				foodMgr.search(scan);
				break;
			case 2:
				orderMgr.search(scan);
				break;
			case 3:
				System.out.print("재고 몇개 이하: ");
				int tmp = scan.nextInt();
				for (Manageable food : foodMgr.mList) {
					((Food) food).printLess(tmp);
				}
				break;
			case 4:
				while (true) {
					System.out.println("제품 검색(끝 end): ");
					str = scan.next();
					if (str.equals("end"))
						break;
					Food food = (Food) foodMgr.find(str);
					if (food == null)
						continue;
					food.print();
					System.out.println("입고 개수 : ");
					tmp = scan.nextInt();
					food.quantity += tmp;
				}
			case 5:
				while (true) {
					System.out.println("전화번호 제품개수 제품명: ");
					Order newbie = new Order();
					newbie.read(scan);
					System.out.println("계속하시겠습니까? (y/n)");
					if(scan.next().equals("y"))
						continue;
					break;
				}
			default:
				break;
			}
		}
	}

//	void addLectures() {
//		Message msg = null;
//		for (Manageable m : msgMgr.mList) {
//			msg = (Message) m;
//			Lecture lecture = (Lecture) lecMgr.find(msg.code);
//			if (lecture == null) {
//				lecture = new Lecture(msg.code);
//				lecMgr.addElement(lecture);
//			}
//			lecture.addMsg(msg);
//		}
//	}

	public static void main(String args[]) {
		Department my = new Department();
		my.run();
	}
}