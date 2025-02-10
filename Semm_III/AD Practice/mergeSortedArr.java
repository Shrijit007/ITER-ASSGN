public class mergeSortedArr {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {2,4,6,7};
        int arr[] = merge(arr1, arr2);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    public static int[] merge(int arr1[],int arr2[]){
        int j=0,k=0,l=0;
        int a = arr1.length, b = arr2.length;
        int arr[] = new int[a + b];
        while(j != a-1 && k != b-1){
            if(arr1[j] < arr2[k])
                arr[l++] = arr1[j++];
            else 
                arr[l++] = arr2[k++];
        }
        while(j<a) arr[l++] = arr1[j++];
        while(k<b) arr[l++] = arr2[k++];
        return arr;
    }
}
