package day01;

import java.util.Scanner;

public class Pr02CalNestedArea {

	public static int calRectangleArea(int w, int h) {
		return w*h;
	}
	
	public static void main(String[] args) {
		Scanner scanny=new Scanner(System.in);
		int x11,y11,x12,y12,x21,y21,x22,y22;
		
		
		System.out.print("첫 번째 사각형의 두 모서리 (xl1, yl1)과 (xr1, yr1)을 입력하시오 >> ");
		x11=scanny.nextInt();
		y11=scanny.nextInt();
		x12=scanny.nextInt();
		y12=scanny.nextInt();
		
		System.out.print("두 번째 사각형의 두 모서리 (xl2, yl2)과 (xr2, yr2)을 입력하시오 >> ");
		x21=scanny.nextInt();
		y21=scanny.nextInt();
		x22=scanny.nextInt();
		y22=scanny.nextInt();
		
		int width, height;
		width=(x12<x22?x12:x22)-(x11>x21?x11:x21);
		height=(y12<y22?y12:y22)-(y11>y21?y11:y21);
		
		System.out.println(calRectangleArea(width, height));
		
		scanny.close();
	}
}
