import java.util.Arrays;

public class maxMinArrangement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans[] = arrange(arr);
        for(int n : ans)
            System.out.print(n+" ");;
    }

    public static int[] arrange(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int temp[] = new int[n];
        int l=0,r=n-1,k=0;
        while(l<r){
            temp[k++]=arr[r--];
            temp[k++]=arr[l++];
        } 
        if((n&1) == 1) temp[n-1] = arr[n/2];
        return temp;
    }
}
