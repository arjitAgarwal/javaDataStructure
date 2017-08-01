package com.arjit.datastructure;

public class Stack {
	class Node {
		int info;
		Node next;
	}
	
	Node top;
	
	Stack() {
		top = null;
	}
	
	public void push(int x) {
		Node tempNode = top;
		top = new Node();
		top.info = x;
		top.next = tempNode;
	}
	
	public int pop() {
		if (top == null) {
			return -1;
		}
		
		Node tempNode = top;
		top = top.next;
		return tempNode.info;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(60);
		stack.push(40);
		
		
		System.out.println(stack.pop());
		
		
		
		
		
		
	}

}
