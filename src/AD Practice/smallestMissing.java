public class smallestMissing {
    public static void main(String[] args) {
        int arr[] = {7,8};
        System.out.println(missing(arr));
    }

    public static int missing(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for(int num : arr){
            if(num<=n && num>0)
                temp[num-1] = num;
        }
        for(int i = 0; i < n ; i++){
            if(temp[i]!=i+1)
                return i+1;
        }
        return n+1;
    }
}
