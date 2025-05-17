package com.demo.test;

import cpm.demo.stacksqueues.MyStackArray;

public class TestMyStackArray {

	public static void main(String[] args) {
		MyStackArray ob=new MyStackArray();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		ob.push(60);
		while(!ob.isEmpty()) {
			System.out.println(ob.pop());
		}

	}

}
