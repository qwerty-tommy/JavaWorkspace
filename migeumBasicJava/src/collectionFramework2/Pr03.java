package collectionFramework2;

interface StackIF {
	boolean isEmpty();

	boolean isFull();

	void push(String data);

	void pop();

	void peek();

	void clear();
}

class Node {
	String data;
	Node next;

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return data + ' ';
	}
}

class LinkedListStack implements StackIF {
	Node top;

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public boolean isFull() { // 무쓸모..?
		return false;
	}

	@Override
	public void push(String data) {
		Node newnode = new Node(data);
		newnode.next = top;
		top = newnode;
	}

	@Override
	public void pop() {
		if (!isEmpty()) {
			top = top.next;
		}else {
			System.out.println("Stack is empty");
		}
	}

	@Override
	public void peek() {
		top = top.next;
		System.out.print(top);
	}

	@Override
	public void clear() {
		top = null;
	}

	@Override
	public String toString() {
		String buf = "";
		Node cur = top;

		while (cur!= null) {
			buf += cur.toString();
			cur = cur.next;
		}

		return buf;
	}
}

public class Pr03 {
	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		
		stack.pop();
		stack.push("a");
		System.out.println(stack);
		stack.push("b");
		System.out.println(stack);
		stack.push("c");
		System.out.println(stack);
		stack.push("d");
		System.out.println(stack);
		stack.push("e");
		System.out.println(stack);
		System.out.println("Stack is full..?");
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}
}
