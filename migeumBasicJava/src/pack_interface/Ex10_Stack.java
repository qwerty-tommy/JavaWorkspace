package pack_interface;

interface Stack{
	public int length();
	public Object pop();
	public boolean push(Object ob);
}

class StringStack implements Stack{
	final int MAXSIZE=5;
	
	private String element[]=new String[MAXSIZE];
	private int length=0;
	 
	@Override
	public int length() {		
		return this.length;
	}
	
	@Override
	public Object pop() {
		if (length()==0||element[length-1]==null) {
			return null;
		} else {
			element[--length]=null;
			return element[length];
		}
	}
	
	@Override
	public boolean push(Object ob) {
		if (length()!=MAXSIZE) {
			element[length++]=(String)ob;
			return true;
		}
		return false;
	}
	
	public void print() {
		int tmp=length;
		for (int i = 0; i < element.length; i++) {
			System.out.print(element[i]);
		}
		System.out.println("\n");
		
		length=tmp;
	}
}

public class Ex10_Stack {

	public static void main(String[] args) {
		StringStack ss=new StringStack();
		ss.push("문자열1");
		ss.print();
		ss.push("문자열2");
		ss.print();
		ss.push("문자열3");
		ss.print();
		ss.push("문자열4");
		ss.print();
		ss.push("문자열5");
		ss.print();
		ss.pop();
		ss.print();
		ss.pop();
		ss.print();
		ss.pop();
		ss.print();
		ss.pop();
		ss.print();
		ss.pop();
		ss.print();
		
	}

}
