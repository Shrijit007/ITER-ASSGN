package Semm_III.Lab2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            arr[i] = c;
        }
        int m = sumContigous(arr);
        System.out.println("Max sum length: "+m);
    }

    public static int sumContigous(int arr[]){
        int maxEnd = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEnd = maxEnd+arr[i];
            if(maxEnd<0) maxEnd=0;
            if(maxEnd > max) max = maxEnd;
        }
        return max;
    }
}
