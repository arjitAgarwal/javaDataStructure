package com.arjit.datastructure.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.arjit.datastructure.model.BinarySearchTree;
import com.arjit.datastructure.model.WrapperObject;
import com.arjit.datastructure.sorting.BubbleSort;
import com.arjit.datastructure.sorting.InsertionSort;
import com.arjit.datastructure.utils.WrapperObjectUtil;

public class BalancedBSTfromSortedArray {
	private static Random random = new Random();
	private static final int size = 10;
	private static final int max = 1000;
	private static final int randomStringSize = 25;

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		List<WrapperObject> objectList = new ArrayList<WrapperObject>();
    	for(int i = 0; i < size ; i++) {
    		objectList.add(new WrapperObject(random.nextInt(max)));
    	}
    	
    	WrapperObjectUtil.displayObject(objectList);
    	BubbleSort bubbleSort = new BubbleSort(objectList);
    	bubbleSort.sort();
    	
		for (int i = 0; i < objectList.size(); i++) {
			binarySearchTree.root = binarySearchTree.insert(binarySearchTree.root, objectList.get(i));
    	}
		
		binarySearchTree.printInOrder(binarySearchTree.root);
    	
    	objectList = new ArrayList<WrapperObject>();
    	for(int i = 0; i < size ; i++) {
    		objectList.add(new WrapperObject(RandomStringUtils.random(randomStringSize, true, false)));
    	}
    	
    	WrapperObjectUtil.displayObject(objectList);
    	
    	for (int i = 0; i < objectList.size(); i++) {
    		binarySearchTree.insert(binarySearchTree.root, objectList.get(i));
    	}
		
		binarySearchTree.printInOrder(binarySearchTree.root);
    	
	}
}
