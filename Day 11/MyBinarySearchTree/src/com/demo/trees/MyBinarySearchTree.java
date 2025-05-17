package com.demo.trees;

public class MyBinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int value) {
			this.data=value;
			this.left=null;
			this.right=null;
		}
	}
	public MyBinarySearchTree() {
		root=null;
	}
	
	public void insertNode(Node root,int key) {
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode=new Node(key);
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(key<root.data) {
				root.left=insertData(root.left,  key);
			}else {
				root.right=insertData(root.right,key);
			}
			return root;
		}
		
	}

}
