package day01;

import java.util.Scanner;

public class Ex05ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanny=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int time=scanny.nextInt();
		
		System.out.print(time+"초는");
		System.out.print(time/3600+"시간 ");
		System.out.print(time%3600/60+"분 ");
		System.out.print(time%60+"초입니다.");
		
		scanny.close();
	}
}
