package com.arjit.datastructure.utils;

import java.util.List;

import com.arjit.datastructure.model.WrapperObject;

public class WrapperObjectUtil {
	
	public static boolean compareobject(WrapperObject object1, WrapperObject object2) {
		if (object1.object instanceof Long && object2.object instanceof Long) {
			Long firstNumber = Long.parseLong(object1.object.toString());
			Long secondNumber = Long.parseLong(object2.object.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1.object instanceof Double && object2.object instanceof Double) {
			Double firstNumber = Double.parseDouble(object1.object.toString());
			Double secondNumber = Double.parseDouble(object2.object.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1.object instanceof Integer && object2.object instanceof Integer) {
			Integer firstNumber = Integer.parseInt(object1.object.toString());
			Integer secondNumber = Integer.parseInt(object2.object.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1.object instanceof String && object2.object instanceof String) {
			String first = object1.object.toString();
			String second = object2.object.toString();
			if (first.compareTo(second) > 0) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void swapObject(WrapperObject object1, WrapperObject object2) {
		Object tempObject = object1.object;
		object1.object = object2.object;
		object2.object = tempObject;
	}
	
	public static void displayObject(List<WrapperObject> wrapperObjectList) {
		for(WrapperObject object : wrapperObjectList) {
			System.out.println(object.object.toString());
		}
		
		System.out.println("\n-------------------------\n");
	}

	public static boolean compareobject(Object object1, Object object2) {
		if (object1 instanceof Long && object2 instanceof Long) {
			Long firstNumber = Long.parseLong(object1.toString());
			Long secondNumber = Long.parseLong(object2.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1 instanceof Double && object2 instanceof Double) {
			Double firstNumber = Double.parseDouble(object1.toString());
			Double secondNumber = Double.parseDouble(object2.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1 instanceof Integer && object2 instanceof Integer) {
			Integer firstNumber = Integer.parseInt(object1.toString());
			Integer secondNumber = Integer.parseInt(object2.toString());
			if (firstNumber > secondNumber) {
				return true;
			}
		} else if (object1 instanceof String && object2 instanceof String) {
			String first = object1.toString();
			String second = object2.toString();
			if (first.compareTo(second) > 0) {
				return true;
			}
		}
		
		return false;
	}

}
