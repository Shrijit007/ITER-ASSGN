package Semm_III.Lab2;

import java.util.Scanner;

public class Q3 {
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
        int arr1[] = maxMinArrangement(arr);
        System.out.println("Max Min Arrangement: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
    }

    public static int[] maxMinArrangement(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int start = 0, end = n-1;
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                temp[i] = arr[end];
                end--;
            }else{
                temp[i] = arr[start];
                start++;
            }
        }
        return temp;
    }
}
