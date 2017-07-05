package com.arjit.datastructure.sorting;

import java.util.List;

import com.arjit.datastructure.model.WrapperObject;
import com.arjit.datastructure.utils.WrapperObjectUtil;

public class BubbleSort {
	
	private List<WrapperObject> objectList;

	public BubbleSort(List<WrapperObject> objectList) {
		this.objectList = objectList;
	}

	public void sort() {
		for(WrapperObject object1 : objectList) {
			for(WrapperObject object2 : objectList) {
				if (WrapperObjectUtil.compareobject(object2, object1) == true) {
					WrapperObjectUtil.swapObject(object1, object2);
				}
			}
		}
		
		WrapperObjectUtil.displayObject(objectList);
	}

}
