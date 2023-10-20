package inheritance;

import java.util.Scanner;

class Inkjet extends Printer {
	private int extraInk;

	public void printInkjet(int pages) {
		super.print(pages);
		extraInk -= pages;
		System.out.println("프린트하였습니다~");
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
		System.out.println("프린트하였습니다~");
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
		Laser l = new Laser("S500", "삼성전자", 3, 20);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("현재 작동중인 2대의 프린터");
		
		System.out.println("잉크젯 : "+i.getModelName()+", "+i.getManufacturer()+", 남은종이 "+i.getExtraNum()+"장, 남은 잉크 "+i.getExtraInk());
		System.out.println("레이저 : "+l.getModelName()+", "+l.getManufacturer()+", 남은종이 "+l.getExtraNum()+"장, 남은 토너 "+l.getExtraToner());
		
		while(true) {
			System.out.print("프린터(1:잉크젯 2:레이저) 와 매수 입력>> ");
			if(sc.nextInt()==1) {
				i.printInkjet(sc.nextInt());
			} else	{
				l.printLaser(sc.nextInt());
			}
			System.out.println("잉크젯 : "+i.getModelName()+", "+i.getManufacturer()+", 남은종이 "+i.getExtraNum()+"장, 남은 잉크 "+i.getExtraInk());
			System.out.println("레이저 : "+l.getModelName()+", "+l.getManufacturer()+", 남은종이 "+l.getExtraNum()+"장, 남은 토너 "+l.getExtraToner());
			System.out.println("계속프린트하시겠습니끼?");
			if(sc.nextLine()=="\n") {
				break;
			}			
		}
		
		sc.close();		
	}

}
