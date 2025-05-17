package cpm.demo.stacksqueues;

public class MyQuesueList {
	Node front,rear;
	class Node{
		int data;
		Node next;
		public Node(int value) {
			this.data=value;
			this.next=null;
		}
	}
	public MyQuesueList() {
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		if(front==null) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}
	
	//add at the rear end
	public void enqueue(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			rear=newNode;
			front=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
		System.out.println("added succesfully");
	}
	
	//remove from front
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}else {
			Node temp=front;
			int num=front.data;
			front=front.next;
			temp.next=null;
			return num;
		}
	}
	
	public void displayData() {
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}

}
