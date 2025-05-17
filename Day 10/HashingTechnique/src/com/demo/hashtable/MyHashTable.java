package com.demo.hashtable;

public class MyHashTable {
	Node[] heads;
      class Node{
    	  int data;
    	  Node next;
    	  public Node(int val) {
    		 this.data=val;
    		 this.next=null;
    	  }
      }
      public MyHashTable() {
    	  heads=new Node[5];
      }
      public MyHashTable(int size) {
    	  heads=new Node[size];
      }
      
      public void insertData(int num) {
    	  Node newNode=new Node(num);
    	  //find bucket number
    	  int pos=num%heads.length;
    	  //if bucket is empty
    	  if(heads[pos]==null) {
    		  heads[pos]=newNode;
    	  }else {//if bucket is not empty, then add at head
    		  newNode.next=heads[pos];
    		  heads[pos]=newNode;
    	  }
      }
      
      public boolean searchData(int num) {
    	//find bucket number
    	int pos=num%heads.length;
    	if(heads[pos]==null) {
    		System.out.println("bucket is empty, number not found");
    		return false;
    	}else {
    		Node temp=heads[pos];
    		while(temp!=null) {
    			if(temp.data==num) {
    				System.out.println("number found "+num+ " in bucket "+pos);
    				return true;
    			}
    			temp=temp.next;
    		}
    		System.out.println("data not found "+ num + " in bucket -1");
    		return false;
    	}
      }
      
      public void displayData() {
    	  for(int i=0;i<heads.length;i++) {
    		  Node temp=heads[i];
    		  System.out.print(i+"---->");
    		  while(temp!=null) {
    			  System.out.print(temp.data+"---->");
    			  temp=temp.next;
    		  }
    		  System.out.print("null\n");
    		  
    		  
    	  }
      }
      
      
      
      
}
