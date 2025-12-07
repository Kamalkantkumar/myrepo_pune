package com.technoelevate.mockpreparation;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int[] arr= {10,8,1,36,45,25,78,45,8};
		Arrays.sort(arr);
        for (int i : arr) {
			System.out.println(i);
		}
	}

}
