public class sumContigous {
    public static void main(String[] args) {
        int arr[] = {3,4,-5,-7,2,5};
        System.out.println(maxSubArr(arr));
    }

    public static int maxSubArr (int arr[]){
        int sum = 0,max = Integer.MIN_VALUE;
        for(int n : arr){
            sum+=n;
            max = Math.max(max, sum);
            if(sum<0) sum = 0;
        }
        return max;
    }
}
