package cpm.demo.stacksqueues;

public class MyStackList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int value) {
			this.data=value;
			
		}
	}
	public MyStackList() {
		top=null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void push(int value) {
		Node newNode=new Node(value);
		if(!isEmpty()) {
			newNode.next=top;
		}
		top=newNode;
		System.out.println("pushed "+value);
	}
	
	public void displayData() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
			
		}
		System.out.println("stack is empty");
		return -1;
	}

}
