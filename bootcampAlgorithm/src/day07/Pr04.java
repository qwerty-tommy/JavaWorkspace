package day07;

import java.util.Vector;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	private Vector<T> stack;

	public MyStack() {
		stack = new Vector<T>();
	}

	@Override
	public T pop() {
		if (stack.size() == 0)
			return null;
		return stack.remove(stack.size() - 1);
	}

	@Override
	public boolean push(T ob) {
		return stack.add(ob);
	}
}

public class Pr04 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i = 0; i < 10; i++)
			stack.push(i);
		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}
	}
}