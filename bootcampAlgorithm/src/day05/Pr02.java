package day05;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);

	abstract protected String getSrcString();

	abstract protected String getDestString();

	protected double ratio; // 비율

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Won2Dollar extends Converter {

	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

	@Override
	public void run() {
		super.run();
	}
}

class Km2Mile extends Converter {

	public Km2Mile(Double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

	@Override
	public void run() {
		super.run();
	}
}

public class Pr02 {
	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		// 1달러는 1200원
//		toDollar.run();
		Km2Mile toMile = new Km2Mile(1.6);
		// 1마일은 1.6km
		toMile.run();
	}

}
