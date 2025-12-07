package com.technoelevte.builderdesignpattern;

public class ArrayClass {

	public void name(int len, int[] arr) {
		int i, temp, length = len;
		for (int j = 0; j <= length / 2; j++) {
			temp = arr[len - 1];
			arr[len - 1] = arr[j];
			arr[j] = temp;
			len -= 1;

		}
		for (int j : arr) {
			System.out.println(j);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 20, 30, 10, 40, 50 };
		ArrayClass arrayClass = new ArrayClass();
		arrayClass.name(arr.length, arr);
	}

}
