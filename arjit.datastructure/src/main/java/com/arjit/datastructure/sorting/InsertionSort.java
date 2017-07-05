package com.arjit.datastructure.sorting;

import java.util.List;

import com.arjit.datastructure.model.WrapperObject;
import com.arjit.datastructure.utils.WrapperObjectUtil;

public class InsertionSort {
	private List<WrapperObject> objectList;

	public InsertionSort(List<WrapperObject> objectList) {
		this.objectList = objectList;
	}

	public void sort() {
		int size = objectList.size();
		if (size > 2) {
			for(int i = 1 ; i < size; i++) {
				Object tempObject = objectList.get(i).object;
				int index = i - 1;
				while(index >= 0 && WrapperObjectUtil.compareobject(objectList.get(index).object, tempObject) == true) {
					objectList.get(index + 1).object = objectList.get(index).object;
					index --;
				}
				
				objectList.get(index + 1).object = tempObject;
			}
		}
		
		WrapperObjectUtil.displayObject(objectList);
	}

}
