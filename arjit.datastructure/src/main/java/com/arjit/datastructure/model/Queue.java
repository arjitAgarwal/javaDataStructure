package com.arjit.datastructure.model;

public class Queue {

	class Node {
		int info;
		Node next;
	}

	Node front;
	Node rear;

	Queue() {
		front = rear = null;
	}

	public void enqueue(int x) {
		Node node = new Node();
		node.info = x;
		node.next = null;
		
		if (rear == null) {
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		
		if (front == null) {
			front = rear;
		}
	}

	public int dequeue() {
		if (front == null) {
			return -1;
		}

		Node tempNode = front;
		front = front.next;
		return tempNode.info;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(60);
		queue.enqueue(40);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
