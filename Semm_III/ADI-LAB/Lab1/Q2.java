package Semm_III.Lab1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		minAndMax(arr);
	}
	
	public static void minAndMax(int arr[]) {
		int min=arr[0],max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Min: "+ min + " Max: " + max );
	}
}
