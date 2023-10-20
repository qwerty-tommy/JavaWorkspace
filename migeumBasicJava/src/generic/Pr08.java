package generic;

import java.util.ArrayList;
import java.util.Scanner;

class MyStack<T> {
	ArrayList<T> storage = new ArrayList<>();

	public MyStack() {
		storage.clear();
	}

	void push(T input) {
		storage.add(input);
	}

	T pop() {
		T tmp = storage.get(storage.size() - 1);
		storage.remove(storage.size() - 1);
		return tmp;
	}

	Boolean isEmpty() {
		return storage.isEmpty();
	}

	Boolean isFull() {
		return false;
	}
}

public class Pr08 {

	public static void main(String[] args) {
		Integer flag;
		Scanner scanner = new Scanner(System.in);
		MyStack<Integer> myStack = new MyStack<>();

		while (true) {
			System.out.println("1.push\t2.pop\t3.reverse\t4.exit");

			flag = scanner.nextInt();

			switch (flag) {
			case 1:
				if (!myStack.isFull())
					myStack.push(scanner.nextInt());
				break;
			case 2:
				if (!myStack.isEmpty())
					System.out.println(myStack.pop());
				break;
			case 3:
				myReverse(myStack);
				break;
			case 4:
				System.out.println("Terminated");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}

	private static <T> void myReverse(MyStack<T> myStack) {
		ArrayList<T> tmp = new ArrayList<T>();

		while (!myStack.isEmpty()) {
			tmp.add(myStack.pop());
		}

		myStack.storage = tmp;
	}

}
