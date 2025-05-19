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
	
	public void insertNode(int key) {
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
	
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			inorderTraversal(root.right);
		}
		
	}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}
	
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
			
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+",");
		}
		
	}
	
	public boolean search(int key) {
		return searchBinaryTree(root,key);
	}

	public boolean searchNonRecurssive(int key) {
		return searchBinaryTreenonrecurssive(root, key);
	}
	private boolean searchBinaryTree(Node root, int key) {
		if(root!=null) {
			if(root.data==key) {
				System.out.println("data found");
				return true;
			}
			else {
				if(root.data<key) {
					return searchBinaryTree(root.right,key);
				}else {
					return searchBinaryTree(root.left,key);
				}
			}
		}
		return false;
		
	}
	
	private boolean searchBinaryTreenonrecurssive(Node root, int key) {
		if(root!=null) {
			Node temp=root;
			while(temp!=null) {
				if(temp.data==key) {
					return true;
				}else if(temp.data<key) {   
					temp=temp.right;
				}else {
					temp=temp.left;
				}
			}
			return false;
		}
		return false;
		
	}
	
	
	
	

}
