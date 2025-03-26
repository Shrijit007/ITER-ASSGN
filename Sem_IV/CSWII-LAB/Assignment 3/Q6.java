package Assignment_3;

import java.util.*;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 45, 37, 29, 46, 19 };
		Arrays.sort(arr);
		System.out.println("Sorted Array:" + Arrays.toString(arr));
		System.out.print("Enter an element to search:");
		int el = sc.nextInt();
		int ind = Arrays.binarySearch(arr, el);
		String res = (ind >= 0) ? ("Element found at " + ind) : ("Element not found.");
		System.out.println(res);
		System.out.print("Enter an index to view element: ");
        int searchIndex = sc.nextInt();
        try {
            System.out.println("Element at index " + searchIndex + ": " + arr[searchIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
	}
}
