package _APIClass1;

class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
}

public class Pr14_finalize2 {

	public static void main(String[] args) {
		Counter counter=null;
		
		for (int i = 0; i < 50; i++) {
			counter=new Counter(i);
			counter=null;
			System.gc();
		}
	}

}
