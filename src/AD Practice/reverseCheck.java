public class reverseCheck {
    public static void main(String[] args) {
        int arr[] = {1,2,6,5,4,3,7,9,8};
        revSorted(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }
        
    }

    public static void revSorted(int arr[]){
        while (isSorted(arr)!=-1)
            reverse(arr, isSorted(arr), revEnd(arr));
    }

    public static int isSorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
                return i;
        }
        return -1;
    }

    public static int revEnd(int arr[]){
        int l = isSorted(arr),r = -1;
        if(l!=-1){
            for(int i=l;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    r=i;
                    break;
                }
            }
        }
        return r;
    }

    public static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
