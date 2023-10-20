package _APIClass1;

class MyName{
	String objName;
	public MyName(String name) {
		objName=name;
	}
	
	@Override
	protected void finalize() throws Throwable {//throws..?	
		super.finalize();
		System.out.println(objName+"�� �Ҹ�Ǿ����ϴ�.");
	}
	
}

public class Pr13_finalize1 {

	public static void main(String[] args) {
		MyName obj1=new MyName("�ν��Ͻ�1");
		MyName obj2=new MyName("�ν��Ͻ�2");
		obj1=null;
		obj2=null;
		
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("gc start");
		System.gc();	//gc�� �̹� funfinalization�� ���� ��..
		System.out.println("runfinalization start");
		System.runFinalization();
	}

}
