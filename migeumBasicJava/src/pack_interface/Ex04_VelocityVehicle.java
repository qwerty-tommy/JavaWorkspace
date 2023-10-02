package pack_interface;

import java.util.Scanner;

interface Speed{
	public int init_speed= 10;
	public void speedUp();
	public void speedDown();
}

class Vehicle implements Speed{
	int current_speed;
	
	@Override
	public void speedUp() {
		current_speed+=10;
	}
	
	@Override
	public void speedDown() {
		current_speed--;	
	}
	
	public Vehicle(){
		current_speed=init_speed;
	}
}

public class Ex04_VelocityVehicle {

	public static void main(String[] args) {
		int flag;
		Scanner sc=new Scanner(System.in);
		Vehicle v=new Vehicle();
		
		while (true) {
			System.out.println("1.�ӷ��� �ø��ϴ� 2.�ӷ��� ���Դϴ�");
			
			flag=sc.nextInt();
			
			if (flag==1) {
				v.speedUp();
			} else if (flag==2) {
				v.speedDown();
			} else {
				break;
			}
			
			System.out.println("���� �ӷ��� "+v.current_speed);
		}
	
		
		sc.close();
	}
}
