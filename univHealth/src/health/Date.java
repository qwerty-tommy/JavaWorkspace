package health;

public class Date implements Comparable<Date> {

	int year;
	int month;
	int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public int compareTo(Date o) {
		if (this.year != o.year) {
			return this.year - o.year;
		} else if (this.month != o.month) {
			return this.month - o.month;
		} else {
			return this.day - o.day;
		}
	}

	@Override
	public String toString() {
		return "" + year + "/" + month + "/" + day;
	}

	public String toFileString() {
		return "" + year + " " + month + " " + day;
	}
}
