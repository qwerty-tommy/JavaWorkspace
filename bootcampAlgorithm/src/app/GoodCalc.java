package app;

import lib.Calculator;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+4;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public Double avg(int[] a) {
		return 3.0;
	}

	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.avg(new int[] { 2, 3, 4 }));
	}
}
