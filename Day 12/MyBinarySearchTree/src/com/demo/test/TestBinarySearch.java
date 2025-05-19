package com.demo.test;

import com.demo.trees.MyBinarySearchTree;

public class TestBinarySearch {

	public static void main(String[] args) {
		MyBinarySearchTree ob=new MyBinarySearchTree();
		int[] arr= {15,4,3,6,10,12,5,34,23,12};
		for(int i=0;i<arr.length;i++){
			ob.insertNode(arr[i]);
		}
		ob.inorder();
		
		ob.preorder();
		ob.postorder();
		System.out.println("found : 10"+ob.search(10));
		System.out.println("found : 17"+ob.search(17));
		System.out.println("found : 10"+ob.searchNonRecurssive(10));
		System.out.println("found : 17"+ob.searchNonRecurssive(17));
	}

}
