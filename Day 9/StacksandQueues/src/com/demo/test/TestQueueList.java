package com.demo.test;

import cpm.demo.stacksqueues.MyQuesueList;

public class TestQueueList {
public static void main(String[] args) {
	MyQuesueList ob=new MyQuesueList();
	ob.enqueue(10);
	ob.enqueue(20);
	ob.enqueue(30);
	ob.displayData();
	while(!ob.isEmpty()) {
		System.out.println(ob.dequeue());
	}
}
}
