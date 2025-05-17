package cpm.demo.stacksqueues;



public class MyStackListGeneric<T> {
	Node top;
	class Node{
		T data;
		Node next;
		public Node(T value) {
			this.data=value;
			
		}
	}
	public MyStackListGeneric() {
		top=null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void push(T value) {
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
	
	public T pop() {
		if(!isEmpty()) {
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
			
		}
		System.out.println("stack is empty");
		return null;
	}

}
