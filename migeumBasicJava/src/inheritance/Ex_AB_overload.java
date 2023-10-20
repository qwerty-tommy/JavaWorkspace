package inheritance;

class A1{
	int x;
	int y;
	public A1(int ax,int ay) {
		this.x=ax;
		this.y=ay;
	}
}

class B1 extends A1{
	int x;
	int y;
	
	public B1(int ax,int ay,int bx, int by) {
		super(ax,ay);
		this.x=bx;
		this.y=by;
	}
	public B1(int ax,int ay,int bx) {
		super(ax,ay);
		this.x=bx;
		this.y=0;
	}
	public B1(int ax,int ay) {
		super(ax,ay);
		this.x=0;
		this.y=0;
	}
	public B1(int ax) {
		super(ax,0);
		this.x=0;
		this.y=0;
	}
	public B1() {
		super(0,0);
		this.x=0;
		this.y=0;
	}
	
	public void disp() {
		System.out.println("x="+super.x+" y="+super.y+" x="+this.x+" y="+this.y);
	}
}

public class Ex_AB_overload {

	public static void main(String[] args) {
		B1 bp =new B1();
		B1 bp1 =new B1(10);
		B1 bp2 =new B1(10,20);
		B1 bp3 =new B1(10,20,30);
		B1 bp4 =new B1(10,20,30,40);
		
		bp.disp();
		bp1.disp();
		bp2.disp();
		bp3.disp();
		bp4.disp();
	}

}
