package inheritance;

import java.util.Scanner;

class Inkjet extends Printer {
	private int extraInk;

	public void printInkjet(int pages) {
		super.print(pages);
		extraInk -= pages;
		System.out.println("����Ʈ�Ͽ����ϴ�~");
	}

	public int getExtraInk() {
		return this.extraInk;
	}

	public Inkjet(String modelName, String manufacturer, int extraPaper, int extraInk) {
		super(modelName, manufacturer, extraPaper);
		this.extraInk = extraInk;
	}
}

class Laser extends Printer {
	private int extraToner;

	public void printLaser(int pages) {
		super.print(pages);
		extraToner -= pages;
		System.out.println("����Ʈ�Ͽ����ϴ�~");
	}

	public int getExtraToner() {
		return this.extraToner;
	}
	
	public Laser(String modelName, String manufacturer, int extraPaper, int extraLaser) {
		super(modelName, manufacturer, extraPaper);
		this.extraToner = extraLaser;
	}
}

public class Printer {
	private String modelName;
	private String manufacturer;
	private int printNum;
	private int extraPaper;

	public void print(int pages) {
		printNum = pages;
		this.extraPaper -= pages;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public int getPrintNum() {
		return this.printNum;
	}
	
	public int getExtraNum() {
		return this.extraPaper;
	}

	public Printer(String modelName, String manufacturer, int extraPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.extraPaper = extraPaper;
	}

	public static void main(String[] args) {
		Inkjet i = new Inkjet("V40", "HP", 5, 10);
		Laser l = new Laser("S500", "�Ｚ����", 3, 20);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���� �۵����� 2���� ������");
		
		System.out.println("��ũ�� : "+i.getModelName()+", "+i.getManufacturer()+", �������� "+i.getExtraNum()+"��, ���� ��ũ "+i.getExtraInk());
		System.out.println("������ : "+l.getModelName()+", "+l.getManufacturer()+", �������� "+l.getExtraNum()+"��, ���� ��� "+l.getExtraToner());
		
		while(true) {
			System.out.print("������(1:��ũ�� 2:������) �� �ż� �Է�>> ");
			if(sc.nextInt()==1) {
				i.printInkjet(sc.nextInt());
			} else	{
				l.printLaser(sc.nextInt());
			}
			System.out.println("��ũ�� : "+i.getModelName()+", "+i.getManufacturer()+", �������� "+i.getExtraNum()+"��, ���� ��ũ "+i.getExtraInk());
			System.out.println("������ : "+l.getModelName()+", "+l.getManufacturer()+", �������� "+l.getExtraNum()+"��, ���� ��� "+l.getExtraToner());
			System.out.println("�������Ʈ�Ͻðڽ��ϳ�?");
			if(sc.nextLine()=="\n") {
				break;
			}			
		}
		
		sc.close();		
	}

}
