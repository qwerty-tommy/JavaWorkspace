package pack_interface;

interface Printer{
	void print();
}

class InkjetPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("잉크젯프린터로 인쇄하고 있습니다.");	
	}
}

class LaserPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("레이저프린터로 인쇄하고 있습니다.");	
	}
}


public class Ex07_Printer {

	public static void main(String[] args) {
		Printer[] p=new Printer[5];

		p[0]=new LaserPrinter();
		p[1]=new InkjetPrinter();
		p[2]=new InkjetPrinter();
		p[3]=new InkjetPrinter();
		p[4]=new LaserPrinter();
		
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}	
	}
}
