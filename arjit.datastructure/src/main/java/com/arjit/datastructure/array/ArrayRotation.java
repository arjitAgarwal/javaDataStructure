package com.arjit.datastructure.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {
	
	public static List<Integer> reverse(List<Integer> array, int starting, int end) {
		for(int  i = 0; i <= ((end - starting) / 2); i++) {
			int temp = array.get(starting + i);
			array.set(starting + i, array.get(end - i));
			array.set(end - i, temp);
		}
		
		return array;
	}
	
	public static void display(List<Integer> array) {
		System.out.println();
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
	}
	
	public static void leftRotate(List<Integer> array, int rotatingFactor) {
		int n = array.size();
		display(array);
		array = reverse(array, 0, (rotatingFactor % n)- 1);
		array = reverse(array, (rotatingFactor % n), n - 1);
		array = reverse(array, 0, n - 1);
		display(array);
	}

	public static void main(String[] args) {
		int n = 7;
		int rotationFactor = 2;
		List<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			array.add(i, i + 1);
		}
		
		leftRotate(array, rotationFactor);
	}

}
