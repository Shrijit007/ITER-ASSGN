
public class rotateArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotate(arr, 2);
        for(int n : arr)
            System.out.print(n + " ");
    }

    public static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void rotate (int arr[],int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
}
