//package week09;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Order implements Manageable {
//	int orderId;
//	User user;
//	String date;
//	int point;
//	int total;
//	ArrayList<OrderItem> orderItemList = new ArrayList<>();
//	// (4주 과제) 합계 및 포인트 처리부 추가해야 함
//	public void read(Scanner scan) {
//		// 3 park 20201010 O F3124 3 F3223 1 0
//		orderId = scan.nextInt();
//		String userId = scan.next();
//		date = scan.next();
//	    OrderItem oi = null;
//	    String code = null;
//	    while (true) {
//	    	code = scan.next();
//	    	if (code.contentEquals("0"))
//	    		break;
//			oi = new OrderItem();
//			oi.read(scan, code);
//			orderItemList.add(oi);
//			total += oi.getSubtotal();
//			point += oi.getSubtotal() * 0.05;
//	    }
//	    user = Store.findUser("" + userId);
//	    if (user == null) {
//	    	System.out.println("사용자 아이디 없음: " + userId);
//	    	System.exit(1);
//	    }
//	    user.addOrder(this);
//	}
//	public boolean matches(String kwd) {
//		int n = 0;
//		if (("" + orderId).equals(kwd))
//		    return true;
//		if (kwd.length() > 3 && date.contains(kwd))
//		    return true;
//		if (user.id.equals(kwd))
//			return true;
//		for (OrderItem oi: orderItemList)
//			if (oi.matches(kwd))
//				return true;
//		return false;
//    }
//	public void print() {
//		print(true);
//	}
//	void print(boolean bDetail) { // Order
//		System.out.format("[주문아이디:%2d] %s 사용자: %5s", 
//				orderId, date, user.id);
//		System.out.printf(" - 주문금액:%6d (포인트: %d점)\n", total, point);
//		if (!bDetail) return;
//		for (OrderItem oi: orderItemList)
//			oi.print();
//	}
//	class OrderItem {
//		Item item;
//		int count;
//		void read(Scanner scan, String code) {
//			item = Store.findItem(code);
//			count = scan.nextInt();
//		}
//		boolean matches(String kwd) {
//			if (item.matches(kwd))
//				return true;
////			if (kwd.compareTo(""+count) <= 0)
////				return true;
//			return false;
//		}
//		void print() {
//		    System.out.printf("\t%s %d원 x %2d개 = %d원\n", item.name, item.price, count, getSubtotal());
//		}
//		int getSubtotal() {
//			return item.price * count;
//		}
//	}
//	public boolean buy(Item item) {
//		// TODO Auto-generated method stub
//		for (OrderItem oi: orderItemList)
//			if (oi.item == item)
//				return true;
//		return false;
//	}
//}