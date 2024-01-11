//package week09;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class User implements Manageable {
//	String id;
//	String pwd;
//	int total;
//	int point;
//	ArrayList<Order> orderList = new ArrayList<>();
//	public void read(Scanner scan) {
//		id = scan.next();
//		pwd = scan.next();
//		point = scan.nextInt();  // 5%
//	}
//	public boolean matches(String kwd) {
//		if (id.equals(kwd))
//		    return true;
//		for (Order o: orderList) {
//			if (o.matches(kwd))
//				return true;
//		}
//		return false;
//    }
//
//	public void print() {
//		System.out.format("[%s] %d회 총구매액 %d원 (포인트 %d점)\n", id, 
//				orderList.size(), total, point);
//		for (Order o: orderList) {
//			System.out.print("   ");
//			o.print();
//		}
//	}
//	public boolean buy(Item item) {
//		// TODO Auto-generated method stub
//		for (Order o: orderList) {
//			if (o.buy(item))
//				return true;
//		}
//		return false;
//	}
//	public boolean buy(int n) {
//		// TODO Auto-generated method stub
//		return orderList.size() >= n;
//	}
//	public void addOrder(Order order) {
//		// TODO Auto-generated method stub
//		orderList.add(order);
//		total += order.total;
//		point += order.total * 0.05;
//	}
//}
