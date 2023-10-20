package exceptionHandling;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	
}

public class Ex03_average {

	public static void main(String[] args) throws NegativeNumberException {
		Scanner sc=new Scanner(System.in);
		int score1;
		int score2;
		int score3;
		
		System.out.println("점수 3개 입력하시오");
		score1=sc.nextInt();
		score2=sc.nextInt();
		score3=sc.nextInt();
		
		try {
			if (score1<0||score2<0||score3<0) {
				throw new NegativeNumberException();
			}
				
		} catch (NegativeNumberException e) {
			// TODO: handle exception
			System.out.println("음수오류 발생!");
		}
		
	}

}
