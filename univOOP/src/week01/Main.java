//package week01;
//
//class ListQueueNode { // 전체적으로 camel 코딩 스타일은 잘 지킴
//	private String data;
//	public ListQueueNode link;
//
//	public ListQueueNode() {
//		this.data = null;
//		this.link = null;
//	}
//
//	public ListQueueNode(String data) {
//		this.data = data;
//		this.link = null;
//	}
//
//	public ListQueueNode(String data, ListQueueNode link) {
//		this.data = data;
//		this.link = link;
//	}
//
//	public String getData() {
//		return this.data;
//	}
//}
//
//class LinkedListQueue {
//
//	private ListQueueNode head;
//	private ListQueueNode front;
//	private ListQueueNode rear;
//	private int queueSize;
//
//	public LinkedListQueue(int size) {
//		head = null;
//		front = null;
//		rear = null;
//		this.queueSize = size;
//	}
//
//	public boolean isEmpty() { // 진위식을 바로 리턴해라 - 잘 지켰음
//		return (front == null && rear == null);
//	}
//
//	public boolean isFull() {
//		if (isEmpty()) {
//			return false;
//		}
//
//		// 불필요한 비교 조건식을 지워라 - 로직에 영향을 주지 않는 else문 삭제
//		int nodeCount = 0;
//		ListQueueNode tempNode = head;
//
//		while (tempNode.link != null) {
//			++nodeCount;
//			tempNode = tempNode.link;
//		}
//
//		return (this.queueSize - 1 == nodeCount);
//
//	}
//
//	public void enqueue(String data) {
//		ListQueueNode newNode = new ListQueueNode(data);
//
//		if (isFull()) { // If 문은 대칭적으로 작성하라
//			System.out.println("Queue is full!");
//			return;
//		}
//		if (isEmpty()) {	//조건식 앞뒤로 공백추가
//			this.head = newNode;
//			this.front = this.head;
//			this.rear = this.head;
//		} else {
//			rear.link = newNode;
//			rear = newNode;
//		}
//	}
//
//	public void dequeue() {
//		ListQueueNode tempNode;
//
//		if (isEmpty()) { // If 문은 대칭적으로 작성하라
//			System.out.println("Queue is empty!");
//			return;
//		}
//		if (front.link == null) {
//			head = null;
//			front = null;
//			rear = null;
//		} else {
//			tempNode = front.link;
//			head = tempNode;
//			front.link = null;
//			front = head;
//		}
//	}
//
//	public void peek() {
//		if (isEmpty()) { // 조건식 앞뒤로 공백추가
//			System.out.println("Queue is empty!");
//			return;
//		}
//		// 불필요한 비교 조건식을 지워라 - 로직에 영향을 주지 않는 else문 삭제
//		System.out.println(front.getData());
//	}
//
//	public void clear() {
//		if (isEmpty()) { // 조건식 앞뒤로 공백추가
//			System.out.println("Queue is empty!");
//			return;
//		}
//		// 불필요한 비교 조건식을 지워라 - 로직에 영향을 주지 않는 else문 삭제
//		head = null;
//		front = null;
//		rear = null;
//	}
//
//	public ListQueueNode searchNode(String data) {
//		ListQueueNode tempNode = this.front;
//
//		while (tempNode != null) {
//			if (data.equals(tempNode.getData())) {
//				return tempNode;
//			}
//			// 불필요한 비교 조건식을 지워라 - 로직에 영향을 주지 않는 else문 삭제
//			tempNode = tempNode.link;
//		}
//
//		return tempNode;
//	}
//
//	public void printListQueue() {
//		if (isEmpty()) {
//			System.out.println("Queue is empty!");
//			return;
//		} else {
//			ListQueueNode tempNode = this.front;
//
//			while (tempNode != null) {
//				System.out.print(tempNode.getData() + " ");
//				tempNode = tempNode.link;
//			}
//			System.out.println();
//		}
//	}
//	
//	
//
//}
//
//class Main{	//객체로 구성된 프로그램을 만들기 위해서 메인함수와 큐 클래스를 분리함
//	void start() {	
//
//		int queueSize = 5;
//		LinkedListQueue listQueue = new LinkedListQueue(queueSize);
//	
//		listQueue.printListQueue();
//	
//		listQueue.enqueue("A");
//		listQueue.printListQueue();
//		listQueue.enqueue("B");
//		listQueue.printListQueue();
//		listQueue.enqueue("C");
//		listQueue.printListQueue();
//		listQueue.enqueue("D");
//		listQueue.printListQueue();
//		listQueue.enqueue("E");
//		listQueue.printListQueue();
//		listQueue.enqueue("F");
//		listQueue.printListQueue();
//	
//		System.out.println(listQueue.searchNode("D").getData());
//		listQueue.peek();
//	
//		listQueue.dequeue();
//		listQueue.printListQueue();
//		listQueue.dequeue();
//		listQueue.printListQueue();
//		listQueue.dequeue();
//		listQueue.printListQueue();
//		listQueue.dequeue();
//		listQueue.printListQueue();
//		listQueue.dequeue();
//		listQueue.printListQueue();
//	}
//
//	public static void main(String args[]) {
//		Main main=new Main();
//		main.start(); //start 함수를 이용해 static을 이용하지 않고 객체가 생성된 후 프로그램이 동작하게 만듬
//	}
//	
//}