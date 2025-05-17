package com.demo.test;

import cpm.demo.stacksqueues.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
		MyStackList ob=new MyStackList();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.displayData();
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
	}

}
