package playGround;

class Coordinate<T extends Number & Comparable<T>> implements Comparable<Coordinate<T>>{
	private T x;
	private T y;

	public Coordinate() {
		System.out.println(toString()+"No data");
	}

	public Coordinate(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public T getY() {
		return y;
	}
	
	@Override
	public int compareTo(Coordinate<T> o) {
	    return o.getX().compareTo(x);
	}
}

public class JungleGym {

}
