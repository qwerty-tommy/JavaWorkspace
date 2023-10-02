package generic;

class Stack<T> {
	private Object[] stackArr;

	int size;
	int top = 0;

	public Stack(int size) {
		this.size = size;
		stackArr = new Object[size];
	}
	
	public int getTop() {
		return top;
	}

	public <T> void push(T element) {
		this.stackArr[top++] = element;
	}

	public <T> Object pop() {
		return this.stackArr[--top];
	}

	public <T> void show() {
		for (int i = 0; i < top; i++) {
			System.out.print(stackArr[i]);
		}
		System.out.println();
	}

}

public class Pr05_GstackReverse {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(10);
		Stack<Integer> reversedStack = new Stack<Integer>(10);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.show();
		reversedStack.show();
		
		reversedStack = reverse(stack);
		
		stack.show();
		reversedStack.show();

		//System.out.println(stack.pop());
	}

	public static <T> Stack<T> reverse(Stack<T> stack) {
		Stack<T>tmp=new Stack<T>(10);
		
		//System.out.println(stack.getTop());
		
		for (int i = 0; i < stack.getTop()+2; i++) {
			tmp.push(stack.pop());
		}
		
		return tmp;
	}

}
