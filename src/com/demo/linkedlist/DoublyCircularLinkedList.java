package com.demo.linkedlist;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int val) {
			this.data=val;
			this.prev=null;
			this.next=null;
		}
	}
	
	public void addNode(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			newNode.next=newNode;
			newNode.prev=newNode;
		}else {
			//temp ponting to the last node
			Node temp=head.prev;
			newNode.next=temp.next;
			temp.next=newNode;
			
			newNode.prev=temp;
			head.prev=newNode;
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
		Node temp=head;
		do {
			System.out.print(temp.data+",");
			temp=temp.next;
			
		}while(temp!=head);
		System.out.println();
		}
	}
	
	public void displayReverse() {
		Node temp=head.prev;
		do {
			System.out.print(temp.data+",");
			temp=temp.prev;
		}while(temp!=head.prev);
		System.out.println();
	}
	
	public void addByPosition(int pos,int value) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			Node newNode=new Node(value);
			if(pos==1) {
				newNode.prev=head.prev;
				newNode.next=head;
				head.prev.next=newNode;
				head.prev=newNode;
				head=newNode;
			}else {
				int count=0;
				for(int i=0;temp.next!=head && i<pos-2;i++) {
					temp=temp.next;
					count++;
				}
				if(count==pos-2) {
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next.prev=newNode;
					temp.next=newNode;
				}else {
					System.out.println("position ou of bounds");
				}
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				//second node prev
				head.next.prev=head.prev;
				//last nodes next
				head.prev.next=head.next;
				head=head.next;
				temp.next=null;
				
			}else {
				int count=0;
				for(int i=0;temp.next!=head && i<pos-1;i++) {
					temp=temp.next;
					count++;
				}
				if(count==pos-1) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.next=null;
					temp.prev=null;
				}else {
					System.out.println("position out of bounds "+pos);
				}
			}
		}
		
	}

}
