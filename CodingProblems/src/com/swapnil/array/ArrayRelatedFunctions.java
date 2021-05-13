package com.swapnil.array;

import java.util.HashSet;

public class ArrayRelatedFunctions {
	// function returns number of pairs in array with sum equal to sum.
	// Array: { 1, 4, 6, 6, 10, 8 }  Sum: 10
	
	public void getPairs(int[] array, int sum) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int i = 0;i < array.length;i++) {
			int temp = sum - array[i];
			
			if(hashSet.contains(temp)) {
				System.out.print("Pairs: (" + temp + ", " + array[i] + ")\n");
			}
			hashSet.add(array[i]);
		}
	}
}
