package day01;

import java.util.Scanner;

public class Ex02CircleArea {
	final static double PI=3.14;
	
	public static Double calRectangleArea(Double w, Double h) {
		return w*h;
	}
	
	public static Double calCircleArea(Double r) {
		return PI*r*r;
	}
	
	public static void main(String[] args) {
		Scanner scanny=new Scanner(System.in);
		
		System.out.println("원의 반지름 : "+calCircleArea(scanny.nextDouble()));
		System.out.println("직사각형의 반지름 : "+calRectangleArea(scanny.nextDouble(),scanny.nextDouble()));
	}
}
