package com.demo.linkedlist;

public class CircularLinkedList {
     Node head;
     class Node{
    	 int data;
    	 Node next;
    	 public Node(int value) {
    		 this.data=value;
    		 this.next=null;
    	 }
     }
    	 
    	 public void addNode(int value) {
    		 Node newNode=new Node(value);
    		 if(head==null) {
    			 head=newNode;
    			
    		 }else {
	    		 Node temp=head;
	    		 while(temp.next!=head) {
	    			 temp=temp.next;
	    		 }
	    		 temp.next=newNode;
	    		 
    		 }
    		 newNode.next=head;
    	 }
     
    	 public void addByPosition(int pos,int val) {
    		 if(head==null) {
    			 System.out.println("list is empty");
    		 }else {
    			 Node newNode=new Node(val);
    			 //add node before first node
    			 if(pos==1) {
    				 Node temp=head;
    				 
    				 //will place temp at the last node
    				 while(temp.next!=head) {
    					 temp=temp.next;
    				 }
    				 newNode.next=head;
    				 head=newNode;
    				 temp.next=head;
    				 
    			 }else {
    				 Node temp=head;
    				 int count=0;
    				 for(int i=0;temp.next!=head && i<pos-2;i++) {
    					 temp=temp.next;
    					 count++;
    				 }
    				 if(count==pos-2) {
    					 newNode.next=temp.next;
    					 temp.next=newNode;
    				 }else {
    					 System.out.println("position is out of bounds");
    				 }
    			 }
    		 }
    	 }
    	 
    public void deleteByPosition(int pos) {
    	if(head==null) {
    		System.out.println("list is empty");
    	}else {
    		if(pos==1) {
    			//place the temp at the last node
    			Node temp=head;
    			while(temp.next!=head) {
    				temp=temp.next;
    			}
    			temp.next=head.next;
    			head.next=null;
    			head=temp.next;
    		}else {
    			Node prev=null;
    			Node temp=head;
    			int count=0;
    			for(int i=0;temp.next!=head && i<pos-1;i++) {
    				prev=temp;
    				temp=temp.next;
    				count++;
    			}
    			if(count==pos-1) {
    				prev.next=temp.next;
    				temp.next=null;
    			}else {
    				System.out.println("position is out of bounds "+pos);
    			}
    			
    		}
    	}
    	
    }     
     public void displayData() {
    	 if(head==null) {
    		 System.out.println("list is empty");
    	 }else {
    		 Node temp=head;
    		 do{
    			 System.out.print(temp.data+",");
    			 temp=temp.next;
    		 }while(temp!=head);
    		 System.out.println();
    	 }
     }
}
