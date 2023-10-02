package inheritance;

public class Product_Tv extends Product{
	Product_Tv(int price){
		super(price);
	}
	
	Product_Tv(){
		super();
		}
	
	public String toString() {
		return "Tv";
	}
}
