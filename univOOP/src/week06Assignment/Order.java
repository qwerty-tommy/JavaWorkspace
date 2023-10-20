package week06Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Order implements Manageable {
	int orderId;
	User user;
	String date;
	int point;
	int total;
	ArrayList<OrderItem> orderItemList = new ArrayList<>();

	public void read(Scanner scan) {
		orderId = scan.nextInt();
		user = Store.findUser(scan.next());
		date = scan.next();

		String code;

		while (true) {
			OrderItem orderItem = new OrderItem();
			code = scan.next();
			if (code.equals("0"))
				break;
			orderItem.read(scan, code);
		}

		for (OrderItem item : orderItemList) {
			total += item.getSubtotal();
		}

		point = total / 20; // 주어진 출력값에 맞춰서 포인트 비율 조절

		user.addOrder(this);
	}

	@Override
	public boolean matches(String kwd) {
		if (kwd.equals(orderId + ""))
			return true;

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매총액+"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) >= total;

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매총액-"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) <= total;

		return false;
	}

	@Override
	public void print() {
		System.out.println("[주문아이디: " + orderId + "] " + date + 
				"  사용자:" + user.id + " - 주문금액: " + total + " (포인트: "
				+ point + "점)");
		for (OrderItem orderItem : orderItemList) {
			System.out.print("    ");
			orderItem.print();
		}
	}

	class OrderItem {
		Item item;
		int count;

		void read(Scanner scan, String code) {
			item = Store.findItem(code);
			count = scan.nextInt();
			orderItemList.add(this);
		}

		boolean matches(String kwd) {
			return item.matches(kwd);
		}

		void print() {
			System.out.println(item.name + " " + item.price + "원 x  " + 
					count + "개 = " + item.price * count + "원");
		}

		int getSubtotal() {
			return item.price * count;
		}
	}
}