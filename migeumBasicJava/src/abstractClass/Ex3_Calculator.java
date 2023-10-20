package abstractClass;

import java.util.Scanner;

abstract class AbstractCalculator {
	int x;
	int y;
	String op;

	abstract int calc();

	abstract int plus();

	abstract int minus();

	abstract int multipulication();

	abstract int division();
	
	public AbstractCalculator(int x, int y, String op) {
		this.x=x;
		this.y=y;
		this.op=op;
	}
}

class Calculator extends AbstractCalculator {
	int calc() {
		switch (op) {
		case "+":
			return plus();
		case "-":
			return minus();
		case "*":
			return multipulication();
		case "/":
			return division();
		default:
			return 0;
		}
	}

	int plus() {
		return (x + y);
	}

	int minus() {
		return (x - y);
	}

	int multipulication() {
		return (x * y);
	}

	int division() {
		return (x / y);
	}
	
	Calculator(int x, int y, String op){
		super(x, y, op);
	}
}

public class Ex3_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		String op;

		while (true) {
			System.out.print("두 개의 수를 입력하세요 : ");
			num1 = sc.nextInt();
			if (num1 == -1) {
				break;
			}
			num2 = sc.nextInt();
			sc.nextLine();

			System.out.print("연산자를 입력하세요 : ");
			op = sc.nextLine();

			Calculator ac = new Calculator(num1,num2,op);
			
			System.out.println(num1+op+num2+"="+ac.calc());
		}
		sc.close();
	}

}
