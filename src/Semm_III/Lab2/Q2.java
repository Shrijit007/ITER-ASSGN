package Semm_III.Lab2;

import java.util.Scanner;

public class Q2 {
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
        int m = smallestMissing(arr);
        System.out.println("Smallest missing number: "+m);
    }

    public static int smallestMissing(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            while(arr[i] >= 1 && arr[i] <= n && arr[arr[i] - 1] != arr[i]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}