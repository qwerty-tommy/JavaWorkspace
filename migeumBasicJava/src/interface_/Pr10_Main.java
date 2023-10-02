package interface_;

interface Stack {
	public int length();

	public Object pop();

	public boolean push(Object object);
}

class StringStack implements Stack {
	String stack[];
	private int end;


	public StringStack(int capacity) {
		stack = new String[capacity];
		 end = 0;
	}

	@Override
	public int length() {
		return stack.length;
	}

	@Override
	public Object pop() {
		if (end == 0) {
			System.out.println("stack empty");
		}
		
		return stack[--end];
	}

	@Override
	public boolean push(Object object) {
		if (end == stack.length - 1) {
			System.out.println("Stack full");
		}
		stack[end++] = (String) object;

		return false;
	}

}

public class Pr10_Main {

	public static void main(String[] args) {
		StringStack stringStack=new StringStack(100);
		
		stringStack.push("hello");
		stringStack.push("world");
		stringStack.push("bye");
		stringStack.push("world");
		
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
	}

}
