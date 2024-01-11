package day07;

class GStack<T> {
	int top;
	T[] stack;

	@SuppressWarnings("unchecked")
	public GStack() {
		stack = (T[]) new Object[10];
	}

	public void push(T t) {
		stack[top++] = t;
	}

	public T pop() {
		T tmp = stack[--top];
		return tmp;
	}
}

public class Ex09 {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");

		for (int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());

		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);

		for (int n = 0; n < 3; n++)
			System.out.println(intStack.pop());
	}
}
