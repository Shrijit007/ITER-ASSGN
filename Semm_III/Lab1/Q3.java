package Semm_III.Lab1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotate(arr, k);
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
