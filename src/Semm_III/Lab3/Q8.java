
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing smallest +ve number: " + missingNum(arr, 0, n - 1));
    }

    public static int missingNum(int arr[], int start, int end) {
        if (start > end) return start + 1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == mid + 1) return missingNum(arr, mid + 1, end);
        else return missingNum(arr, start, mid - 1);
    }
}