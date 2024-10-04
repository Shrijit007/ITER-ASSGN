import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Max: "+find_max(arr, n));
			System.out.println("Max: "+find_min(arr, n));
	}

	public static int find_min(int arr[],int n) {
		if(n==1) return arr[0];
		else return Math.min(arr[n-1],find_min(arr, n-1));
	}

	public static int find_max(int arr[],int n) {
		if(n==1) return arr[0];
		else return Math.max(arr[n-1],find_max(arr, n-1));
	}
}
