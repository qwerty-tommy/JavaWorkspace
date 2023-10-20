package inheritance;

public class NamedCircle extends Circle{
	String name;
	public NamedCircle() {}
	public NamedCircle(int r, String name) {
		super(r);
		this.name=name;
		
	}

}
