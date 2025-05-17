package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(12);
		clist.addNode(13);
		clist.addNode(15);
		clist.addNode(10);
		clist.addNode(3);
		clist.addNode(5);
		clist.addNode(7);
		clist.addNode(9);
		clist.displayData();
		clist.addByPosition(9, 23);
		clist.addByPosition(6, 67);
		clist.addByPosition(1, 80);
		clist.addByPosition(20, 33);
		clist.displayData();
		clist.deleteByPosition(11);
		clist.deleteByPosition(4);
		clist.deleteByPosition(1);
		clist.deleteByPosition(20);
		clist.displayData();
	}

}
