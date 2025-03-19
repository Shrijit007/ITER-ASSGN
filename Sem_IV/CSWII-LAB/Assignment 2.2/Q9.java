import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }

        System.out.println("Repeating integers:");
        for (int num : repeating) {
            System.out.println(num);
        }
    }
}