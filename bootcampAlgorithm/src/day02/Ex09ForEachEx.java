package day02;

public class Ex09ForEachEx {
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	}
	
	public static void main(String[] args) {
		int[] num = { 1,2,3,4,5 };
		String[] names = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		
		for (String string : names) {
			System.out.print(string);
		}
		
		for (int n : num) {
			System.out.print(n);
		}
		
		for (Week string : Week.values()) {
			System.out.print(string+"요일 ");
		}
	}	
}
