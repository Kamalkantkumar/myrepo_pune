package com.technoelevate.collections.arraylist;

public class ArrayListCreation {
	private int position;
	private Object[] array;

	public ArrayListCreation(int arraySize) {
		array = new Object[arraySize];

	}

	public void add(Object obj) {
		array[position] = obj;
		position++;
	}

	public Object get(int index) {
		return array[index];

	}

	public int size() {
		return array.length;
	}

	@Override
	public String toString() {
		if (size() == 0) {
			return "[]";
		}
		String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];

		}
		string += "]";
		return string;

	}

}
