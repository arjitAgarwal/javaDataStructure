package com.arjit.datastructure.model;

import com.arjit.datastructure.utils.WrapperObjectUtil;

public class BinarySearchTree {

	public class Node {
		public WrapperObject wrapperObject;
		public Node left;
		public Node right;
		
		public Node(Object object) {
			this.wrapperObject = new WrapperObject(object);
			this.left = this.right = null;
		}
	}
	
	public Node root = null;
	
	public void printInOrder(Node root) {
		if (root != null) {
			printInOrder(root.left);	
			System.out.println(root.wrapperObject.object);
			printInOrder(root.right);
		}
	}
	
	public void printPreOrder(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.wrapperObject.object);
		
		if (root.left != null) {
			printPreOrder(root.left);
		}

		if (root.right != null) {
			printPreOrder(root.right);
		}
	}
	
	public void printPostOrder(Node root) {
		if (root == null) {
			return;
		}
		
		if (root.left != null) {
			printPostOrder(root.left);
		}

		if (root.right != null) {
			printPostOrder(root.right);
		}
		
		System.out.println(root.wrapperObject.object);
	}
	
	public Node insert(Node root, WrapperObject wrapperObject) {
		if (root == null) {
			root = new Node(wrapperObject.object);
			return root;
		}
			
		if (WrapperObjectUtil.compareobject(root.wrapperObject.object, wrapperObject.object)) {
			root.left = insert(root.left, wrapperObject);
		} else {
			root.right = insert(root.right, wrapperObject);
		}
		
		return root;
	}
}
