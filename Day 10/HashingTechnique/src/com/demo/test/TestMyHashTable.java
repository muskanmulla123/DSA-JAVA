package com.demo.test;

import cpm.demo.stacksqueues.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
		MyHashTable ob=new MyHashTable();
		ob.insertData(50);
		ob.insertData(51);
		ob.insertData(30);
		ob.insertData(24);
		ob.insertData(54);
		ob.insertData(33);
		ob.insertData(35);
		ob.insertData(52);
		ob.insertData(42);
		ob.displayData();
		ob.searchData(24);
		ob.searchData(51);
		ob.searchData(100);

	}

}
