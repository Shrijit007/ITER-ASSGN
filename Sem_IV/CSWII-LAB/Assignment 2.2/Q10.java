import java.util.HashMap;

public class Q10 {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 5, 2, 6, 10, 8};

        int missingNumber = findMissingNumber(array);
        System.out.println("The smallest positive number missing in the array is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int num : array) {
            numberMap.put(num, 1);
        }

        for (int i = 1; i <= 10; i++) {
            if (!numberMap.containsKey(i)) {
                return i;
            }
        }

        return -1;
    }
}