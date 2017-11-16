package com.arjit.datastructure.model;

public class Node {
	public WrapperObject wrapperObject;
	public Node left;
	public Node right;
	
	public Node(Object object) {
		this.wrapperObject = new WrapperObject(object);
		this.left = this.right = null;
	}
}
