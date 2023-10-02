package classAPI;

public class Pr21_currentTime {

	public static void main(String[] args) {
		long time1= System.nanoTime();
		
		int sum=0;
		for (int i = 0; i < 1000000000; i++) {
			sum+=1;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000000까지의 합: "+sum);
		System.out.println("계산에 "+ (time2-time1)+" 나노초가 소요되었습니다.");
		System.out.println("계산에 "+ (time2-time1)/1000000000+" 초가 소요되었습니다.");
	}

}
