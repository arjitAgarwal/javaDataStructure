package com.arjit.datastructure.model;

public class LinkedList {
	
	class Node {
		int info;
		Node next;
		
		Node(int x) {
			next = null;
			info = x;
		}
	}
	
	Node root;
	
	public LinkedList() {
		root = null;
	}
	
	public void insert(int x) {
		Node node = new Node(x);
		if (root == null) {
			root = node;
			return;
		} else {
			Node tempNode = root;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			
			tempNode.next = node;
		}
	}
	
	public void display() {
		System.out.println();
		Node tempNode = root;
		while(tempNode != null) {
			System.out.print(" " + tempNode.info);
			tempNode = tempNode.next;
		}
	}
	
	public void insertAfter(int info, int element) {
		Node tempNode = root;
		Node node = new Node(info);
		if (root == null) {
			return;
		}
		
		while(tempNode != null && tempNode.info != element) {
			tempNode = tempNode.next;
		}
		
		if (tempNode != null) {
			node.next = tempNode.next;
			tempNode.next = node;
		}
		
		display();
	}
	
	public void reverse() {
		Node currentNode = root;
		Node prevNode = null;
		Node nextNode = currentNode.next;
		if (root == null) {
			return;
		}
		
		while(nextNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		currentNode = prevNode;
		root = currentNode;
		
		display();
		
	}
	
	public void delete() {
		if (root == null) {
			System.out.println("Linked List is empty");
			return;
		}
		
		Node tempNode = root;
		Node prevNode = null;
		while(tempNode.next != null) {
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		
		tempNode = prevNode;
		tempNode.next = null;
		
		display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.insert(50);
		
		linkedList.display();
		
		linkedList.reverse();
		linkedList.insertAfter(35, 30);
		
		
		//linkedList.delete();
	}

}
