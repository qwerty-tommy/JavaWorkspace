package classAPI;

class MyName{
	String objName;
	public MyName(String name) {
		objName=name;
	}
	
	@Override
	protected void finalize() throws Throwable {//throws..?	
		super.finalize();
		System.out.println(objName+"이 소멸되었습니다.");
	}
	
}

public class Pr13_finalize1 {

	public static void main(String[] args) {
		MyName obj1=new MyName("인스턴스1");
		MyName obj2=new MyName("인스턴스2");
		obj1=null;
		obj2=null;
		
		System.out.println("프로그램을 종료합니다.");
		System.out.println("gc start");
		System.gc();	//gc에 이미 funfinalization이 있지 않..
		System.out.println("runfinalization start");
		System.runFinalization();
	}

}
