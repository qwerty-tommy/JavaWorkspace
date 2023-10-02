package generic;

import java.util.ArrayList;

class NumberBox <T extends Number>{
	ArrayList<T> box=new ArrayList<T>();

	void add(T item) {
		box.add(item);
	}
	
	@Override
	public String toString() {
		String buf="";
		
		for (T t : box) {
			buf+=t+"\n";
		}
		
		return buf;
	}
}

public class Pr04 {
	public static void main(String[] args) {
		NumberBox<Number> box1=new NumberBox<>();
		box1.add(1);
		box1.add(1.2);
		box1.add((double)1/3);
		box1.add(0x43);
		//box1.add("3");
		
		System.out.println(box1);
	}
}
