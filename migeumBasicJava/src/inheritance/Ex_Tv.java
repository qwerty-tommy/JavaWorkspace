package inheritance;

import java.util.Scanner;

public class Ex_Tv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CaptionTv ct = new CaptionTv(false, 0, 0);
        int n;
		while (true) {
			System.out.println("--menu--");
			System.out.println("1. power(1:on/0:off)");
			System.out.println("2. channel(1:up/0:down)");
			System.out.println("3. volume(1:up/0:down)");
			System.out.println("4. quit");
             n=sc.nextInt();
			switch (n) {
			case 1:		
				if(sc.nextInt()==1) {ct.powerOn();}
				else {ct.powerOff();}
				break;
			case 2:
				if(sc.nextInt()==1) {ct.channelUp();}
				else {ct.channelDown();}
				break;
			case 3:
				if(sc.nextInt()==1) {ct.volumeUp();}
				else {ct.volumeDown();}
				break;
			}	
			if(n==4)
				break;
			System.out.println(ct);
		}
		sc.close();
	}
}
