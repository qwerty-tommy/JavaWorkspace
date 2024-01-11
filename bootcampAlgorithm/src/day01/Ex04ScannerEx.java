package day01;

import java.util.Scanner;

public class Ex04ScannerEx {
	public static void main(String[] args) {
		//이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요
		Scanner scanny=new Scanner(System.in);
		
		System.out.println("이름 : ");
		System.out.println(scanny.next());
		
		System.out.println("도시 : ");
		System.out.println(scanny.next());
		
		System.out.println("나이 : ");
		System.out.println(scanny.nextInt());
		
		System.out.println("체중 : ");
		System.out.println(scanny.nextDouble());
		
		System.out.println("독신 : ");
		System.out.println(scanny.nextBoolean());
		
	}
}
