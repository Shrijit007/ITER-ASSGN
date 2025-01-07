import java.util.Arrays;

public class reductionArr {
    public static void main(String[] args) {
        int arr[] = {5,1,1,1,2,3,5};
        System.out.println(reduce(arr));
    }

    public static int reduce(int arr[]){
        Arrays.sort(arr);
        int reducer = arr[0],count = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-reducer > 0){
                reducer = arr[i];
                count++;
            }
        }
        return count;
    }
}
