package cpm.demo.stacksqueues;

public class MyStackArray {
	int[] arr;
	int top;
	public MyStackArray() {
		arr=new int[5];
		top=-1;
	}
	public MyStackArray(int size) {
		arr=new int[size];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void  push(int value) {
		if(!isFull()) {
			top++;
			arr[top]=value;
		}else {
			System.out.println("stack is full");
		}
	}
	public int  pop() {
		if(!isEmpty()) {
			int num=arr[top];
			top--;
			return num;
		}else {
			System.out.println("stack is empty");
			return -1;
		}
		
	}

}
