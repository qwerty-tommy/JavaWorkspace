package _APIClass1;

public class Pr21_currentTime {

	public static void main(String[] args) {
		long time1= System.nanoTime();
		
		int sum=0;
		for (int i = 0; i < 1000000000; i++) {
			sum+=1;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000000������ ��: "+sum);
		System.out.println("��꿡 "+ (time2-time1)+" �����ʰ� �ҿ�Ǿ����ϴ�.");
		System.out.println("��꿡 "+ (time2-time1)/1000000000+" �ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
