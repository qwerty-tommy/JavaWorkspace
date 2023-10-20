package inheritance;

public class C extends B {
	int score1;
	int score2;
	int score3;

	public int getscore1() {
		return score1;
	}

	public int getscore2() {
		return score2;
	}

	public int getscore3() {
		return score3;
	}

	public C(String name, String num, int height, int weight, double sight, int score1, int score2, int score3) {
		super(name, num, height, weight, sight);
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	public int sum() {
		return (score1 + score2 + score3);
	}

	public int avg() {
		return (int) (score1 + score2 + score3) / 3;
	}

}
