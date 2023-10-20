package polymorphism;

import java.awt.Rectangle;
import java.util.Scanner;

class Shape{
	int x,y;
	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void print() {
		System.out.println("점<x,y> = <"+x+", "+y+">");
	}
}

class Circle extends Shape{
	double r;

	Circle(int x, int y, double r){
		super(x, y);
		this.r=r;
	}
	
	void print() {
		super.print();
		System.out.println("반지름 r="+r);
	}
}

class Ractangle extends Shape{
	int w,h;
	
	Ractangle(int x,int y, int w, int h){
		super(x,y);
		this.w=w;
		this.h=h;
	}
	
	void print() {
		super.print();
		System.out.println("폭="+w+", 높이="+h);
	}
}

public class Ex03_Main {
	static void menu() {
		System.out.print("1.원\t2.사각형\t3.보기\t4.종료 =>");
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Shape[] arr=new Shape[10];
		
		int sel;
		int cnt=-1;

		int x,y;
		double r;
		int w,h;
		
		while (++cnt<10) {
			menu();
			sel=scanner.nextInt();
			
			switch (sel) {
			case 1:
				System.out.print("x=");
				x=scanner.nextInt();
				System.out.print("y=");
				y=scanner.nextInt();
				System.out.print("r=");
				r=scanner.nextInt();	//이거 어색함?
				
				arr[cnt]= new Circle(x,y,r);
				
				break;
				
			case 2:
				System.out.print("x=");
				x=scanner.nextInt();
				System.out.print("y=");
				y=scanner.nextInt();
				System.out.print("w=");
				w=scanner.nextInt();
				System.out.print("h=");
				h=scanner.nextInt();
				
				arr[cnt]= new Ractangle(x,y,w,h);
				break;
				
			case 3:
				for (int i = 0; i < cnt; i++) {
					arr[i].print();					
				}
				cnt--;
				break;
				
			case 4:
				scanner.close();
				return;

			default:
				break;
			}
		}
	}
}
