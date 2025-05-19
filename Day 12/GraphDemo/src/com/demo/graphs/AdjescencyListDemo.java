package com.demo.graphs;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.stacks.MyQuesueList;
import com.demo.stacks.MyStackListGeneric;

public class AdjescencyListDemo {
	Node[] heads;
	class Node{
		int data;
		//int weight;
		Node next;
		public Node(int value) {
			this.data=value;
			this.next=null;
		}
	}
	public AdjescencyListDemo(int v){
		heads=new Node[v];
	}
	
	public void addGraph() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<heads.length;i++) {
			for(int j=0;j<heads.length;j++) {
				System.out.println("edage "+i+"--->"+j+" : ");
				int num=sc.nextInt();
				if(num==1) {
					//add j th node in i list
					Node newNode=new Node(j);
					if(heads[i]==null) {
						heads[i]=newNode;
					}else {
						newNode.next=heads[i];
						heads[i]=newNode;
					}
			}
		}
	}
	}
	
	public void displaydata() {
		for(int i=0;i<heads.length;i++) {
			System.out.print("Node : "+i+"--->");
			Node temp=heads[i];
			while(temp!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print("null\n");
		}
	}
	
	public void dfsTraversal(int n) {
		MyStackListGeneric<Integer> mystack=new MyStackListGeneric<Integer>();
		boolean[] visited=new boolean[heads.length];
		mystack.push(n);
		int[] mydfs=new int[heads.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		int count=0;
		while(!mystack.isEmpty()) {
			int d=mystack.pop();
			if(!visited[d]) {
				//mark it as visited
				visited[d]=true;
				mydfs[count]=d;
				count++;
				//add all non visited adjescent vertices in the stack
				Node temp=heads[d];
				while(temp!=null) {
					if(!visited[temp.data]) {
						mystack.push(temp.data);
					}
					temp=temp.next;
				}
						
			}
			mystack.displayData();
			System.out.println("-------------------");
		}
		
		System.out.println(Arrays.toString(mydfs));
	}
	public void bfsTraversal(int n) {
		MyQuesueList myqueue=new MyQuesueList();
		boolean[] visited=new boolean[heads.length];
		myqueue.enqueue(n);
		int[] mybfs=new int[heads.length];
		for(int i=0;i<visited.length;i++) {
			visited[i]=false;
		}
		int count=0;
		while(!myqueue.isEmpty()) {
			int d=myqueue.dequeue();
			if(!visited[d]) {
				//mark it as visited
				visited[d]=true;
				mybfs[count]=d;
				count++;
				//add all non visited adjescent vertices in the stack
				Node temp=heads[d];
				while(temp!=null) {
					if(!visited[temp.data]) {
						myqueue.enqueue(temp.data);
					}
					temp=temp.next;
				}
						
			}
			myqueue.displayData();
			System.out.println("-------------------");
		}
		
		System.out.println(Arrays.toString(mybfs));
	}

}
