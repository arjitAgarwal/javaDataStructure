package com.arjit.datastructure.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.arjit.datastructure.model.Node;
import com.arjit.datastructure.model.WrapperObject;

public class CheckBST {
	private static Random random = new Random();
	private static final int size = 10;
	private static final int max = 1000;
	
	public boolean checkBST(Node node) {
		return false;
	}
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		List<WrapperObject> objectList = new ArrayList<WrapperObject>();
    	for(int i = 0; i < size ; i++) {
    		objectList.add(new WrapperObject(random.nextInt(max)));
    	}
    	
    	for(WrapperObject object : objectList) {
    		binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, object);
    	}
    	
    	binarySearchTree.printInOrder(binarySearchTree.root);
	}

}
