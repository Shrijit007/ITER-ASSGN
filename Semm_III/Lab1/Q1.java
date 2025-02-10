package Semm_III.Lab1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		System.out.println("Sum of array elements:" + sumOfNums(arr));
	}
	
	public static int sumOfNums(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
