package week06Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Manageable {
	String id;
	String pwd;
	int point;
	int total;
	ArrayList<Order> orderList = new ArrayList<>();

	public void read(Scanner scan) {
		id = scan.next();
		pwd = scan.next();
		point = scan.nextInt(); // 1%
	}

	public boolean matches(String kwd) {
		if (id.equals(kwd))
			return true;

		if (kwd.length() > 4 && kwd.substring(0, 4).equals("포인트+"))
			return Integer.parseInt(kwd.substring(4, kwd.length())) <= point;

		if (kwd.length() > 4 && kwd.substring(0, 4).equals("포인트-"))
			return Integer.parseInt(kwd.substring(4, kwd.length())) >= point;

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매총액+"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) <= total;

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매총액-"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) >= total;

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매횟수+"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) <= orderList.size();

		if (kwd.length() > 5 && kwd.substring(0, 5).equals("구매횟수-"))
			return Integer.parseInt(kwd.substring(5, kwd.length())) >= orderList.size();

		return false;
	}

	public void print() {
		System.out.format("[%s] %d회 총구매액 %d원 (포인트 %d점)\n", id, orderList.size(), total, point);
		for (Order order : orderList) {
			System.out.print("   ");
			order.print();
		}
	}

	public void addOrder(Order order) {
		orderList.add(order);
		point += order.point;
		total += order.total;
	}
}
