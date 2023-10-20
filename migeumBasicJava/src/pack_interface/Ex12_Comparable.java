package pack_interface;

class Circle implements Comparable<Circle>{
	int r;
	double area;
	
	@Override
	public int compareTo(Circle o) {
		return (int)(this.area-o.area);
	}
	
	
	public Circle(int r) {
		this.r =r;
		this.area=r*r*3.14;
	}
}

public class Ex12_Comparable {
	
	public static void main(String[] args) {
		Circle c1=new Circle(2);
		Circle c2=new Circle(3);
		
		System.out.println(c1.compareTo(c2));	
	}
}
