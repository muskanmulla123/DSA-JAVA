package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import cpm.demo.stacksqueues.MyStackListGeneric;

public class TestMystackListGeneric {

	public static void main(String[] args) {
		MyStackListGeneric<Integer> ob=new MyStackListGeneric<>();
		ob.push(30);
		ob.push(20);
		ob.push(10);
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		
		MyStackListGeneric<String> ob1=new MyStackListGeneric<>();
		ob1.push("test");
		ob1.push("Hello");
		ob1.push("check");
		System.out.println(ob1.pop());
		System.out.println(ob1.pop());
		System.out.println(ob1.pop());
		System.out.println(ob1.pop());
		
		//to print word os strings in reverse order
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr string with spaces");
		String s=sc.nextLine();
		String[] sarr=s.split(" ");
		MyStackListGeneric<String> ob2=new MyStackListGeneric<String>();
		System.out.println(Arrays.toString(sarr));
		for(int i=0;i<sarr.length;i++) {
			ob2.push(sarr[i]);
		}
		while(!ob2.isEmpty()) {
			System.out.println(ob2.pop());
		}

	}

}
