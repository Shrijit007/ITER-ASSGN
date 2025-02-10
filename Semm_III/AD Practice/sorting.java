public class sorting {
    public static void main(String[] args) {
        int arr[] = {4,23,7,3,9};
        insertionSort(arr);
        for(int n : arr)
            System.out.print(n+" ");
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
