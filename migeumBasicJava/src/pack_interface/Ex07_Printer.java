package pack_interface;

interface Printer{
	void print();
}

class InkjetPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("��ũ�������ͷ� �μ��ϰ� �ֽ��ϴ�.");	
	}
}

class LaserPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("�����������ͷ� �μ��ϰ� �ֽ��ϴ�.");	
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
