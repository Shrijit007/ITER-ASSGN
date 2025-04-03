package com.csw2.collection_collections;
import java.util.*;

public class ArraysCollections {
	public static void main(String[] args) {
		String[] arr = {"a","b","w","c","z"};
		System.out.println("Before sort: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after sort:  " + Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "b"));
	}
}
