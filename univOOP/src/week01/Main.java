//package week01;
//
//class ListQueueNode { // ��ü������ camel �ڵ� ��Ÿ���� �� ��Ŵ
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
//	public boolean isEmpty() { // �������� �ٷ� �����ض� - �� ������
//		return (front == null && rear == null);
//	}
//
//	public boolean isFull() {
//		if (isEmpty()) {
//			return false;
//		}
//
//		// ���ʿ��� �� ���ǽ��� ������ - ������ ������ ���� �ʴ� else�� ����
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
//		if (isFull()) { // If ���� ��Ī������ �ۼ��϶�
//			System.out.println("Queue is full!");
//			return;
//		}
//		if (isEmpty()) {	//���ǽ� �յڷ� �����߰�
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
//		if (isEmpty()) { // If ���� ��Ī������ �ۼ��϶�
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
//		if (isEmpty()) { // ���ǽ� �յڷ� �����߰�
//			System.out.println("Queue is empty!");
//			return;
//		}
//		// ���ʿ��� �� ���ǽ��� ������ - ������ ������ ���� �ʴ� else�� ����
//		System.out.println(front.getData());
//	}
//
//	public void clear() {
//		if (isEmpty()) { // ���ǽ� �յڷ� �����߰�
//			System.out.println("Queue is empty!");
//			return;
//		}
//		// ���ʿ��� �� ���ǽ��� ������ - ������ ������ ���� �ʴ� else�� ����
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
//			// ���ʿ��� �� ���ǽ��� ������ - ������ ������ ���� �ʴ� else�� ����
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
//class Main{	//��ü�� ������ ���α׷��� ����� ���ؼ� �����Լ��� ť Ŭ������ �и���
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
//		main.start(); //start �Լ��� �̿��� static�� �̿����� �ʰ� ��ü�� ������ �� ���α׷��� �����ϰ� ����
//	}
//	
//}