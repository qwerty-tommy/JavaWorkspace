import java.net.InetAddress;

public class Main {

	public static void main(String[] args) {
		InetAddress ip=null;
		try {
			ip=InetAddress.getByName("www.google.com");
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
