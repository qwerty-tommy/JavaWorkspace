package week06Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Manageable> itemList = new ArrayList<>();
	static ArrayList<Manageable> userList = new ArrayList<>();
	static ArrayList<Manageable> orderList = new ArrayList<>();

	void run() {
		readAllFile("items.txt", itemList, 1);
		readAllFile("user-info.txt", userList, 2);
		readAllFile("order.txt", orderList, 3);
		menu();
	}

	void menu() {
		int num;
		while (true) {
			System.out.print("(1)물품출력 (2)사용자출력 (3)주문출력 (4)검색 (0) 종료 ");
			num = scan.nextInt();
			switch (num) {
			case 1:
				printAll(itemList);
				break;
			case 2:
				printAll(userList);
				break;
			case 3:
				printAll(orderList);
				break;
			case 4:
				searchMenu();
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	}

	void searchMenu() {
		int num;
		while (true) {
			System.out.print("(1)물품검색 (2)사용자검색 (3)주문검색 (4)이전 ");
			num = scan.nextInt();
			switch (num) {
			case 1:
				searchAll(itemList);
				break;
			case 2:
				searchAll(userList);
				break;
			case 3:
				searchAll(orderList);
				break;
			case 4:
				menu();
				break;
			default:
				break;
			}
		}
	}

	void searchAll(ArrayList<Manageable> mList) {
		String kwd = null;
		while (true) {
			System.out.print(">> ");
			kwd = scan.next();
			if (kwd.contentEquals("end"))
				break;
			for (Manageable m : mList) {
				if (m.matches(kwd))
					m.print();
			}
		}
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (IOException e) {
			System.out.println("파일 입력 오류");
			System.exit(0);
		}
		return filein;
	}

	void readAllFile(String filename, ArrayList<Manageable> mList, int type) {
		Scanner filein = openFile(filename);
		Manageable m = null;
		while (filein.hasNext()) {
			switch (type) {
			case 1:
				m = (Manageable) new Item();
				break;
			case 2:
				m = (Manageable) new User();
				break;
			case 3:
				m = (Manageable) new Order();
				break;
			}
			m.read(filein);
			mList.add(m);
		}
	}

	static Manageable find(String kwd, ArrayList<Manageable> mList) {
		for (Manageable m : mList) {
			if (m.matches(kwd))
				return m;
		}
		return null;
	}

	static Item findItem(String kwd) {
		return (Item) find(kwd, itemList);
	}

	static User findUser(String kwd) { // Order 객체 생성 시 필요
		return (User) find(kwd, userList);
	}

	void printAll(ArrayList<Manageable> mList) {
		for (Manageable m : mList) {
			m.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store m = new Store();
		m.run();
	}
}
